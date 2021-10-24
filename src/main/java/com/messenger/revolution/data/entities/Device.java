package com.messenger.revolution.data.entities;

import com.messenger.revolution.data.entities.enums.DevicesType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "devices")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User userDevice;

    @Column(columnDefinition = "varchar(120)")
    private String deviceId;

    @Column
    @Enumerated(EnumType.STRING)
    private DevicesType type;

    @Column(columnDefinition = "varchar(120)")
    private String deviceToken;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @OneToOne(mappedBy = "deviceId")
    private Access access;

    public Device() {
    }

    public Device(String deviceId, DevicesType type, String deviceToken, Date createdAt, Date updatedAt) {
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

    public User getUserDevice() {
        return userDevice;
    }

    public void setUserDevice(User userDevice) {
        this.userDevice = userDevice;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

}
