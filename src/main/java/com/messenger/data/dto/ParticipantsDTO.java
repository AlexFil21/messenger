package com.messenger.data.dto;

import com.messenger.data.entities.enums.ParticipantsType;
import java.util.Date;

public class ParticipantsDTO {

    private Long id;
    private Integer conversationId;
    private Integer usersId;
    private ParticipantsType participantsType;
    private Date createdAt;
    private Date updatedAt;

    public ParticipantsDTO(Long id, Integer conversationId, Integer usersId, ParticipantsType participantsType, Date createdAt, Date updatedAt) {
        this.id = id;
        this.conversationId = conversationId;
        this.usersId = usersId;
        this.participantsType = participantsType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getConversationId() {
        return conversationId;
    }

    public void setConversationId(Integer conversationId) {
        this.conversationId = conversationId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public ParticipantsType getParticipantsType() {
        return participantsType;
    }

    public void setParticipantsType(ParticipantsType participantsType) {
        this.participantsType = participantsType;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
