package fill.jma;

import java.util.Objects;
import java.util.*;

public class Manager extends Employee{
    private List<String> subordination;

    public Manager(String name, String surname, int offer, String department, List<String> subordination) {
        super(name, surname, offer, department);
        this.subordination = subordination;
    }

    public Manager() {
    }

    public List<String> getList() {
        return subordination;
    }

    public void setList(List<String> subordination) {
        this.subordination = subordination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(subordination, manager.subordination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subordination);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", offer=" + offer +
                ", department='" + department + '\'' +
                ", Subordination=" + subordination +
                '}';
    }
}
