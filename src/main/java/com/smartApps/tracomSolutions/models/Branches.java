package com.smartApps.tracomSolutions.models;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
public class Branches {

    @Id
    @SequenceGenerator(
            name = "branch_sequence",
            sequenceName = "branch_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "branch_sequence"
    )
    long id;

    @Column(unique = true)
    String branchCode;
    String branchName;
    String modifiedBy;
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ")
    Timestamp dateModified;

    public Branches() {
        super();

        // TODO Auto-generated constructor stub
    }

    public Branches(long id, String branchCode, String branchName, String modifiedBy, Timestamp dateModified) {
        super();
        this.id = id;
        this.branchCode = branchCode;
        this.branchName = branchName;
        this.modifiedBy = modifiedBy;
        this.dateModified = dateModified;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }


    public Timestamp getDateModified() {
        return dateModified;
    }


    public void setDateModified(Timestamp dateModified) {
        this.dateModified = Timestamp.valueOf(LocalDateTime.now());
    }


}
