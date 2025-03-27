public class Rectangle extends Shape {

    private Point topLeft;
    private int sideA , sideB;
    public static int counter=0;
    public  int counterforojobject =0;
    public static String class_name ="Rectangle"

    public Rectangle(Point topLeft, int sideA, int sideB) {

        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterforojobject++;


    }

    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA <=  0){
            throw new IllegalArgumentException("side a cant be negative")
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }
    public double perimeter(){
        return 2 * (sideA + sideB);
    }
    public double area(){
        return sideA * sideB;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", location=" + this.getLocation() +
                ", sideB=" + sideB +
                '}';
    }
}
