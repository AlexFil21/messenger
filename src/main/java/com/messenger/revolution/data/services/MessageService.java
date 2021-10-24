package com.messenger.revolution.data.services;


import com.messenger.revolution.data.dto.MessageDTO;
import com.messenger.revolution.data.entities.Conversation;
import com.messenger.revolution.data.entities.Message;
import com.messenger.revolution.data.entities.User;
import com.messenger.revolution.data.entities.enums.MessageType;
import com.messenger.revolution.data.repository.ConversationRepo;
import com.messenger.revolution.data.repository.MessageRepo;
import com.messenger.revolution.data.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MessageService{

    @Autowired
    MessageRepo messageRepo;

    @Autowired
    ConversationService conversationService;

    @Autowired
    ConversationRepo conversationRepo;

    @Autowired
    UserService userService;

    @Autowired
    UserRepo userRepo;

    public List<MessageDTO> messages(){
        return messageRepo.getAllMessages().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public MessageDTO newMessage(MessageDTO messageDTO){
        User user = userRepo.findById(messageDTO.getSenderId().getId()).orElseThrow(()->new RuntimeException("user not found"));
        Conversation conversation = conversationRepo.findById(messageDTO.getConversationId().getId()).orElseThrow(()->new RuntimeException("conversation not found"));

        Message message = new Message(  messageDTO.getGuid(),
                                        MessageType.valueOf(messageDTO.getMessage_type().toUpperCase()),
                                        messageDTO.getMessage(), user, conversation
        );

        messageRepo.save(message);
        return convertToDTO(message);
    }

    public MessageDTO convertToDTO(Message message){
        return new MessageDTO(  message.getId(), message.getGuid(),
                                userService.convertToDTO(message.getSenderId()),
                                conversationService.convertToDTO(message.getConversationId()),
                                message.getMessageType().name(),
                                message.getMessage(), message.getCreatedAt(), message.getDeletedAt()
                            );
    }


}
