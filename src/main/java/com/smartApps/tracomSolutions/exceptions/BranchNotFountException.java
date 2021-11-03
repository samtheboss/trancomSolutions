package com.smartApps.tracomSolutions.exceptions;

public class BranchNotFountException extends  RuntimeException{
    public BranchNotFountException(String branch_not_found) {
        super(branch_not_found);

    }
}
