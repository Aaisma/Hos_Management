package module;

public class Department {
    String department_name;

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public Department(String department_name, int floor) {
        this.department_name = department_name;
        this.floor = floor;
    }

    int floor;
}
