package entities;

public class Room {

    private String studantName;
    private String email;
    private int roomNumber;

    public Room(String studantName, String email, int roomNumber) {
        setStudantName(studantName);
        setEmail(email);
        setRoomNumber(roomNumber);
    }

    public String getStudantName() {
        return studantName;
    }

    public void setStudantName(String studantName) {
        this.studantName = studantName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
