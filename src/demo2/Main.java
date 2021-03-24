package demo2;

import demo2.enums.Days;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Seance> seanceSet = new TreeSet<>();
        seanceSet.add(new Seance(new Movie("Шрек", new Time(2,0)), new Time(17,30)));
        seanceSet.add(new Seance(new Movie("Кіт в чоботах", new Time(2,5)), new Time(22,0)));
        seanceSet.add(new Seance(new Movie("Бетмен", new Time(2,20)), new Time(11,30)));

        Set<Seance> dopSeance = new TreeSet<>();
        dopSeance.add(new Seance(new Movie("Форсаж 1", new Time(2,0)), new Time(8,30)));
        dopSeance.add(new Seance(new Movie("Форсаж 2", new Time(2,5)), new Time(10,0)));

        Schedule schedule1 = new Schedule(seanceSet);
        Schedule schedule2 = new Schedule(seanceSet);
        Schedule schedule3 = new Schedule(seanceSet);
        Schedule schedule4 = new Schedule(seanceSet);
        Schedule schedule5 = new Schedule(seanceSet);
        Schedule schedule6 = new Schedule(seanceSet);
        Schedule schedule7 = new Schedule(seanceSet);
        schedule1.addSeance(("Месники 1",3,0,13,0);
        schedule2.addSeance("Месники 1",3,0,13,0);
        schedule3.addSeance("Месники 2",3,5,13,0);
        schedule4.addSeance("Месники 3",3,4,13,0);
        schedule5.addSeance("Месники 4",3,3,13,0);
        schedule6.addSeance("Месники 5",3,2,13,0);
        schedule7.addSeance("Месники 6",3,1,13,0);
        schedule1.addSeance("Месники 2",2,59,14,0);
        schedule1.removeSeance("Месники 1");

        Map<Days, Schedule> cinema = new TreeMap<>();
        cinema.put(Days.MONDAY, schedule1);
        cinema.put(Days.TUESDAY, schedule2);
        cinema.put(Days.WEDNESDAY, schedule3);
        cinema.put(Days.THURSDAY, schedule4);
        cinema.put(Days.FRIDAY, schedule5);
        cinema.put(Days.SATURDAY, schedule6);
        cinema.put(Days.SUNDAY, schedule7);

    }

}
