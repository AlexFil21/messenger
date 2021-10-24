package com.messenger.revolution.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
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
}
