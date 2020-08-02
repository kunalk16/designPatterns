package com.kk.dp.behavioral.chainOfResponsibility;

public class ProjectLead extends Employee {
    public ProjectLead(LeaveApprover successor) {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processLeave(LeaveApplication leaveApplication) {
        //type is sick leave & duration is less than or equal to 2 days
        if(leaveApplication.getType() == LeaveApplication.Type.Sick) {
            if(leaveApplication.getNoOfDays() <= 2) {
                leaveApplication.approve(getApproverRole());
                return true;
            }
        }
        return false;
    }
}
