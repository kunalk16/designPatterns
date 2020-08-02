package com.kk.dp.behavioral.interpreter;

public class Report {
    private final String name;

    private final String permission;

    public Report(String name, String permission) {
        this.name = name;
        this.permission = permission;
    }

    public String getName() {
        return this.name;
    }

    public String getPermission() {
        return this.permission;
    }
}
