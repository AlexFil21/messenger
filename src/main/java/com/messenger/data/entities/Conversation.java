package com.messenger.data.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "conversation")
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(40)")
    private String title;

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private Users creatorConversation;

    @Column(columnDefinition = "varchar(45)")
    private String channelId;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date deletedAt;

    @OneToMany(mappedBy = "conversationId")
    private List<Participants> conversationParticipant;

    @OneToMany(mappedBy = "deletedConversationId")
    private List<DeletedConversations> deletedConversationsList;

    @OneToMany(mappedBy = "conversationMessage")
    private List<Message> messageList;



    public Conversation(String title, String channelId, Date createdAt, Date updatedAt, Date deletedAt) {
        this.title = title;
        this.channelId = channelId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
    }

    public Conversation() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(String channelId) {
        this.channelId = channelId;
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

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public List<Participants> getConversationParticipant() {
        return conversationParticipant;
    }

    public void setConversationParticipant(List<Participants> conversationParticipant) {
        this.conversationParticipant = conversationParticipant;
    }

    public List<DeletedConversations> getDeletedConversationsList() {
        return deletedConversationsList;
    }

    public void setDeletedConversationsList(List<DeletedConversations> deletedConversationsList) {
        this.deletedConversationsList = deletedConversationsList;
    }
}
