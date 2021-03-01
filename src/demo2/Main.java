package demo2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar("Гітара Taylor", 6);
        Guitar guitar2 = new Guitar("Гітара Taylor", 12);

        Drums drums1 = new Drums("Барабани Pearl", 14);
        Drums drums2 = new Drums("Барабани Gretch", 15);

        Saxophone saxophone1 = new Saxophone("first", "alte");
        Saxophone saxophone2 = new Saxophone("second", "tenor");


        List<Instruments> allInstuments = List.of(guitar1, guitar2, drums1, drums2, saxophone1, saxophone2);
            for(Instruments instruments : allInstuments){
                instruments.play();
            }
    }
}
