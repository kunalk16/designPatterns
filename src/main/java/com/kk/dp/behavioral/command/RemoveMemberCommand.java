package com.kk.dp.behavioral.command;

public class RemoveMemberCommand implements Command {
    private final String emailAddress;

    private final String listName;

    private final EWSService receiver;

    public RemoveMemberCommand(String email, String listName, EWSService service) {
        this.emailAddress = email;
        this.listName = listName;
        this.receiver = service;
    }

    @Override
    public void execute() {
        receiver.removeMember(emailAddress, listName);
    }
}
