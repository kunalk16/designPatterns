package com.kk.dp.behavioral.interpreter;

public class Client {
    public static void main(String[] args) {
        Report report1  = new Report("Cash report", "FINANCE_ADMIN OR ADMIN");
        ExpressionBuilder builder = new ExpressionBuilder();

        PermissionExpression  exp = builder.build(report1);
        System.out.println(exp);

        User user1 = new User("Dave", "USER");

        System.out.println("User access report: "+ exp.interpret(user1));

        User user2 = new User("Jack", "FINANCE_ADMIN", "USER", "MANAGER");

        System.out.println("User access report: "+ exp.interpret(user2));
    }
}
