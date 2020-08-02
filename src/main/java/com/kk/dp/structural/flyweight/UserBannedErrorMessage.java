package com.kk.dp.structural.flyweight;

public class UserBannedErrorMessage implements ErrorMessage {
    //All state is defined here
    private final String caseId;

    private final String remarks;

    private final int banDurationDays;

    private String msg;

    public UserBannedErrorMessage(String caseId) {
        //Load case info from DB.
        this.caseId = caseId;
        remarks = "You violated terms of use.";
        banDurationDays = 2;
        msg = "You are BANNED. Sorry. \nMore information:\n";
        msg += caseId + "\n";
        msg += remarks + "\n";
        msg += "Banned For:" + (banDurationDays * 24) + " Hours";
    }

    //We ignore the extrinsic state argument
    @Override
    public String getText(String code) {
        return msg;
    }

    public String getCaseNo() {
        return caseId;
    }
}
