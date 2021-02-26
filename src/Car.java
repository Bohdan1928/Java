import java.util.Arrays;

public class Car {

    private String producer;
    private String[] model;
    private float volume;
    private int year;
    private Person person;

    public Car(){

    }
    public Car(String producer, String[] model, float volume, int year){
        this.producer = producer;
        this.model = model;
        this.volume = volume;
        this.year = year;
    }
    public Car(String producer, String[] model, float volume, String name, int old){
        this.producer = producer;
        this.model = model;
        this.volume = volume;
        this.person = new Person(name, old);
    }
    public Car(String producer, String[] model, float volume, Person person){
        this.producer = producer;
        this.model = model;
        this.volume = volume;
        this.person = person;
    }

    public Car(String producer, String[] model){
        this.producer = producer;
        this.model = model;

    }

    public Car(String producer){
        this.producer = producer;
    }

    public Car(String[] model){
        this.model = model;
    }

    public Car(float volume){
        this.volume = volume;
    }

    public Car(int year){
        this.year = year;
    }
    public void setProducer(String producer){
        this.producer = producer;
    }
    public void setModel(String[] model){
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model=" + Arrays.toString(model) +
                ", volume=" + volume +
                ", year=" + year +
                ", person=" + person +
                '}';
    }
}
