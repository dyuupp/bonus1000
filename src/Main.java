public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int refill = 1100;
        if (refill > 1_000) {
            int bonus = refill / 100;
            System.out.println("На счету " + (balance + refill + bonus));
            System.out.println("С бонусом " + bonus);
        } else {
            System.out.println("На счету " + (balance + refill));
        }
    }

}