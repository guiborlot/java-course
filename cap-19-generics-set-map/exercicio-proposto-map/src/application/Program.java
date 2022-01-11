package application;

import entities.Candidate;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        String path = "cap-19-generics-set-map/exercicio-proposto-map/in.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            Map<String, Integer> candidates = new HashMap<>();

            while (line != null){
                String[] fields = line.split(",");
                Candidate candidate = new Candidate(fields[0]);

                int updatedVote;

                if(candidates.containsKey(fields[0])){
                    int initialVote = candidates.get(fields[0]);
                    updatedVote = initialVote + Integer.parseInt(fields[1]);
                    candidates.put(candidate.getName(), updatedVote);
                } else{
                    candidates.put(fields[0], Integer.parseInt(fields[1]));
                }


                line = br.readLine();
            }

            for(String candidate : candidates.keySet()){
                System.out.println(candidate + ": " + candidates.get(candidate));
            }



        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
