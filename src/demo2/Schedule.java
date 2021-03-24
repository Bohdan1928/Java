package demo2;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> seances;

    public Schedule(Seance seance) {
    }


    public Schedule(Set<Seance> seances) {
        this.seances = new TreeSet<Seance>(seances);
    }

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    public void addSeance(Movie movie, Time duration, Time startTime) {
        seances.add(new Seance
                (new Movie(movie.getTitle(),
                        new Time(duration.getHour(), duration.getMin())),
                        new Time(startTime.getHour(), startTime.getMin())));
    }

    public void removeSeance(String title){
        seances.removeIf(seance -> seance.getMovie().getTitle().equals(title));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schedule schedule = (Schedule) o;
        return Objects.equals(seances, schedule.seances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seances);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}