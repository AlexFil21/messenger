package com.messenger.data.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "block_list")
public class BlockList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users usersBlockListId;

    @ManyToOne
    @JoinColumn(name = "participants_id")
    private Participants participantsId;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    public BlockList( Date createdAt) {
        this.createdAt = createdAt;
    }

    public BlockList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Users getUsersBlockListId() {
        return usersBlockListId;
    }

    public void setUsersBlockListId(Users usersBlockListId) {
        this.usersBlockListId = usersBlockListId;
    }

    public Participants getParticipantsId() {
        return participantsId;
    }

    public void setParticipantsId(Participants participantsId) {
        this.participantsId = participantsId;
    }
}

