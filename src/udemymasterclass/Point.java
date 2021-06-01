package udemymasterclass;

public class Point {

    private int x, y;

    public Point() {}

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(int x, int y) {
        int xDist = this.x - x;
        int yDist = this.y - y;
        return Math.sqrt( (xDist * xDist) + (yDist * yDist) );
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point p) {
        return distance( p.getX(), p.getY() );
    }

}