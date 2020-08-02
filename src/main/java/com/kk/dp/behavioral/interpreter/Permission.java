package com.kk.dp.behavioral.interpreter;

public class Permission implements PermissionExpression {
    private final String permission;

    public Permission(String permission) {
        this.permission = permission.toLowerCase();
    }

    @Override
    public boolean interpret(User user) {
        return user.getPermissions().contains(this.permission);
    }

    @Override
    public String toString() {
        return this.permission;
    }
}
