package web.Model;

public class Car {
    private String model;
    private String color;
    private int door;

    public Car(String model, String color, int door) {
        this.model = model;
        this.color = color;
        this.door = door;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", door=" + door +
                '}';
    }
}
