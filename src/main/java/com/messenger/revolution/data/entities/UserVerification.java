package com.messenger.revolution.data.entities;

import javax.persistence.*;

@Entity
public class UserVerification {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(45)")
    private String verificationCode;

    @Column(columnDefinition = "varchar(45)")
    private String  createdAt;

    @OneToOne
    @JoinColumn(name = "users_id")
    private User userId;

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public UserVerification(String verificationCode, String createdAt) {
        this.verificationCode = verificationCode;
        this.createdAt = createdAt;
    }

    public UserVerification() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}
