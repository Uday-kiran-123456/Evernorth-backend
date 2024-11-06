package com.test.test.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "policy_types")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PolicyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String policyName;

    @Column(nullable = false)
    private String policyDescription;

    @Column(nullable = false, length = 2000)  // Terms might be lengthy
    private String termsAndConditions;
}
