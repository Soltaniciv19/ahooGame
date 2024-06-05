package student.examples;

public class Window implements HasCoordinate {
    private Coordinate coordinate;

    public Window(int x, int y){
        this.coordinate = new Coordinate(x,y);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public void setCoordinate(int x, int y) {
        this.coordinate = new Coordinate(x,y);
    }

    @Override
    public String toString() {
        return "Window{" +
                "coordinate=" + coordinate +
                '}';
    }
}
