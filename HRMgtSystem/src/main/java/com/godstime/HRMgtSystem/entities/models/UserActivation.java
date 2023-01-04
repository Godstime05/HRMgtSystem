package com.godstime.HRMgtSystem.entities.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.godstime.HRMgtSystem.base.userEntity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Table(name = "user_activations")
public class UserActivation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "is_activated")
    private boolean isActivated;

    @Column(name = "is_activated_date")
    private LocalDateTime isActivatedDate;

    @OneToOne()
    @JoinColumn(name = "user_id")
    private User user;

    public UserActivation(User user) {
        this.setUser(user);
    }

}
