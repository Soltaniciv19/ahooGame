package student.examples;

public class TV implements HasPowerSaving {
    private final byte ON = 1;
    private final byte OFF = 0;
    private final byte STANDBY = 2;

    private byte isOn;
    private int diagonal;

    public TV(int diagonal) {
        this.isOn = OFF;
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public void standBy(){
        this.isOn = STANDBY;
    }

    @Override
    public String toString() {
        return "TV{" +
                "diagonal=" + diagonal +
                " isOn=" + isOn +
                '}';
    }

    @Override
    public void switchOn() {
        this.isOn = ON;
    }

    @Override
    public void switchOff() {
        this.isOn = OFF;
    }

    @Override
    public boolean isOn() {
        return isOn > OFF;
    }
}
