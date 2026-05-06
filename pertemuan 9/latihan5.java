class Line {
    private double x1, y1, x2, y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getLength() {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean lebihPanjangDari(Line other) {
        return this.getLength() > other.getLength();
    }

    public boolean lebihPendekDari(Line other) {
        return this.getLength() < other.getLength();
    }

    // pakai toleransi biar lebih akurat
    public boolean samaPanjang(Line other) {
        return Math.abs(this.getLength() - other.getLength()) < 0.0001;
    }

    // tambahan biar beda & lebih OOP
    @Override
    public String toString() {
        return "(" + x1 + "," + y1 + ") ke (" + x2 + "," + y2 + ")";
    }
}

public class latihan5 {
    public static void main(String[] args) {

        Line l1 = new Line(0, 3, 0, 4);
        Line l2 = new Line(0, 6, 0, 8);

        System.out.println("=== DATA GARIS ===");
        System.out.println("Line 1: " + l1);
        System.out.println("Line 2: " + l2);

        System.out.println("\n=== PANJANG ===");
        System.out.println("Panjang L1: " + l1.getLength());
        System.out.println("Panjang L2: " + l2.getLength());

        System.out.println("\n=== PERBANDINGAN ===");
        System.out.println("L1 > L2 : " + l1.lebihPanjangDari(l2));
        System.out.println("L1 < L2 : " + l1.lebihPendekDari(l2));
        System.out.println("L1 == L2: " + l1.samaPanjang(l2));
    }
}