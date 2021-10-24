package com.messenger.revolution.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MessageDTO {

    private Long id;
    private String guid;
    private UserDTO senderId;
    private ConversationDTO conversationId;
    private String message_type;
    private String message;
    private Date created_at;
    private Date deleted_at;

    public MessageDTO(Long id, String guid, UserDTO senderId,
                      ConversationDTO conversationId, String message_type,
                      String message, Date created_at, Date deleted_at) {
        this.id = id;
        this.guid = guid;
        this.senderId = senderId;
        this.conversationId = conversationId;
        this.message_type = message_type;
        this.message = message;
        this.created_at = created_at;
        this.deleted_at = deleted_at;
    }
}
