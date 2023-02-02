package module;

public class Patient extends Doctor{
    int Patient_id;
    String name;
    int age;
    String gender;

    public int getPatient_id() {
        return Patient_id;
    }

    public void setPatient_id(int patient_id) {
        Patient_id = patient_id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    public Patient(String name, String gender, int age, String experience, String expertise, int patient_id, String name1, int age1, String gender1) {
        super(name, gender, age, experience, expertise);
        Patient_id = patient_id;
        this.name = name1;
        this.age = age1;
        this.gender = gender1;
    }
}
