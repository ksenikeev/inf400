package ru.itis.inf400.lab2_08.booking;

import java.util.Date;

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
}
