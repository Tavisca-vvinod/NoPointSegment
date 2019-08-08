public class LineSegment {
    Point start;
    Point end;
    public LineSegment(int x1,int y1,int x2,int y2) {

        if ((x1 == x2 && y1 > y2) || (y1 == y2 && x1 > x2)) {
            this.start = new Point(x2, y2);
            this.end = new Point(x1, y1);
        } else {
            this.start = new Point(x1, y1);
            this.end = new Point(x2, y2);
        }
    }
}
