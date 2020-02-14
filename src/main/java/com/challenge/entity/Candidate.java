package com.challenge.entity;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "candidate")
public class Candidate {

    @EmbeddedId
    private CandidateId id;

    @NotNull
    @Column(name = "status")
    private int status;

    @NotNull
    @ColumnDefault("CURRENT_TIMESTAMP")
    @CreatedDate
    @Column(name = "created_at")
    private Date createdAt;

    public CandidateId getId() {
        return id;
    }

    public void setId( CandidateId id ) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus( int status ) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt( Date createdAt ) {
        this.createdAt = createdAt;
    }
}