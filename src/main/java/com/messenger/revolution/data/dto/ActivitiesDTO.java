package com.messenger.revolution.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ActivitiesDTO {

    private Long id;
    private String activityType;
    private Integer activityId;
    private String title;
    private String detail;
    private Date createdAt;
    private Date updatedAt;

    public ActivitiesDTO(Long id, String activityType, Integer activityId,
                         String title, String detail, Date createdAt, Date updatedAt) {
        this.id = id;
        this.activityType = activityType;
        this.activityId = activityId;
        this.title = title;
        this.detail = detail;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
