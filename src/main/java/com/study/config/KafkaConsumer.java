package com.study.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/3/1 14:42
 */
@Component
public class KafkaConsumer {

    /**
     * 定义此消费者接收topics = "demo"的消息，与controller中的topic对应上即可
     * @param record 变量代表消息本身，可以通过ConsumerRecord<?,?>类型的record变量来打印接收的消息的各种信息
     */
    @KafkaListener(groupId = "group-demo", topics = "iris")
    public void userListener(ConsumerRecord<?,?> record, Acknowledgment ack){
        System.out.println("topic:iris 收到了一条消息");
        System.out.println(record.topic());
        System.out.println(record.offset());
        System.out.println(record.value());
        ack.acknowledge();
    }

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(topics = "demo",groupId = "group-one")
    public void topic_one(ConsumerRecord<?, ?> record, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic){

        Optional message=Optional.ofNullable(record.value());
        if (message.isPresent()){
            Object msg=message.get();
            logger.info("被"+"iris"+"消费了： +++++++++++++++ Topic:" + topic+",Record:" + record+",Message:" + msg);
        }
    }

    @KafkaListener(topics = "iris",groupId="group-one")
    public void topic_two(ConsumerRecord<?, ?> record, @Header(KafkaHeaders.RECEIVED_TOPIC) String topic){

        Optional message=Optional.ofNullable(record.value());
        if (message.isPresent()){
            Object msg=message.get();
            logger.info("被"+"iris"+"1111消费了： +++++++++++++++ Topic:" + topic+",Record:" + record+",Message:" + msg);
        }
    }


}
