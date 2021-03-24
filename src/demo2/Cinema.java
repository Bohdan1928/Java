package demo2;

import demo2.enums.Days;

import java.util.*;

public class Cinema {
    private Map<Days, Schedule> treeMap;
    private Time open;
    private Time close;

    public Cinema() {
    }

    public Cinema(Map<Days, Schedule> treeMap, Time open, Time close) {
        this.treeMap = treeMap;
        this.open = open;
        this.close = close;
    }

    public Map<Days, Schedule> getTreeMap() {
        return treeMap;
    }

    public void setTreeMap(TreeMap<Days, Schedule> treeMap) {
        this.treeMap = treeMap;
    }

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    public void addSeances(Days day, Movie movie, Time duration, Time startTime) {
        treeMap.put(day, new Schedule(new Seance(new Movie(movie.getTitle(),
                new Time(duration.getHour(), duration.getMin())),
                new Time(startTime.getHour(), startTime.getMin()))));
    }

    public void removeMovie(String movie) {
        for (Map.Entry<Days, Schedule> next : treeMap.entrySet()) {
            next.getValue().removeSeance(movie);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(treeMap, cinema.treeMap) && Objects.equals(open, cinema.open) && Objects.equals(close, cinema.close);
    }

    @Override
    public int hashCode() {
        return Objects.hash(treeMap, open, close);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "treeMap=" + treeMap +
                ", open=" + open +
                ", close=" + close +
                '}';
    }
}
