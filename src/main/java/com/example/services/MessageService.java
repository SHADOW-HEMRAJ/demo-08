package com.example.services;

import com.example.entities.Message;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MessageService {
    public ResponseEntity<Message> createMessage(Message message);
    public ResponseEntity<List<Message>> getAllMessage();
    public ResponseEntity<Message> getMessageById(String messageId);
}
