package pe.cibertec.appgrupo8productor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.appgrupo8productor.service.NumberProducer;

@RestController
@RequiredArgsConstructor
public class NumberController {
    private final NumberProducer producer;

    @GetMapping("/send")
    public String send(@RequestParam String numbers) {
        producer.send(numbers);
        return "Lista enviada a RabbitMQ correctamente.";
    }
}
