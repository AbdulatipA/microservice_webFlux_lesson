package org.example.service_a;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(name = "messages")
public class Message {

    @Id
    private UUID id;

    @Column("person_name")
    private String personName;

    private String content;

    @Column("date_message")
    private LocalDateTime dateMessage;
}
