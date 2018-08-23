package pointline;

public class Line {

    Point begin, end;

    // Getter methods ****************************
    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public int getBeginX() {

        return this.getBegin().getX();

    }

    public int getBeginY() {

        return this.getBegin().getY();
    }

    public int getEndX() {

        return this.getEnd().getX();

    }

    public int getEndY() {

        return this.getEnd().getY();
    }

    public void setBeginX(int x) {

        this.begin.setX(x);
    }

    public void setBeginY(int y) {

        this.begin.setY(y);

    }

    public void setEndX(int x) {

        this.end.setX(x);
    }

    public void setEndY(int y) {

        this.end.setY(y);

    }

    public Point[] getBeginEnd() {

        Point[] point = new Point[2];
        point[0] = this.getBegin();
        point[1] = this.getEnd();

        return point;

    }

    public int[] getBeginYX() {

        int[] result = new int[2];
        result[0] = this.getBegin().getX();
        result[1] = this.getBegin().getY();

        return result;
    }

    public int[] getEndYX() {

        int[] result = new int[2];
        result[0] = this.getEnd().getX();
        result[1] = this.getEnd().getY();

        return result;
    }

    // Setter methods****************************
    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setBeginEnd(Point begin, Point end) {

        this.setBegin(begin);
        this.setEnd(end);

    }

    //Constructors
    public Line() {
    }

    public Line(int x1, int y1, int x2, int y2) {

        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);

    }

    public Line(Point begin, Point end) {

        this.begin = begin;
        this.end = end;

    }

    public void setBeginYX(int x, int y) {

        this.begin.setX(x);
        this.begin.setY(y);
    }

    public void setEndYX(int x, int y) {

        this.end.setX(x);
        this.end.setY(y);
    }

    // toString method****************************
    public String toString() {

        return "Begin point :\t" + this.begin + "\nEnd point :\t" + end;

    }

    //Get the legnth of the line ****************************
    public String getLength() {

        return "The line length is :\t" + this.begin.getDistance(end);

    }

}
