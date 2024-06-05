package student.examples;

public abstract class Shape implements HasCoordinate {
    private Coordinate coordinate;

    public Shape(){

    }

    public Shape(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "coordinate=" + coordinate +
                '}';
    }
}
