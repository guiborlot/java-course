package entities;

import java.util.Date;
import java.util.Objects;

public class Acces {
    private String name;
    private Date date;

    public Acces(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acces acces = (Acces) o;
        return Objects.equals(name, acces.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Acces{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
