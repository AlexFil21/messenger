package com.messenger.revolution.data.entities;

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
    private User userBlockListId;

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

    public User getUserBlockListId() {
        return userBlockListId;
    }

    public void setUserBlockListId(User userBlockListId) {
        this.userBlockListId = userBlockListId;
    }

    public Participants getParticipantsId() {
        return participantsId;
    }

    public void setParticipantsId(Participants participantsId) {
        this.participantsId = participantsId;
    }
}

