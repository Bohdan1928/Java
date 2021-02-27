package lesson2.extends_demo;

public class Car {
    private int id;
    private String model;

    public Car() {
    }

    public Car(int id, String model) {
        this.id = id;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void drive(){
        System.out.println("sdsad");
    }
    @Override
    public String toString() {
        return "lesson2.extends_demo.Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                '}';
    }
}
