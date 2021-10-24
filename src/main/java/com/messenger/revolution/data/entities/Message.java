package com.messenger.revolution.data.entities;
import com.messenger.revolution.data.entities.enums.MessageType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "messages")
@Getter
@Setter
public class Message{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(100)")
    private String guid;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User senderId;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversation conversationId;

    @Column
    @Enumerated(EnumType.STRING)
    private MessageType messageType;

    @Column(columnDefinition = "varchar(255)")
    private String message;

    @Column
    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date deletedAt;

    @OneToMany(mappedBy = "messageId")
    private List<DeletedMessages> deletedMessagesList;

    @OneToMany(mappedBy = "messageId")
    private List<Attachments> attachmentsList;

    public Message() {
    }

    public Message(String guid, MessageType message_type, String message,
                    User user, Conversation conversation) {
        this.guid = guid;
        this.messageType = message_type;
        this.message = message;
        this.senderId = user;
        this.conversationId = conversation;
    }
}
