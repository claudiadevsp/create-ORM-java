package com.challenge.entity;

import lombok.Data;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
@Data
public class SubmissionId implements Serializable {
    @ManyToOne
    @NotNull
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @NotNull
    @JoinColumn(name = "challengeId")
    private Challenge challenge;
}
