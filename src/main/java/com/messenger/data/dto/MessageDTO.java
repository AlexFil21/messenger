package com.messenger.data.dto;

import com.messenger.data.entities.enums.MessageType;

import java.util.Date;

public class MessageDTO {
    private Long id;

    private String guid;
    private Integer conversation_id;
    private Integer sender_id;
    private MessageType message_type;
    private String message;
    private Date created_at;
    private Date deleted_at;

    public MessageDTO(Long id, String guid, Integer conversation_id,
                      Integer sender_id, MessageType message_type,
                      String message, Date created_at, Date deleted_at) {
        this.id = id;
        this.guid = guid;
        this.conversation_id = conversation_id;
        this.sender_id = sender_id;
        this.message_type = message_type;
        this.message = message;
        this.created_at = created_at;
        this.deleted_at = deleted_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getConversation_id() {
        return conversation_id;
    }

    public void setConversation_id(Integer conversation_id) {
        this.conversation_id = conversation_id;
    }

    public Integer getSender_id() {
        return sender_id;
    }

    public void setSender_id(Integer sender_id) {
        this.sender_id = sender_id;
    }

    public MessageType getMessage_type() {
        return message_type;
    }

    public void setMessage_type(MessageType message_type) {
        this.message_type = message_type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getDeleted_at() {
        return deleted_at;
    }

    public void setDeleted_at(Date deleted_at) {
        this.deleted_at = deleted_at;
    }
}
