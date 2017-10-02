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

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Embedded
    private PhoneNumber phone;

    public PhoneNumber getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws InstantiationException {
        this.phone = new PhoneNumber(phone);
    }

    public String getFormattedPhoneNumber() {
        return this.phone.getFormattedNumber();
    }

    public User() { }
}
