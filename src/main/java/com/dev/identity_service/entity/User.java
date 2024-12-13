package com.dev.identity_service.entity;



import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.LocalDateTime;

import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@EntityListeners(AuditingEntityListener.class)
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;



    String username;
    String password;
    String firstName;
    String lastName;




    LocalDate dob;


    @CreatedDate
    LocalDateTime createdAt;

    @LastModifiedDate
    LocalDateTime updatedAt;


    @ManyToMany
    Set<Role> roles;
}
