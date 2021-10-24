package com.messenger.revolution.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class DeletedConversations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversation deletedConversationId;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User userDeletedConversationId;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    public DeletedConversations( Date createdAt) {
        this.createdAt = createdAt;
    }

    public DeletedConversations() {
    }
}
