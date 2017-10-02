package net.brianjlee.servletjsp2;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PhoneNumber {
    @Column(name = "phone_number")
    private String number;

    public PhoneNumber(String number) throws InstantiationException {
        if (number.length() != 10) throw new InstantiationException();
        this.number = number;
    }

    private PhoneNumber() {}

    public String getNumber() {
        return this.number;
    }

    public String getFormattedNumber() {
        String area = number.substring(0, 3);
        String exchange = number.substring(3, 6);
        String num = number.substring(6, 10);
        return String.format("(%s) %s-%s", area, exchange, num);
    }

}
