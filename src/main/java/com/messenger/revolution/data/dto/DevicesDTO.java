package com.messenger.revolution.data.dto;

import com.messenger.revolution.data.entities.enums.DevicesType;
import java.util.Date;

public class DevicesDTO {

    private Long id;

    private Integer usersId;
    private String deviceId;
    private DevicesType type;
    private String deviceToken;
    private Date createdAt;
    private Date updatedAt;

    public DevicesDTO(Long id, Integer usersId, String deviceId, DevicesType type, String deviceToken, Date createdAt, Date updatedAt) {
        this.id = id;
        this.usersId = usersId;
        this.deviceId = deviceId;
        this.type = type;
        this.deviceToken = deviceToken;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public DevicesType getType() {
        return type;
    }

    public void setType(DevicesType type) {
        this.type = type;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
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
