package com.messenger.revolution.data.dto;

import com.messenger.revolution.data.entities.enums.ReportsType;
import java.util.Date;

public class ReportsDTO {

    private Long id;
    private Integer usersId;
    private Integer participantsId;
    private String reportType;
    private String notes;
    private ReportsType status;
    private Date createdAt;

    public ReportsDTO(Long id, Integer usersId, Integer participantsId,
                      String reportType, String notes, ReportsType status, Date createdAt) {
        this.id = id;
        this.usersId = usersId;
        this.participantsId = participantsId;
        this.reportType = reportType;
        this.notes = notes;
        this.status = status;
        this.createdAt = createdAt;
    }

    public ReportsDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Integer getParticipantsId() {
        return participantsId;
    }

    public void setParticipantsId(Integer participantsId) {
        this.participantsId = participantsId;
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
