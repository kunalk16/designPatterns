package com.kk.dp.behavioral.interpreter;

public class NotExpression implements PermissionExpression {
    private final PermissionExpression permissionExpression;

    public NotExpression(PermissionExpression permissionExpression) {
        this.permissionExpression = permissionExpression;
    }

    @Override
    public boolean interpret(User user) {
        return !this.permissionExpression.interpret(user);
    }

    @Override
    public String toString() {
        return "NOT " + this.permissionExpression;
    }
}
