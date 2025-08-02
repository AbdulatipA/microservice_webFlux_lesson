package org.example.service_a;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/messages")
@AllArgsConstructor
public class MessageController {
    private final MessageService messageService;

    @PostMapping
    public Mono<Message> sendMessage(@RequestBody Message message) {
        return messageService.create(message);
    }

    @GetMapping()
    public Flux<Message> getAllMessages() {
        return messageService.findAll();
    }

    @GetMapping("/{content}")
    public Flux<Message> getMassageByText(@PathVariable String content) {
        return messageService.findByContent(content);
    }
}
