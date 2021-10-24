package com.messenger.revolution.data.dto;
import java.util.Date;

public class BlockListDTO {

    private Long id;
    private Integer usersId;
    private Integer participantsId;
    private Date createdAt;

    public BlockListDTO(Long id, Integer usersId, Integer participantsId, Date createdAt) {
        this.id = id;
        this.usersId = usersId;
        this.participantsId = participantsId;
        this.createdAt = createdAt;
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

    public Integer getParticipantsId() {
        return participantsId;
    }

    public void setParticipantsId(Integer participantsId) {
        this.participantsId = participantsId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
