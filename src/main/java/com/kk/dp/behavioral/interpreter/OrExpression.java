package com.kk.dp.behavioral.interpreter;

public class OrExpression implements PermissionExpression {
    private final PermissionExpression expression1;

    private final PermissionExpression expression2;

    public OrExpression(PermissionExpression expression1, PermissionExpression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(User user) {
        return this.expression1.interpret(user) || this.expression2.interpret(user);
    }

    @Override
    public String toString() {
        return expression1 + " OR " + expression2;
    }
}
