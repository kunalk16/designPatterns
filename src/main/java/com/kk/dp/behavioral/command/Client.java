package com.kk.dp.behavioral.command;

public class Client {
    public static void main(String[] args) throws Exception {
        EWSService service = new EWSService();

        Command c1 = new AddMemberCommand("a@a.com", "spam", service);
        MailTasksRunner.getInstance().addCommand(c1);

        Command c2 = new AddMemberCommand("b@b", "spam", service);
        MailTasksRunner.getInstance().addCommand(c2);

        Command c3 = new RemoveMemberCommand("c@c", "spam", service);
        MailTasksRunner.getInstance().addCommand(c3);

        Command c4 = new RemoveMemberCommand("d@d", "spam", service);
        MailTasksRunner.getInstance().addCommand(c4);

        Thread.sleep(3000);
        MailTasksRunner.getInstance().shutdown();
    }
}
