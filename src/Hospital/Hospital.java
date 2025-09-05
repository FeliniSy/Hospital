package Hospital;

public class Hospital {

    private String name;
    private String address;

    private static int hospitalCount;

    static {
        hospitalCount = 0;
        System.out.println("Hospital.Hospital class loaded.");
    }

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
        hospitalCount++;
    }

    public static int getHospitalCount() {
        return hospitalCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void setHospitalCount(int hospitalCount) {
        Hospital.hospitalCount = hospitalCount;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
