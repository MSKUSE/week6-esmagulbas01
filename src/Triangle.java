public class Triangle extends {
    private point Triangle;
    private double sideA,sideB,sideC;



    @Override
    public  double perimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public double area() {
        return (sideA * sideB)/2;
    }
}
