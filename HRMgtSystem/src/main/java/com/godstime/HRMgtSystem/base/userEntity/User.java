package com.godstime.HRMgtSystem.base.userEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @NotNull
    @Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
    private final LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Email
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @NotNull
    @Size(max = 100)
    @Column(name = "password")
    @JsonIgnore
    private String password;
    @NotNull
    @Column(name = "is_active", columnDefinition = "boolean default true")
    private boolean isActive = true;
    @NotNull
    @Column(name = "is_deleted", columnDefinition = "boolean default true")
    private boolean isDeleted = false;

    public User(final int id, @NotBlank @Email @Size(max = 100) final String email,
                @NotBlank @Size(max = 100) final String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
}
