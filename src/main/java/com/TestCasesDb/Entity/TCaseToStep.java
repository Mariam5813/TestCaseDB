package com.TestCasesDb.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tcase_to_steps")
public class TCaseToStep {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tc_id")
    private TestCase tc;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ts_id")
    private TestStep ts;
}
