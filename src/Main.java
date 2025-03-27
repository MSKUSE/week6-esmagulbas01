import java.awt.*;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Main {
    public static void main(String[] args) {

        /*Point p = new Point(3,4);
        Rectangle r1 = new Rectangle(p,3,4);
        System.out.println(r1.counterforojobject);
        System.out.println(Rectangle.counter);
        Rectangle r2 = new Rectangle(p,4,5);
        System.out.println(r1.counterforojobject);
        System.out.println(r2.counterforojobject);
        System.out.println(Rectangle.counter);
        System.out.println(Integer.max(3,4));
        System.out.println(Integer.parseInt("1"));
        String a = new String("aaa");
        System.out.println(a);
        System.out.println(r1);*/

        /*System.out.println(p1.xCoord);
        System.out.println(p1.yCoord);

        Point p2 = new Point(3 ,4);
        System.out.println(p2.xCoord);
        System.out.println(p2.yCoord);

        Point p3 = new Point(5);
        System.out.println(p3.xCoord);
        System.out.println(p3.yCoord);

        Point tLeft = new Point(3 ,4);
        Rectangle r1 = new Rectangle(
                tLeft,
                -1,
                4
        );
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().xCoord);
        System.out.println(r1.getTopLeft().yCoord);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        Circle c1 = new Circle(
                new Point(3,4),
                5
        );
        System.out.println(c1.getRadius());

        c1.setRadius(-21);
        System.out.println(c1.getRadius());*/
        Shape shape= new Shape() {
            @Override
            public Rectangle getBounds() {
                return null;
            }

            @Override
            public Rectangle2D getBounds2D() {
                return null;
            }

            @Override
            public boolean contains(double x, double y) {
                return false;
            }

            @Override
            public boolean contains(Point2D p) {
                return false;
            }

            @Override
            public boolean intersects(double x, double y, double w, double h) {
                return false;
            }

            @Override
            public boolean intersects(Rectangle2D r) {
                return false;
            }

            @Override
            public boolean contains(double x, double y, double w, double h) {
                return false;
            }

            @Override
            public boolean contains(Rectangle2D r) {
                return false;
            }

            @Override
            public PathIterator getPathIterator(AffineTransform at) {
                return null;
            }

            @Override
            public PathIterator getPathIterator(AffineTransform at, double flatness) {
                return null;
            }
        }

    }
}