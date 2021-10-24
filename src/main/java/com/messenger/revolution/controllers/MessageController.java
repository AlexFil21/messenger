package com.messenger.revolution.controllers;

import com.messenger.revolution.data.dto.MessageDTO;
import com.messenger.revolution.data.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    MessageService messageService;

    @GetMapping("/messages")
    public ResponseEntity getAllMessages() {
        List<MessageDTO> dto = messageService.messages();
        return  new ResponseEntity(dto, HttpStatus.OK);
    }


    @PostMapping("/message")
    public ResponseEntity user(@RequestBody MessageDTO messageDTO){
        MessageDTO dto = messageService.newMessage(messageDTO);
        return new ResponseEntity(dto, HttpStatus.CREATED);
    }
}
