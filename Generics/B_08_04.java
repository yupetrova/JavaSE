import java.util.PriorityQueue;

class Point implements Comparable<Point> {
    double x, y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }
    
    @Override
    public int compareTo(Point other) {
        return Double.compare(this.distanceFromOrigin(), other.distanceFromOrigin());
    }
    
    @Override
    public String toString() {
        return "(" + x + ", " + y + ") distance: " + String.format("%.2f", distanceFromOrigin());
    }
}

public class B_08_04 {
    public static void main(String[] args) {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        
        pq.add(new Point(3, 4));
        pq.add(new Point(1, 1));
        pq.add(new Point(5, 0));
        pq.add(new Point(2, 2));
        pq.add(new Point(0, 3));
        pq.add(new Point(6, 8));
        
        System.out.println("====TEST====");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}