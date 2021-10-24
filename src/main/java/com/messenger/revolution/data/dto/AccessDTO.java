package com.messenger.revolution.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AccessDTO {

    private Long id;

    private Integer usersId;
    private Integer devicesId;
    private String token;
    private Date createdAt;
    private Date deletedAt;

    public AccessDTO(Long id, Integer usersId, Integer devicesId, String token, Date createdAt, Date deletedAt) {
        this.id = id;
        this.usersId = usersId;
        this.devicesId = devicesId;
        this.token = token;
        this.createdAt = createdAt;
        this.deletedAt = deletedAt;
    }
}
