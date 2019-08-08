import java.util.ArrayList;
public class NoPointSegment {
    public static String findIntersection(int[] line1Points, int[] line2Points) {
        LineSegment line1 = new LineSegment(line1Points[0],line1Points[1],line1Points[2],line1Points[3]);
        LineSegment line2 = new LineSegment(line2Points[0],line2Points[1],line2Points[2],line2Points[3]);
        line1.Points=PointsFinder.findPointsOnLine(line1);
        line2.Points=PointsFinder.findPointsOnLine(line2);
        int count=PointsFinder.PointsInCommonFinder(line1, line2);
        String relation=NoPointSegment.RelationFinder(count);
        return relation;
    }
    private static String RelationFinder(int count)
    {
        if(count>=2)
        {
            return "SEGMENT";
        }
        if(count==1)
        {
            return "POINT";
        }
        return "NO";
    }
}
