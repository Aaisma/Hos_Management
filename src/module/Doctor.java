package module;

public class Doctor  {
    String Name;
    String gender;
    int age;
    String experience;
    String expertise;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    public Doctor(String name, String gender, int age, String experience, String expertise) {
        Name = name;
        this.gender = gender;
        this.age = age;
        this.experience = experience;
        this.expertise = expertise;
    }
}
