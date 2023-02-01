package entities;

public class StudentHeight {
    private double height;

    public StudentHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "StudentHeight{" +
                "height=" + height +
                '}';
    }
}
