public class Room {
    private int number;
    private boolean occupied;

    public Room(int number) {
        this.number = number;
        this.occupied = false;
    }

    public void assignPatient(Patient patient) {
        if (!occupied) {
            occupied = true;
            System.out.println("Patient " + patient.getFullName() + " assigned to room " + number);
        } else {
            System.out.println("Room " + number + " is already occupied!");
        }
    }
}
