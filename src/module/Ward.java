package module;

public class Ward extends Department{
    int room_no;

    public int getRoom_no() {
        return room_no;
    }

    public void setRoom_no(int room_no) {
        this.room_no = room_no;
    }

    public Ward(String department_name, int floor, int room_no) {
        super(department_name, floor);
        this.room_no = room_no;
    }
}
