package Task1;

import Task1.clothes.Dress;
import Task1.clothes.Pants;
import Task1.clothes.TShirt;
import Task1.clothes.Tie;
import Task1.interfaces.ManClothes;
import Task1.interfaces.WomenClothes;

import java.util.List;

public class Atelier {

    private List<Clothes> allClothes;


    public Atelier() {
    }

    public Atelier(List<Clothes> allClothes) {
        this.allClothes = allClothes;
    }

    public List<Clothes> getAllClothes() {
        return allClothes;
    }

    public void setAllClothes(List<Clothes> allClothes) {
        this.allClothes = allClothes;
    }

    static void getManClothes(List<Clothes> allClothes){
        for(Clothes clothes : allClothes){
            if(clothes instanceof ManClothes){
                System.out.println("Man clothes is " + clothes);
            }
        }
    }
    static void getWomenClothes(List<Clothes> allClothes){
        for(Clothes clothes : allClothes){
            if(clothes instanceof WomenClothes){
                System.out.println("Women clothes is " + clothes);
            }
        }
    }

    @Override
    public String toString() {
        return "Atelier{" +
                "allClothes=" + allClothes +
                '}';
    }
}
