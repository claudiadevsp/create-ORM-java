package com.challenge.entity;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "submission")
public class Submission {

    @EmbeddedId
    private SubmissionId id;

    @NotNull
    @Column(name= "score")
    private float score;

    @NotNull
    @ColumnDefault("CURRENT_TIMESTAMP")
    @CreatedDate
    private Date createdAt;

    public SubmissionId getId() {
        return id;
    }

    public void setId( SubmissionId id ) {
        this.id = id;
    }

    public float getScore() {
        return score;
    }

    public void setScore( float score ) {
        this.score = score;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt( Date createdAt ) {
        this.createdAt = createdAt;
    }
}