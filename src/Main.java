public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1 ;i <= 10;i++) {
            System.out.println(i);
        }
        System.out.println("Task 2");
        for (int i = 10 ;i >= 1;i--) {
            System.out.println(i);
        }
        System.out.println("Task 3");
        for (int i = 0 ;i < 17;i += 2 ) {
            System.out.println(i);
        }
        System.out.println("Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println("Task 5");
        for (int i = 1094;i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println("Task 6");
        for (int i = 7;i <= 98;i += 7) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println("Task 7");
        for (int i = 1;i <= 512;i *= 2) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println("Task 8");
        int moneyInMonth = 29000;
        int total = 0;
        for (int i = 1;i <= 12;i++) {
           total = total + moneyInMonth;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Task 9");
        int moneyInMonth2 = 29000;
        int total2 = 0;
        for (int i = 1;i <= 12;i++) {
            total2 = total2 + total2/100;
            total2 = total2 + moneyInMonth2;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println("Task 10");
        int a = 2;
        for (int i = 1;i <= 10;i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }
    }
}