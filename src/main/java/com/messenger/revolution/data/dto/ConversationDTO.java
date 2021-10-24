package com.messenger.revolution.data.dto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ConversationDTO {

    private Long id;
    private String title;
    private UserDTO creatorId;
    private String channelId;
    private Date createdAt;
    private Date updatedAt;
    private Date deletedAt;

    public ConversationDTO(Long id, String title, UserDTO creatorId,
                           String channelId, Date createdAt,
                           Date updatedAt, Date deletedAt) {
        this.id = id;
        this.title = title;
        this.creatorId = creatorId;
        this.channelId = channelId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }
}
