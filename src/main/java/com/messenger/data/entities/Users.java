package com.messenger.data.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Users {

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

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @OneToOne(mappedBy = "usersId")
    private UserVerification userVerification;

    @OneToMany(mappedBy = "userDevice")
    private List<Devices> devices;

    @OneToMany(mappedBy = "userAccess")
    private List<Access> accesses;

    @OneToMany(mappedBy = "usersBlockListId")
    private List<BlockList> usersBlockList;

    @OneToMany(mappedBy = "usersContactId")
    private List<UserContact> usersContactsList;

    @OneToMany(mappedBy = "usersParticipantId")
    private List<Participants> participants;

    @OneToMany(mappedBy = "usersReportId")
    private List<Reports> usersReportsList;

    @OneToMany(mappedBy = "usersDeletedConversationId")
    private List<DeletedConversations> deletedConversationsList;

    @OneToMany(mappedBy = "senderMessage")
    private List<Message> senderMessagesList;

    @OneToMany(mappedBy = "creatorConversation")
    private List<Conversation> creatorConversationList;

    @OneToMany(mappedBy = "usersDeletedMessageId")
    private List<DeletedMessages> deletedMessagesList;

    public List<BlockList> getUsersBlockList() {
        return usersBlockList;
    }

    public void setUsersBlockList(List<BlockList> usersBlockList) {
        this.usersBlockList = usersBlockList;
    }

    public List<Devices> getDevices() {
        return devices;
    }

    public void setDevices(List<Devices> devices) {
        this.devices = devices;
    }

    public UserVerification getUserVerification() {
        return userVerification;
    }

    public void setUserVerification(UserVerification userVerification) {
        this.userVerification = userVerification;
    }

    public Users(String phone, String email,
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

    public Users() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public Boolean getReported() {
        return isReported;
    }

    public void setReported(Boolean reported) {
        isReported = reported;
    }

    public Boolean getBlocked() {
        return isBlocked;
    }

    public void setBlocked(Boolean blocked) {
        isBlocked = blocked;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
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

    public List<Access> getAccesses() {
        return accesses;
    }

    public void setAccesses(List<Access> accesses) {
        this.accesses = accesses;
    }
}
