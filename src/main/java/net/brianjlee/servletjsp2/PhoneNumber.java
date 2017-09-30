package net.brianjlee.servletjsp2;

public class PhoneNumber {
    private String[] digits = new String[10];

    public PhoneNumber(String number) throws InstantiationException {
        if (number.length() != 10) throw new InstantiationException();
        for (int i = 0; i < number.length() ; i++) {
            digits[i] = number.substring(i, i + 1);
        }
    }

    public String getFormattedNumber() {
        return String.format("(%s%s%s) %s%s%s-%s%s%s%s", digits);
    }

    public String getPhoneNumber() {
        return String.join("", digits);
    }
}
