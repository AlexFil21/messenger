package com.messenger.data.dto;

import java.util.Date;

public class AccessDTO {

    private Long id;

    private Integer usersId;
    private Integer devicesId;
    private String token;
    private Date createdAt;
    private Date deletedAt;

    public AccessDTO(Long id, Integer usersId, Integer devicesId, String token, Date createdAt, Date deletedAt) {
        this.id = id;
        this.usersId = usersId;
        this.devicesId = devicesId;
        this.token = token;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getDevicesId() {
        return devicesId;
    }

    public void setDevicesId(Integer devicesId) {
        this.devicesId = devicesId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }
}
