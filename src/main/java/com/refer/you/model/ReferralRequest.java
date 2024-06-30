package com.refer.you.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "referral_requests")
@Data
public class ReferralRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long refereeId;
    private Long refererId;
    private String companyName;
    private String jobUrl;

    // Getters and setters
}
