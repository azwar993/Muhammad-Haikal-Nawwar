class Triangle {
    private double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    // versi lebih clean (tanpa parameter ganda)
    public boolean lebihBesarDari(Triangle other) {
        return this.getArea() > other.getArea();
    }

    public boolean lebihKecilDari(Triangle other) {
        return this.getArea() < other.getArea();
    }

    public boolean samaDengan(Triangle other) {
        return this.getArea() == other.getArea();
    }
}

public class latihan3 {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(10, 5);
        Triangle t2 = new Triangle(8, 12);
        Triangle t3 = new Triangle(10, 5);

        System.out.println("=== DATA SEGITIGA ===");
        System.out.println("Luas T1: " + t1.getArea());
        System.out.println("Luas T2: " + t2.getArea());
        System.out.println("Luas T3: " + t3.getArea());

        System.out.println("\n=== PERBANDINGAN ===");
        System.out.println("T1 > T2 : " + t1.lebihBesarDari(t2));
        System.out.println("T1 < T2 : " + t1.lebihKecilDari(t2));
        System.out.println("T1 == T3: " + t1.samaDengan(t3));
    }
}