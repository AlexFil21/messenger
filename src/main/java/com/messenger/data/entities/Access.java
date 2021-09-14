package com.messenger.data.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "access")
public class Access {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users userAccess;

    @OneToOne
    @JoinColumn(name = "devices_id")
    private Devices devicesId;

    @Column(columnDefinition = "varchar(60)")
    private String token;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date deletedAt;

    public Access(String token, Date createdAt, Date deletedAt) {
        this.token = token;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }

    public Access() {
    }

    public Users getUserAccess() {
        return userAccess;
    }

    public void setUserAccess(Users userAccess) {
        this.userAccess = userAccess;
    }

    public Devices getDevicesId() {
        return devicesId;
    }

    public void setDevicesId(Devices devicesId) {
        this.devicesId = devicesId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
