package com.rmq.example.subscriber.service;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class SubscriberService {

    @RabbitListener(queuesToDeclare = @Queue("${rabbitmq.qeuename}"))
    public void receiveMessage(Message message){
        System.out.println(message);
    }

}
