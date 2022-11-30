package com.glinboy.feader.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;
import lombok.Data;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class Auditable<U> {

    @CreatedBy
    @Column(name = "CREATED_BY", updatable = false, nullable = false)
    private String createdBy;

    @LastModifiedBy
    @Column(name = "EDITED_BY", nullable = false)
    private String editedBy;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_ON", updatable = false, nullable = false)
    private Date createdOn;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "EDITED_ON", nullable = false)
    private Date editedOn;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

}