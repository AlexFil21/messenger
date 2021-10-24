package com.messenger.revolution.data.entities;

import com.messenger.revolution.data.entities.enums.ReportsType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reports")
public class Reports {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "users_id")
    private User userReportId;

    @ManyToOne
    @JoinColumn(name = "participants_id")
    private Participants participantsId;

    @Column(columnDefinition = "varchar(45)")
    private String reportType;

    @Column(columnDefinition="TEXT")
    private String notes;

    @Column
    @Enumerated(EnumType.STRING)
    private ReportsType status;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    public Reports( String reportType, String notes, ReportsType status, Date createdAt) {
        this.reportType = reportType;
        this.notes = notes;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Reports() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public ReportsType getStatus() {
        return status;
    }

    public void setStatus(ReportsType status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
