package com.smartApps.tracomSolutions.exception;

public class BranchNotFountException extends  RuntimeException{
    public BranchNotFountException(String branch_not_found) {
        super(branch_not_found);

    }
}
