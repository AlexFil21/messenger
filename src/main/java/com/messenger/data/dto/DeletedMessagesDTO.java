package com.messenger.data.dto;

import java.util.Date;

public class DeletedMessagesDTO {

    private Long id;
    private Integer messagesId;
    private Integer usersId;
    private Date createdAt;
    private Date updatedAt;

    public DeletedMessagesDTO(Long id, Integer messagesId, Integer usersId, Date createdAt, Date updatedAt) {
        this.id = id;
        this.messagesId = messagesId;
        this.usersId = usersId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMessagesId() {
        return messagesId;
    }

    public void setMessagesId(Integer messagesId) {
        this.messagesId = messagesId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
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
