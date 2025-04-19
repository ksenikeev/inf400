package ru.itis.inf400.lab2_08.booking;

import java.util.Date;

/*
    {
      "id": 7087959,
      "arrivaldate": "2022-03-10",
      "stayingdate": "2022-03-11",
      "departuredate": "2022-03-11",
      "hotel": {
        "id": 332,
        "name": "hotel332"
      },
      "person": {
        "gender": "Male",
        "birthdate": "1983-10-14",
        "fromcity": "Город Санкт-Петербург"
      }
    }
 */
public class Booking {
    private Integer id;
    private Date arrivaldate;
    private Date stayingdate;
    private Date departuredate;
    private Hotel hotel;
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(Date arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public Date getStayingdate() {
        return stayingdate;
    }

    public void setStayingdate(Date stayingdate) {
        this.stayingdate = stayingdate;
    }

    public Date getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(Date departuredate) {
        this.departuredate = departuredate;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
