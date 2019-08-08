public class Program {
    public static void main(String[] args) {
        System.out.println((Intersection.findSequence(new int[]{0, 0, 0, 1}, new int[]{1, 0, 1, 1}).equals("NO")) ? "PASS" : "FAIL");
        System.out.println((Intersection.findSequence(new int[]{0, 0, 0, 1}, new int[]{0, 1, 0, 2}).equals("POINT")) ? "PASS" : "FAIL");
        System.out.println((Intersection.findSequence(new int[]{0, -1,0, 1}, new int[]{-1, 0, 1, 0}).equals("POINT")) ? "PASS" : "FAIL");
        System.out.println((Intersection.findSequence(new int[]{0, 0, 2, 0 }, new int[]{1 ,0,10, 0}).equals("SEGMENT")) ? "PASS" : "FAIL");
        System.out.println((Intersection.findSequence(new int[]{5, 5, 5, 5 }, new int[]{6, 6, 6, 6}).equals("NO")) ? "PASS" : "FAIL");
        System.out.println((Intersection.findSequence(new int[]{10, 0,-10,0}, new int[]{5, 0, -5,0}).equals("SEGMENT")) ? "PASS" : "FAIL");
    }
}