package com.messenger.data.entities;

import com.messenger.data.entities.enums.MessageType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(100)")
    private String guid;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private Users senderMessage;

    @ManyToOne
    @JoinColumn(name = "conversation_id")
    private Conversation conversationMessage;

    @Column
    @Enumerated(EnumType.STRING)
    private MessageType messageType;

    @Column(columnDefinition = "varchar(255)")
    private String message;

    @Column
    @Temporal(TemporalType.DATE)
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

    public Message(String guid,
                   MessageType message_type, String message, Date created_at,
                   Date deleted_at) {
        this.guid = guid;
        this.messageType = message_type;
        this.message = message;
        this.createdAt = created_at;
        this.deletedAt = deleted_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType message_type) {
        this.messageType = message_type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date created_at) {
        this.createdAt = created_at;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deleted_at) {
        this.deletedAt = deleted_at;
    }
}
