package com.messenger.revolution.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "access")
@Getter
@Setter
public class Access {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User userAccess;

    @OneToOne
    @JoinColumn(name = "devices_id")
    private Device deviceId;

    @Column(columnDefinition = "varchar(60)")
    private String token;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date deletedAt;

    public Access(String token, Date createdAt, Date deletedAt) {
        this.token = token;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }

    public Access() {
    }

}
