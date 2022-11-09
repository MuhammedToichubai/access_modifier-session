package java8.transport;

import java8.announcement.Announcement;

import java.time.LocalDate;

public class Car extends Announcement {
    private String color;
    private LocalDate yearOfIssue;

    public Car(String color, LocalDate yearOfIssue) {
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public Car(String name, String image, double price, String description, String color, LocalDate yearOfIssue) {
        super(name, image, price, description);
        this.color = color;
        this.yearOfIssue = yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDate getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(LocalDate yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}
