package net.brianjlee.servletjsp2;

import org.junit.Assert;
import org.junit.Test;

public class PhoneNumberTest {
    @Test
    public void PhoneNumberInstantiates() {
        try {
            PhoneNumber phone = new PhoneNumber("1111111111");
            Assert.assertTrue(phone instanceof PhoneNumber);
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PhoneNumberReturnsString() {
        try {
            PhoneNumber phone = new PhoneNumber("1111111111");
            Assert.assertEquals(phone.getPhoneNumber(), "1111111111");
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PhoneNumberReturnsFormattedString() {
        try {
            PhoneNumber phone = new PhoneNumber("1111111111");
            Assert.assertEquals(phone.getFormattedNumber(), "(111) 111-1111");
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
