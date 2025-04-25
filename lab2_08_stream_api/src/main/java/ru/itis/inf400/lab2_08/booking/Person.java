package ru.itis.inf400.lab2_08.booking;

import java.util.Date;
import java.util.Objects;

/*
"person": {
        "gender": "Male",
        "birthdate": "1983-10-14",
        "fromcity": "Город Санкт-Петербург"
      }
 */
public class Person {
    private String gender;
    private Date birthdate;
    private String fromcity;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getFromcity() {
        return fromcity;
    }

    public void setFromcity(String fromcity) {
        this.fromcity = fromcity;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!this.getClass().equals(o.getClass())) {
            return false;
        }
        if (this.gender.equals(((Person) o).gender)
        && this.birthdate.equals(((Person) o).birthdate)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, birthdate);
    }
}
