package fill.jma;

import java.util.Objects;

public class Employee {
    public String name;
    public String surname;
    public int offer;
    public String department;

    public Employee(String name, String surname, int offer, String department) {
        this.name = name;
        this.surname = surname;
        this.offer = offer;
        this.department = department;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getOffer() {
        return offer;
    }

    public void setOffer(int offer) {
        this.offer = offer;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return offer == employee.offer && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && Objects.equals(department, employee.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, offer, department);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", offer=" + offer +
                ", department='" + department + '\'' +
                '}';
    }

}
