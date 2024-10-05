import java.util.*;

/*
 Shape data for ShapeClient:
 "0 0  0 1  1 1  1 0"
 "10 10  10 11  11 11  11 10"
 "0.5 0.5  0.5 -10  1.5 0"
 "0.5 0.5  0.75 0.75  0.75 0.2"
*/

public class Shape {
    private List<Point> points;
    private Point center;
    private double radius;

    public Shape(String s){
        String[] a = s.split("\\s+");
        points = new ArrayList<>();
        for(int i = 1; i < a.length; i+=2){
            points.add(new Point(Double.parseDouble(a[i]), Double.parseDouble(a[i-1])));
        }

        double sum1 = 0, sum2 = 0;
        for(Point p : points){
            sum1 += p.getX();
            sum2 += p.getY();
        }
        int n = points.size();
        center = new Point(sum1/n, sum2/n);

        radius = 10000000;

        for(Point p : points){
            radius = Math.min(radius, center.distance(p));
        }

    }

    public boolean checkCross(Shape other){
        for (Point point : points) {
            if (other.contains(point)) {
                return true; // A cắt B
            }
        }
        return false;
    }


    private boolean contains(Point point) {
        double distance = center.distance(point);
        return distance < radius; // Kiểm tra xem điểm có nằm trong đường tròn không
    }

    public int encircle(Shape other){
        if(center.distance(other.center) < radius){
            return 2;
        } else if(center.distance(other.center) < (radius + other.radius)){
            return 1;
        }
        return 0;
    }
}

