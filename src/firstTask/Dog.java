package firstTask;

public class Dog extends Animals{
    private int paws;
    private String eat;

    public Dog() {
    }

    public Dog(boolean tail, String voice, int paws, String eat) {
        super(tail, voice);
        this.paws = paws;
        this.eat = eat;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        this.paws = paws;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "firstTask.Dog{" +
                "paws=" + paws +
                ", eat='" + eat + '\'' +
                "} " + super.toString();
    }
}
