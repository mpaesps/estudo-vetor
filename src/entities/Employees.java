package entities;

public class Employees {
    private String name;
    private Double salary;
    private String data;

    public Employees(String name, Double salary,String data) {
        this.name = name;
        this.data = data;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", data='" + data + '\'' +
                '}';
    }
}
