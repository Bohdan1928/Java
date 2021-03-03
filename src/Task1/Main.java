package Task1;


import Task1.clothes.Dress;
import Task1.clothes.Pants;
import Task1.clothes.TShirt;
import Task1.clothes.Tie;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //1. Створити енум, який містить розміри одягу (XXS, XS, S, M, L).
        //      Написати в ньому абстрактий метод getDescription. Додати в енум в поле int euroSize, написати конструктор, який параметром буде приймати значення для поля.
        //2. Створити інтерфейси "Чоловічий одяг" з методом "вдягнути чоловіка" і
        //      "Жіночий одяг" з методом "одягнути жінку".
        //3. Створити абстрактний клас Одяг, який має такі поля:
        //      розмір одягу (використати створений енум), вартість, колір.
        //4. Створити класи нащадки до класу Одяг -
        //      Футболка (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),
        //      Штани (реалізує також інтерфейси Чоловічий одяг і Жіночий одяг),
        //      Плаття (реалізує інтерфейс "Жіночий одяг"),
        //      Галстук (реалізує інтерфейси Чоловічий одяг).
        //5. Створити клас Ательє,
        //      який має полем масив об'єктів Одяг (тобто в ньому можуть бути об'єкти усіх класів-нащадків),
        //      та 2 методи - чоловічий вибір (повертає увесь ЧОЛОВІЧИЙ одяг (підказка: instanceof оператор поможе))
        //      та жіночий вибір (повертає увесь ЖІНОЧИЙ одяг).


        Tie tie = new Tie(20, "black");
        TShirt tShirt1 = new TShirt(Sizes.M, 75, "green");
        TShirt tShirt2 = new TShirt(Sizes.S, 40, "yellow");
        Pants pants1 = new Pants(Sizes.S, 40, "yellow");
        Pants pants2 = new Pants(Sizes.L, 35, "yellow");
        Dress dress = new Dress(Sizes.S, 40, "yellow");

        List<Clothes> all = List.of(
                tie,
                tShirt1,
                tShirt2,
                pants1,
                pants2,
                dress
        );

        Atelier.getWomenClothes(all);
        Atelier.getManClothes(all);


    }
}
