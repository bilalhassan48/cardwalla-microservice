package com.zingpay.cardwalla.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Bilal Hassan on 23-Feb-21
 * @project cardwalla-microservice
 */

@Service
public class RabbitMQSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    @Value("${direct.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingkey}")
    private String routingkey;

    @Autowired
    public RabbitMQSender(RabbitTemplate rabbitTemplate) {
        super();
        this.rabbitTemplate = rabbitTemplate;
    }

    /*public void send(TransactionDto transactionDto) {
        rabbitTemplate.convertAndSend(exchange, routingkey, transactionDto);
        System.out.println("Send msg = " + transactionDto);
    }*/
}
