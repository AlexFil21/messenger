package com.messenger.revolution.data.dto;

import java.util.Date;

public class DeletedConversationsDTO {

    private Long id;

    private Integer conversationId;
    private Integer usersId;
    private Date createdAt;

    public DeletedConversationsDTO(Long id, Integer conversationId, Integer usersId, Date createdAt) {
        this.id = id;
        this.conversationId = conversationId;
        this.usersId = usersId;
        this.createdAt = createdAt;
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
