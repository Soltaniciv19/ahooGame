package student.examples;

public class Coordinate {
    private byte x;
    private byte y;

    public Coordinate(int x, int y) {
        setX(x);
        this.y = (byte) y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x > Byte.MAX_VALUE || x < Byte.MIN_VALUE){
            throw new IllegalArgumentException(String.format("X value should be from: %d to %d",Byte.MIN_VALUE, Byte.MAX_VALUE));
        } else {
            this.x = (byte) x;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = (byte) y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
