package com.example.servicesImpl;

import com.example.entities.Message;
import com.example.repositories.MessageRepository;
import com.example.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Override
    public ResponseEntity<Message> createMessage(Message message) {
        return new ResponseEntity<>(messageRepository.save(message), HttpStatus.CREATED);
    }
    @Override
    public ResponseEntity<List<Message>> getAllMessage() {
        return  new ResponseEntity<>(messageRepository.findAll(),HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Message> getMessageById(String messageId) {
        return new ResponseEntity<>(messageRepository.getById(messageId),HttpStatus.OK);
    }
}
