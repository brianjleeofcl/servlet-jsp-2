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
            Assert.assertEquals(phone.getNumber(), "1111111111");
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void PhoneNumberReturnsFormattedString() {
        try {
            PhoneNumber phone = new PhoneNumber("1111111111");
            PhoneNumber phone2 = new PhoneNumber("1231231234");
            Assert.assertEquals("(111) 111-1111", phone.getFormattedNumber());
            Assert.assertEquals("(123) 123-1234", phone2.getFormattedNumber());
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
