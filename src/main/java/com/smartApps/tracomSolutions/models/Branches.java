package com.smartApps.tracomSolutions.models;

import javax.persistence.*;

@Entity
@Table
public class Branches {
    @Id
    @SequenceGenerator(
            name = "branch_sequence",
            sequenceName = "branch_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "branch_sequence"
    )
    long id;
    @Column(unique = true)
    String branch_id;
    String branch_name;

    public Branches() {
        super();
    }

    public Branches(String branch_id, String branch_name) {
        super();
        this.id = -1;
        this.branch_id = branch_id;
        this.branch_name = branch_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(String branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }
}
