public class shape {
    private point location;

    public Shape(point location) {
        this.location = location;
    }

    public point getLocation() {
        return location;
    }

    public void setLocation(point location) {
        this.location = location;
    }
    public  double area(){
        System.out.println();
        return 0;

    }
    public  double perimeter(){
        System.out.println();
        return 0;
    }

    @Override
    public String toString() {
        return "shape{" +
                "location=" + location +
                '}';
    }
}
