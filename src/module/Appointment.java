package module;

public class Appointment {
    String time;
    Boolean booked_status;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Boolean getBooked_status() {
        return booked_status;
    }

    public void setBooked_status(Boolean booked_status) {
        this.booked_status = booked_status;
    }

    public Appointment(String time, Boolean booked_status) {
        this.time = time;
        this.booked_status = booked_status;
    }
}
