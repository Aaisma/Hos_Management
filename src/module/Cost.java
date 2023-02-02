package module;

public class Cost extends Appointment{
    String medication;
    int price;

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Cost(String time, Boolean booked_status, String medication, int price) {
        super(time, booked_status);
        this.medication = medication;
        this.price = price;
    }
}
