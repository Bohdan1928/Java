package firstTask;

public class Animals {
    private boolean tail;
    private String voice;

    public Animals() {
    }

    public Animals(boolean tail, String voice) {
        this.tail = tail;
        this.voice = voice;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "firstTask.Animals{" +
                "tail=" + tail +
                ", voice='" + voice + '\'' +
                '}';
    }
}
