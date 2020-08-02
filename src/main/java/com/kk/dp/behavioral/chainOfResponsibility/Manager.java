package com.kk.dp.behavioral.chainOfResponsibility;

public class Manager extends Employee {
    public Manager(LeaveApprover successor) {
        super("Manager", successor);
    }

    @Override
    protected boolean processLeave(LeaveApplication leaveApplication) {
        switch (leaveApplication.getType()) {
            case Sick:
                leaveApplication.approve(getApproverRole());
                return true;
            case PTO:
                if (leaveApplication.getNoOfDays() <= 5) {
                    leaveApplication.approve(getApproverRole());
                    return true;
                }
        }
        return false;
    }
}
