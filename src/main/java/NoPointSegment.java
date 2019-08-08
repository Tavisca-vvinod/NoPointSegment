import java.util.ArrayList;

public class NoPointSegment {
    public static String findIntersection(int[] line1Points, int[] line2Points) {
        LineSegment line1 = new LineSegment(line1Points[0],line1Points[1],line1Points[2],line1Points[3]);
        LineSegment line2 = new LineSegment(line2Points[0],line2Points[1],line2Points[2],line2Points[3]);
        line1.Points=findPointsOnLine(line1);
        line2.Points=findPointsOnLine(line2);
        return " ";
    }
    public static ArrayList<Integer[]> findPointsOnLine(LineSegment line)
    {
        return null;
    }
}
