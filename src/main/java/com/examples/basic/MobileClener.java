package com.examples.basic;

public class MobileClener {
    public static void main(String args[]) {

        String mobileNumber = "123456)";

        if (mobileNumber.contains("(") || mobileNumber.contains(")") || mobileNumber.contains(" ")
                || mobileNumber.contains("-")) {
            mobileNumber = replacebraces(mobileNumber);
        }
        mobileNumber = trimValuesOfMob(mobileNumber);

        System.out.println(mobileNumber);
    }




    private static String replacebraces(String mobileNumber) {
        mobileNumber = mobileNumber.replace("(", "");
        mobileNumber = mobileNumber.replace(")", "");
        mobileNumber = mobileNumber.replace(" ", "");
        mobileNumber = mobileNumber.replace("-", "");
        return mobileNumber;
    }

    private static String trimValuesOfMob(String mobileNumber) {

        String temMbl = "";

        switch (mobileNumber.length()) {
            case 10:
                temMbl = mobileNumber.substring(0, 3) + "-" + mobileNumber.substring(3, 6) + "-"
                        + mobileNumber.substring(6, 10);
                break;
            case 7:
                temMbl = mobileNumber.substring(0, 3) + "-" + mobileNumber.substring(3, 7);
                break;

            default:
                temMbl = null;
        }
        return temMbl;

    }
}
