package demo4;

public enum Seasons {
    SUMMER(92, "Lito"),
    AUTUMN(90, "Osin"),
    WINTER(91, "Holdno"),
    SPRING(91, "Vesna");
    int days;
    String alias;

    Seasons() {
    }

    Seasons(int days, String alias) {
        this.days = days;
        this.alias = alias;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "days=" + days +
                ", alias='" + alias + '\'' +
                "} " + super.toString();
    }
}
