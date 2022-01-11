package entities;

import java.util.Objects;

public class Candidate {
    private int votes;
    private String name;

    public Candidate(String name) {
        this.name = name;
    }

    public void addVote(int vote){
        votes += vote;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
