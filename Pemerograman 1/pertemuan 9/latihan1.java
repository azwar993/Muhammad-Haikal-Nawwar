abstract class Latihan1 {
    public void breath() {
        System.out.println("Berfikir menggunakan otak");
    }

    public void eat() {
        System.out.println("Makan melalui mulut");
    }

    public abstract void walk();
}

class Human extends Latihan1 {
    @Override
    public void walk() {
        System.out.println("Makan Menggunakan Kedua Lengan");
    }
}

public class latihan1 {
    public static void main(String[] args) {
        Human h = new Human();
        h.breath();
        h.eat();
        h.walk();
    }
}