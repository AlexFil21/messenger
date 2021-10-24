package com.messenger.revolution.data.services;

import com.messenger.revolution.data.dto.ConversationDTO;
import com.messenger.revolution.data.dto.UserDTO;
import com.messenger.revolution.data.entities.Conversation;
import com.messenger.revolution.data.entities.User;
import com.messenger.revolution.data.repository.ConversationRepo;
import com.messenger.revolution.data.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConversationService {

    @Autowired
    UserService userService;

    @Autowired
    UserRepo userRepo;

    @Autowired
    ConversationRepo conversationRepo;

    public List<ConversationDTO> conversations(){
        return conversationRepo.findAllConversations().stream().map(this::convertToDTO).collect(Collectors.toList());
    }

    public ConversationDTO newConversation(ConversationDTO conversationDTO){
        User user = userRepo.findById(conversationDTO.getCreatorId().getId()).orElseThrow(()->new RuntimeException("user not found"));
        Conversation conversation = new Conversation(conversationDTO.getTitle(), conversationDTO.getChannelId(), user);

        conversationRepo.save(conversation);
        return convertToDTO(conversation);
    }

    public ConversationDTO convertToDTO(Conversation conversation){
        return new ConversationDTO(
                conversation.getId(), conversation.getTitle(), userService.convertToDTO(conversation.getCreatorId()),
                conversation.getChannelId(), conversation.getCreatedAt(), conversation.getUpdatedAt(), conversation.getDeletedAt()
        );
    }

}
