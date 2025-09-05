package Nurse;

public class Nurse {

    private String fullName;
    private int age;

    public Nurse(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
