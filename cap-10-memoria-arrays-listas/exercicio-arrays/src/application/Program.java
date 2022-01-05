package application;

import entities.Room;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Room[] rooms = new Room[10];

        System.out.println("how many students will occupy the rooms? (1-10)");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.print("Student name: ");
            String name = sc.nextLine();
            System.out.print("Student email: ");
            String email = sc.nextLine();
            System.out.print("Room number (1-10): ");
            int roomNumber = sc.nextInt();
            sc.nextLine();

            rooms[roomNumber - 1] = new Room(name, email, roomNumber);
        }

        for(int i=0; i< rooms.length; i++){
            if(rooms[i] != null){
                System.out.println("Rent #" + i);
                System.out.println("Student name: " + rooms[i].getStudantName());
                System.out.println("Student email: " + rooms[i].getEmail());
                System.out.println("Room: " + rooms[i].getRoomNumber() + "\n");
            }
        }
    }
}
