package com.kk.dp.behavioral.command;

public class AddMemberCommand implements Command {
    private final String emailAddress;

    private final String listName;

    private final EWSService receiver;

    public AddMemberCommand(String email, String listName, EWSService service) {
        this.emailAddress = email;
        this.listName = listName;
        this.receiver = service;
    }

    @Override
    public void execute() {
        receiver.addMember(emailAddress, listName);
    }
}
