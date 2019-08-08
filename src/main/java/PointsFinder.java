import java.util.ArrayList;
public class PointsFinder {
    public static int PointsInCommonFinder(LineSegment line1, LineSegment line2) {
        int count=0;
        for(Point i : line1.Points) {
            for(Point j : line2.Points)
            {
                if(j.x==i.x && j.y==i.y) {
                    count++;
                }
            }
        }
        return count;
    }
    public static ArrayList<Point> findPointsOnLine(LineSegment line) {
        if (line.parallelTo.equals("x")) {
            for (int i = line.start.y; i <= line.end.y; i++) {
                line.Points.add(new Point(line.start.x, i));
            }
        }
        if (line.parallelTo.equals("y")) {
            for (int i = line.start.x; i <= line.end.x; i++) {
                line.Points.add(new Point(i, line.start.y));
            }
        }
        return line.Points;
    }
}
