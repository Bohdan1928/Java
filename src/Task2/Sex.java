package Task2;

public enum Sex {
    Man("man"),
    Women("women");

    private String sex;

    Sex() {
    }

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Sex{" +
                "sex='" + sex + '\'' +
                "} " + super.toString();
    }
}
