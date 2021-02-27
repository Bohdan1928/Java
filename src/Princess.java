public class Princess extends Human {
    private int size;


    public Princess() {
    }

    public Princess(String name, int age, int size) {
        super(name, age);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Princess{" +
                "size=" + size +
                "} " + super.toString();
    }
}
