package com.messenger.data.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class AttachmentsDTO {

    private Long id;
    private Integer messagesId;
    private String thumbUrl;
    private String fileUrl;
    private LocalDateTime createdAt;
    private Date updatedAt;

    public AttachmentsDTO(Long id, Integer messagesId, String thumbUrl, String fileUrl, LocalDateTime createdAt, Date updatedAt) {
        this.id = id;
        this.messagesId = messagesId;
        this.thumbUrl = thumbUrl;
        this.fileUrl = fileUrl;
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

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
