package org.example.service_a;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
@AllArgsConstructor
public class MessageService {
    private MessageRepository messageRepository;

    public Mono<Message> create(Message message) {
        return messageRepository.save(message);
    }

    public Flux<Message> findAll() {
        return messageRepository.findAll();
    }

    public Flux<Message> findByContent(String content) {
       return messageRepository.findByContentContaining(content);
    }
}
