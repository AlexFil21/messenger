package com.messenger.revolution.data.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "varchar(16)")
    private String phone;

    @Column(columnDefinition = "varchar(255)")
    private String email;

    @Column(columnDefinition = "varchar(40)")
    private String password;

    @Column(columnDefinition = "varchar(20)")
    private String firstName;

    @Column(columnDefinition = "varchar(20)")
    private String lastName;

    @Column(columnDefinition = "varchar(20)")
    private String middleName;

    @Column
    private Boolean isActive;

    @Column
    private Boolean isReported;

    @Column
    private Boolean isBlocked;

    @Column(columnDefinition="TEXT")
    private String preferences;

    @JsonFormat(pattern = "MM/dd/yyyy")
    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @OneToOne(mappedBy = "userId")
    private UserVerification userVerification;

    @OneToMany(mappedBy = "userDevice")
    private List<Device> devices;

    @OneToMany(mappedBy = "userAccess")
    private List<Access> accesses;

    @OneToMany(mappedBy = "userBlockListId")
    private List<BlockList> usersBlockList;

    @OneToMany(mappedBy = "userContactId")
    private List<UserContact> usersContactsList;

    @OneToMany(mappedBy = "userParticipantId")
    private List<Participants> participants;

    @OneToMany(mappedBy = "userReportId")
    private List<Reports> usersReportsList;

    @OneToMany(mappedBy = "userDeletedConversationId")
    private List<DeletedConversations> deletedConversationsList;

    @OneToMany(mappedBy = "senderId")
    private List<Message> senderMessagesList;

    @OneToMany(mappedBy = "creatorId")
    private List<Conversation> creatorConversationList;

    @OneToMany(mappedBy = "userDeletedMessageId")
    private List<DeletedMessages> deletedMessagesList;

    public User(String phone, String email,
                String password, String firstName,
                String lastName, String middleName,
                Boolean isActive, Boolean isReported,
                Boolean isBlocked, String preferences,
                Date createdAt, Date updatedAt) {
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.isActive = isActive;
        this.isReported = isReported;
        this.isBlocked = isBlocked;
        this.preferences = preferences;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public User() {
    }

}
