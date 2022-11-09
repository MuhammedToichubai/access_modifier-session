package java8.transport;

import java.time.LocalDate;

public final class Airplane extends Car {

    public Airplane(String color, LocalDate yearOfIssue) {
        super(color, yearOfIssue);
    }

    public Airplane(String name, String image, double price, String description, String color, LocalDate yearOfIssue) {
        super(name, image, price, description, color, yearOfIssue);
    }

    @Override
    public String toString() {
        return "Airplane{}";
    }
}
