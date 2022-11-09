package java8.devices;

import java8.announcement.Announcement;

public class Phone extends Announcement {
    private String production;
    private int memory;

    public Phone(String production, int memory) {
        this.production = production;
        this.memory = memory;
    }

    public Phone(String name, String image, double price, String description, String production, int memory) {
        super(name, image, price, description);
        this.production = production;
        this.memory = memory;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "production='" + production + '\'' +
                ", memory=" + memory +
                '}';
    }
}
