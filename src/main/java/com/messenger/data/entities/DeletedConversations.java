package com.messenger.data.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DeletedConversations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @Column
//    private Integer conversationId;
//
//    @Column
//    private Integer usersId;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversation deletedConversationId;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private Users usersDeletedConversationId;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    public DeletedConversations( Date createdAt) {
        this.createdAt = createdAt;
    }

    public DeletedConversations() {
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
}
