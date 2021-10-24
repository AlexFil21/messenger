package com.messenger.revolution.data.entities;

import com.messenger.revolution.data.entities.enums.ParticipantsType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Participants {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private ParticipantsType participantsType;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @OneToMany(mappedBy = "participantsId")
    private List<BlockList> participantsBlockList;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversation conversationId;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User userParticipantId;

    @OneToMany(mappedBy = "participantsId")
    private List<Reports> reportsParticipantList;

    public List<BlockList> getParticipantsBlockList() {
        return participantsBlockList;
    }

    public void setParticipantsBlockList(List<BlockList> participantsBlockList) {
        this.participantsBlockList = participantsBlockList;
    }

    public Participants(ParticipantsType participantsType,
                        Date createdAt, Date updatedAt) {
        this.participantsType = participantsType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Participants() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ParticipantsType getParticipantsType() {
        return participantsType;
    }

    public void setParticipantsType(ParticipantsType participantsType) {
        this.participantsType = participantsType;
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

    public Conversation getConversationId() {
        return conversationId;
    }

    public void setConversationId(Conversation conversationId) {
        this.conversationId = conversationId;
    }

    public User getUserParticipantId() {
        return userParticipantId;
    }

    public void setUserParticipantId(User userParticipantId) {
        this.userParticipantId = userParticipantId;
    }
}
