package pe.cibertec.appgrupo8productor.service;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import pe.cibertec.appgrupo8productor.config.RabbitMQConfig;


@Service
@RequiredArgsConstructor
public class NumberProducer {
    private final RabbitTemplate rabbitTemplate;

    public void send(String numbers) {
        rabbitTemplate.convertAndSend(
                RabbitMQConfig.EXCHANGE,
                RabbitMQConfig.ROUTING_KEY,
                numbers
        );
    }
}