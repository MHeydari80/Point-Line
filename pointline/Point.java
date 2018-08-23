package pointline;

public class Point {
    
    private final int POWER=2;

    private int x, y;

    // Getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[] getXY() {

        int result[] = new int[2];
        result[0] = this.getX();
        result[1] = this.getY();

        return result;

    }

    // Setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {

        this.setX(x);
        this.setY(y);

    }

    // Constructor
    public Point() {

    }

    public Point(int x, int y) {

        this.setX(x);
        this.setY(y);

    }

    // Distance based on 0 
    public double getDistance() {

        return Math.sqrt(Math.pow(x, POWER)+Math.pow(y, POWER));

    }

    //Distance based on 2 points
    public double getDistance(int x, int y) {

        int xDistance = this.x - x;
        int yDistance = this.y - y;
        return Math.sqrt(Math.pow(xDistance, POWER) + Math.pow(yDistance, POWER));

    }

    public double getDistance(Point point) {

        int xDistance = this.x - point.x;
        int yDistance = this.y - point.y;

        return Math.sqrt(Math.pow(xDistance, POWER) + Math.pow(yDistance, POWER));
    }
    
    //toString method

    public String toString() {

        return String.format("\nX : %d\nY : %d\nThe distance based on zero : %f\n", this.getX(), this.getY(),this.getDistance());

    }
}
