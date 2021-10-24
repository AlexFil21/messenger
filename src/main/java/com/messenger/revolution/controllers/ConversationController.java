package com.messenger.revolution.controllers;

import com.messenger.revolution.data.dto.ConversationDTO;
import com.messenger.revolution.data.services.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ConversationController {

    @Autowired
    ConversationService conversationService;

    @GetMapping("/conversations")
    public ResponseEntity allConversations(){
        List<ConversationDTO> dto = conversationService.conversations();
        return new ResponseEntity(dto, HttpStatus.OK);
    }


    @PostMapping(value = "/conversation")
    public ResponseEntity<ConversationDTO> conversation(@RequestBody ConversationDTO conversationDTO){
        ConversationDTO dto = conversationService.newConversation(conversationDTO);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

}
