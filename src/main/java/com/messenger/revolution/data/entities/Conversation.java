package com.messenger.revolution.data.entities;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "conversation")
@Getter
@Setter
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(40)")
    private String title;

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creatorId;

    @Column(columnDefinition = "varchar(45)")
    private String channelId;

    @Column
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    @UpdateTimestamp
    private Date updatedAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date deletedAt;

    @OneToMany(mappedBy = "conversationId")
    private List<Participants> conversationParticipant;

    @OneToMany(mappedBy = "deletedConversationId")
    private List<DeletedConversations> deletedConversationsList;

    @OneToMany(mappedBy = "conversationId")
    private List<Message> messageList;

    public Conversation(String title, String channelId, User user) {
        this.title = title;
        this.channelId = channelId;
        this.creatorId = user;
    }

    public Conversation() {
    }
}
