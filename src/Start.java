import firstTask.*;

public class Start {
    public static void main(String[] args) {

        Animals animals = new Animals();

        Dog dog = new Dog();
        Badger bardger = new Badger();
        Labrador labrador = new Labrador();

        Fish fish = new Fish();
        Perch perch = new Perch();
        Salmon salmon = new Salmon();

        Animals[] animals1 = new Animals[7];
        animals1[0] = animals;
        animals1[1] = dog;
        animals1[2] = labrador;
        animals1[3] = fish;
        animals1[4] = perch;
        animals1[5] = salmon;
        animals1[6] = bardger;

        Dog[] dogs = new Dog[3];
        dogs[0] = dog;
        dogs[1] = bardger;
        dogs[2] = labrador;

        Fish[] fish1 = new Fish[3];
        fish1[0] = fish;
        fish1[1] = perch;
        fish1[2] = salmon;

    }
}
