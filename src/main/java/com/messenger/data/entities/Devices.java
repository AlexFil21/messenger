package com.messenger.data.entities;

import com.messenger.data.entities.enums.DevicesType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "devices")
public class Devices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users userDevice;

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

    @OneToOne(mappedBy = "devicesId")
    private Access access;

    public Devices() {
    }

    public Devices(String deviceId, DevicesType type, String deviceToken, Date createdAt, Date updatedAt) {
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
}
