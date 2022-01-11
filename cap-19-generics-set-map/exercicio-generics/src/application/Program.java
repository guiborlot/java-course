package application;

import entities.Acces;

import java.io.*;
import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) throws IOException, ParseException {
        File file = new File("cap-19-generics-set-map/exercicio-generics/in.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        Set<Acces> set = new HashSet<>();

        String nextLine = br.readLine();

        while(nextLine != null){
            String[] line = nextLine.split(" ");
            Date moment = Date.from(Instant.parse(line[1]));
            set.add(new Acces(line[0], moment));

            nextLine = br.readLine();
        }

        System.out.println("Total users: " + set.size());


    }
}
