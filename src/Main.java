import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Airplane;
import java8.transport.Car;
import java8.transport.Helicopter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    }


    public static Phone[] getPhones(){
        return new Phone[]{
                new Phone("iPhone", "☺", 100, "new", "China", 1000),
                new Phone("Samsung", "☺", 50, "old", "USA", 16),
        };
    }

    public static Laptop[] getLaptops(){
        return new Laptop[]{
                new Laptop("Lenovo", "☺", 400,"old", "windows"),
                new Laptop("MacBook", "☺", 1000,"new", "apple")
        };
    }

    public static Home[] getHomes(){
        return new Home[]{
                new Home("Peaksoft ", "☺", 12000, "best home",  "House", 10),
                new Home("Ihlas ", "☺", 11200, "best",  "Apartment", 6)
        };
    }

    public static Airplane[] getAirplanes(){
        return new Airplane[]{
                new Airplane("J7 ", "☺", 20000, "new", "green", LocalDate.of(2021, 12, 31)),
                new Airplane("Fly Emirates ", "☺", 12000, "old", "white", LocalDate.of(2012, 10, 1)),
        };
    }

    public static Car[] getCars(){
        return new Car[]{
                new Car("Camry ", "☺", 18000, "new", "black", LocalDate.of(2022, 3, 8)),
                new Car("Lexus ", "☺", 25000, "new", "white", LocalDate.of(2021, 4, 9)),
        };
    }

    public static Helicopter[] getHelicopter(){
        return new Helicopter[]{
                new Helicopter(),
                new Helicopter()
        };
    }


    public static void findByPrice(int price,
                                   Laptop[] laptops, Phone[] phones,
                                   Home[] homes, Airplane[] airplanes,
                                   Car[] cars, Helicopter[] helicopters){
        double getPrice = 0;

        for (Laptop laptop : laptops) {
            if (price == laptop.getPrice()){
                getPrice = laptop.getPrice();
            }
        }



    }

}