package com.TestCasesDb.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "test_steps")
public class TestStep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private TestCase testCase;

    @Column(name = "testcase_id", nullable = false)
    private Integer testcaseId;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "screenshot")
    private byte[] screenshot;

    @Column(name = "timeofexecution")
    private Instant timeofexecution;
}
