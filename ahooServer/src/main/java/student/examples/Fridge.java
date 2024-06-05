package student.examples;

public class Fridge implements Switchable {
    private boolean isOn;
    private int volume;


    public Fridge(int volume) {
        this.isOn = false;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "volume=" + volume +
                "," +
                "isOn=" + isOn +
                '}';
    }

    @Override
    public void switchOn() {
        this.isOn = true;
    }

    @Override
    public void switchOff() {
        this.isOn = true;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }
}
