package demo1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("asdf"));
        pets.add(new Pet("asds"));
        pets.add(new Pet("asdd"));
        pets.add(new Pet("asda"));
        pets.add(new Pet("asdd"));


        Map<Person, List<Pet>> club = new HashMap<>();
//1, 2
        club.put(new Person("Bohdan"), pets);
//3
        club.get(new Person("Bohdan")).remove(new Pet("asdf"));
//4
        club.remove(new Person("Bohdan"));
//5
        for (Pet pet : pets) {
            if (pet.getName().equals("asdd")) {
                club.remove(pet);
            }
        }
//6
        System.out.println(club);
    }
}
