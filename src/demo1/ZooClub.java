package demo1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {

    private Map<Person, List<Pet>> club = new HashMap<Person, List<Pet>>();

    public ZooClub() {

    }

    public ZooClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    public Map<Person, List<Pet>> getClub() {
        return club;
    }

    public void setClub(Map<Person, List<Pet>> club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "ZooClub{" +
                "club=" + club +
                '}';
    }
}
