package com.study.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

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
    public void userListener(ConsumerRecord<?,?> record){
        System.out.println("topic:iris 收到了一条消息");
        System.out.println(record.topic());
        System.out.println(record.offset());
        System.out.println(record.value());
    }

}
