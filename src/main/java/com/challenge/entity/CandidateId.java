package com.challenge.entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Data
public class CandidateId implements Serializable {

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "accelerationId")
    private Acceleration acceleration;

    @ManyToOne
    @JoinColumn(name = "companyId")
    private Company company;
}