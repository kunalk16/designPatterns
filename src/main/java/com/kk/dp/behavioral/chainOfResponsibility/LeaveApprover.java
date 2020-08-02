package com.kk.dp.behavioral.chainOfResponsibility;

public interface LeaveApprover {
    void processLeaveApplication(LeaveApplication leaveApplication);

    String getApproverRole();
}
