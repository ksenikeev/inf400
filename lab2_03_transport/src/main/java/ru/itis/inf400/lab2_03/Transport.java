package ru.itis.inf400.lab2_03;

public abstract class Transport implements Comparable<Transport> {
    protected String number;
    protected String routeNumber;
    protected String workTimeBegin;
    protected String workTimeEnd;

    public Transport() {}

    public Transport(String number, String routeNumber, String workTimeBegin, String workTimeEnd) {
        this.number = number;
        this.routeNumber = routeNumber;
        this.workTimeBegin = workTimeBegin;
        this.workTimeEnd = workTimeEnd;
    }

    @Override
    public int compareTo(Transport t) {
        return this.number.compareTo(t.number);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getWorkTimeBegin() {
        return workTimeBegin;
    }

    public void setWorkTimeBegin(String workTimeBegin) {
        this.workTimeBegin = workTimeBegin;
    }

    public String getWorkTimeEnd() {
        return workTimeEnd;
    }

    public void setWorkTimeEnd(String workTimeEnd) {
        this.workTimeEnd = workTimeEnd;
    }
}
