package demo2;

import java.util.Objects;

public class Seance implements Comparable<Seance>{
    Movie movie;
    Time startMovie;
    Time endMovie;

    public Seance() {
    }

    public Time computeEndMovie(Time duration, Time startMovie){
        int hour = startMovie.getHour() + duration.getHour();
        int min = startMovie.getMin() + duration.getMin();
        if(min >= 60){
            hour += 1;
            min -= 60;
        }
        if(min >= 24){
            hour -= 24;
        }
        return new Time(hour, min);
    }
    public Seance(Movie movie, Time startMovie) {
        this.movie = movie;
        this.startMovie = startMovie;
        this.endMovie = computeEndMovie(this.movie.getDuration(),this.startMovie);
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Time getStartMovie() {
        return startMovie;
    }

    public void setStartMovie(Time startMovie) {
        this.startMovie = startMovie;
    }

    public Time getEndMovie() {
        return endMovie;
    }

    public void setEndMovie(Time endMovie) {
        this.endMovie = endMovie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seance seance = (Seance) o;
        return Objects.equals(movie, seance.movie) && Objects.equals(startMovie, seance.startMovie) && Objects.equals(endMovie, seance.endMovie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movie, startMovie, endMovie);
    }

    @Override
    public String toString() {
        return "Seance{" +
                "movie=" + movie +
                ", startMovie=" + startMovie +
                ", endMovie=" + endMovie +
                '}';
    }

    @Override
    public int compareTo(Seance o) {
        return this.getStartMovie().getHour() - o.getStartMovie().getHour();
    }
}
