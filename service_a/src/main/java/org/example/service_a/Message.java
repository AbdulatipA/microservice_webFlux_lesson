package org.example.service_a;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(name = "messages")
public class Message {

    @Id
    private UUID id;

    private String text;
    private LocalDateTime dateMessage;
}
