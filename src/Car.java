public class Car {
    private String producer;
    private String model;
    private int year;
    private int price;
    private int power;
    private float volume;
    private boolean luxery;

    public Car() {
    }

    public Car(String producer, String model, int year, int price, int power, float volume, boolean luxery) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.price = price;
        this.power = power;
        this.volume = volume;
        this.luxery = luxery;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public boolean isLuxery() {
        return luxery;
    }

    public void setLuxery(boolean luxery) {
        this.luxery = luxery;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", power=" + power +
                ", volume=" + volume +
                ", luxery=" + luxery +
                '}';
    }
}
