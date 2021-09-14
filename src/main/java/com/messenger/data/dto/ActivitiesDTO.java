package com.messenger.data.dto;

import java.util.Date;

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

    public ActivitiesDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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
