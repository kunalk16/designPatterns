package com.kk.dp.structural.flyweight;

public class Client {
    public static void main(String[] args) {
        ErrorMessage errorMessage = ErrorMessageFactory.getInstance().getError(ErrorType.ServerError);
        System.out.println(errorMessage.getText("1023"));

        ErrorMessage userBannedErrorMessage = ErrorMessageFactory.getInstance().getUserBannedMessage("1122");
        System.out.println(userBannedErrorMessage.getText(null));
    }
}
