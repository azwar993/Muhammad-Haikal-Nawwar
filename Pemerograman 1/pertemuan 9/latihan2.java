class Rectangle {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public boolean isGreater(Rectangle a, Rectangle b) {
        return a.getArea() > b.getArea();
    }

    public boolean isLess(Rectangle a, Rectangle b) {
        return a.getArea() < b.getArea();
    }

    public boolean isEqual(Rectangle a, Rectangle b) {
        return a.getArea() == b.getArea();
    }
}

public class latihan2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10); // luas 20
        Rectangle r2 = new Rectangle(8, 9); // luas 42
        Rectangle r3 = new Rectangle(10, 7); // luas 20

        System.out.println("Luas Rectangle 1: " + r1.getArea());
        System.out.println("Luas Rectangle 2: " + r2.getArea());
        System.out.println("Luas Rectangle 3: " + r3.getArea());

        System.out.println("Rectangle1 > Rectangle2 ? " + r1.isGreater(r1, r2));
        System.out.println("Rectangle1 < Rectangle2 ? " + r1.isLess(r1, r2));
        System.out.println("Rectangle1 == Rectangle3 ? " + r1.isEqual(r1, r3));
    }
}