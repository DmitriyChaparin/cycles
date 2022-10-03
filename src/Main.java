public class Main {
    public static void main(String[] args) {

        //Задание 1
        for (int i = 0; i <= 10; i++) {
            System.out.print(" " +i );
        }
        System.out.println("\n");

        //Задание 2
        for (int q = 10; q >= 1; q--) {
            System.out.print( " " + q );
        }
        System.out.println("\n");

        //Задание 3
        for (int w = 2; w <= 17; w = w + 2) {
            System.out.print(" " + w );
        }
        System.out.println("\n");

        //Задание 4
        for (int e = 10; e >= -10; e--) {
            System.out.print(" " + e );
        }
        System.out.println("\n");

        //Домашнее задание 2
        //Задание1
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високостным.");
        }
        System.out.println("\n");

        //Задание 2
        for (int r = 7; r <= 98; r = r + 7) {
            System.out.print(" " + r);
        }
        System.out.println("\n");

        //Задание 3
        int y = 1;
        for (int t = 2; t <= 512; t = t * 2) {
            System.out.print(y + " " + t);
        }
        System.out.println("\n");

        //Домашнее задание 3
        //Задание 1
        int deposit = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total + " рублей.");
        }

        //Задание 2
        int deposit1 = 29_000;
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1= total1 + total1/100;
            total1 = total1 + deposit1;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total1 + " рублей.");
        }
    }
}