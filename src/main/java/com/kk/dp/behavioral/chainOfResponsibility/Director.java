package com.kk.dp.behavioral.chainOfResponsibility;

public class Director extends Employee {
    public Director(LeaveApprover successor) {
        super("Director", successor);
    }

    @Override
    protected boolean processLeave(LeaveApplication leaveApplication) {
        if (leaveApplication.getType() == LeaveApplication.Type.PTO) {
            leaveApplication.approve(getApproverRole());
            return true;
        }
        return false;
    }
}
