package com.godstime.HRMgtSystem.entities.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "employer_updates")
public class EmployerUpdate {
    @NotNull
    @Column(name = "updated_at", columnDefinition = "timestamp with time zone default CURRENT_DATE")
    private final LocalDateTime updatedAt = LocalDateTime.now();

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Employer employer;

    @NotBlank
    @Size(max = 100)
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "company_image_url")
    private String companyImageUrl;

    @NotBlank
    @Size(max = 100)
    @Column(name = "website")
    private String website;

    @NotBlank
    @Size(max = 100)
    @Column(name = "corporate_email")
    private String corporateEmail;

    @NotBlank
    @Size(max = 15)
    @Column(name = "phone")
    private String phone;

    @NotNull
    @Column(name = "is_approved", columnDefinition = "boolean default false")
    private boolean isApproved = false;

    @NotNull
    @Column(name = "is_deleted", columnDefinition = "boolean default false")
    private boolean isDeleted = false;

}
