package net.brianjlee.servletjsp2;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id", columnDefinition = "serial")
    @Generated(GenerationTime.INSERT)
    private int id;

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    @Column(name = "first_name")
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    @Column(name = "last_name")
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    @Embedded
    private PhoneNumber phone;

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws IllegalArgumentException {
        this.phone = new PhoneNumber();
        this.phone.setNumber(phone);
    }

    public String getFormattedPhoneNumber() {
        return this.phone.getFormattedNumber();
    }

    public User() { }
}
