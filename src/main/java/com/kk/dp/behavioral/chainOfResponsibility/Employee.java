package com.kk.dp.behavioral.chainOfResponsibility;

public abstract class Employee implements LeaveApprover {
    private final String approverRole;
    private final LeaveApprover successor;

    protected Employee(String approverRole, LeaveApprover successor) {
        this.approverRole = approverRole;
        this.successor = successor;
    }

    @Override
    public void processLeaveApplication(LeaveApplication leaveApplication) {
        if(!processLeave(leaveApplication)) {
            this.successor.processLeaveApplication(leaveApplication);
        }
    }

    protected abstract boolean processLeave(LeaveApplication leaveApplication);

    @Override
    public String getApproverRole() {
        return this.approverRole;
    }
}
