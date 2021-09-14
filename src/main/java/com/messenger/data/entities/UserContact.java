package com.messenger.data.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class UserContact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users usersContactId;

    @ManyToOne
    @JoinColumn(name = "contact_id")
    private Contacts contactId;

    @Column(columnDefinition = "varchar(20)")
    private String firstName;

    @Column(columnDefinition = "varchar(20)")
    private String lastName;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    public UserContact(String firstName, String lastName, Date createdAt, Date updatedAt) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public UserContact() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Users getUsersContactId() {
        return usersContactId;
    }

    public void setUsersContactId(Users usersContactId) {
        this.usersContactId = usersContactId;
    }

    public Contacts getContactId() {
        return contactId;
    }

    public void setContactId(Contacts contactId) {
        this.contactId = contactId;
    }
}
