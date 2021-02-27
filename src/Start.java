public class Start {
    public static void main(String[] args) {
        Prince prince = new Prince("Karl", 19, 37);
        Princess princess1 = new Princess("Klara", 18, 36);
        Princess princess2 = new Princess("Ira", 19, 37);
        Princess princess3 = new Princess("Lara", 16, 38);
        Princess princess4 = new Princess("Sara", 17, 39);

        Princess[] princesses = new Princess[4];
        princesses[0] = princess1;
        princesses[1] = princess2;
        princesses[2] = princess3;
        princesses[3] = princess4;

        Princess finded = prince.find(princesses);
        System.out.println(finded);

        }

    }

