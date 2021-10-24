package com.messenger.revolution.data.dto;


public class UserVerificationDTO {

    private Long id;
    private Integer usersId;
    private String verificationCode;
    private String  createdAt;

    public UserVerificationDTO(Long id, Integer usersId, String verificationCode, String createdAt) {
        this.id = id;
        this.usersId = usersId;
        this.verificationCode = verificationCode;
        this.createdAt = createdAt;
    }

    public UserVerificationDTO() {
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
