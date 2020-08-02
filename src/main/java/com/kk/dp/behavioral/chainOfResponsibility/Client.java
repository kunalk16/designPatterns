package com.kk.dp.behavioral.chainOfResponsibility;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        LeaveApplication application = LeaveApplication.getBuilder().withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now()).to(LocalDate.of(2018, 2, 28))
                .build();
        System.out.println(application);
        System.out.println("**************************************************");
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application);
    }

    private static LeaveApprover createChain() {
        LeaveApprover director = new Director(null);
        LeaveApprover manager = new Manager(director);
        return new ProjectLead(manager);
    }
}
