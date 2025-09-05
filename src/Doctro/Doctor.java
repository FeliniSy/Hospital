package Doctro;

public class Doctor {

    private String fullName;
    private int age;
    private String speciality;

    public Doctor(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Doctor(String fullName, int age, String speciality) {
        this.fullName = fullName;
        this.age = age;
        this.speciality = speciality;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return fullName + " " + age;
    }
}
