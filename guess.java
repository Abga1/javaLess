import java.util.Scanner;

public class guess {


    public static void main(String[] args) {
        int range = 100;
        int number = (int)(Math.random() * (double)range);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число от 0 до 100!");

        while(true) {
            System.out.print("Введите число:");
            int a = scanner.nextInt();
            if (number == a) {
                System.out.println("Вы победили!");
                scanner.close();
                return;
            }

            if (number < a) {
                System.out.println("Число " + a + " больше того, что загадал компьютер.");
            } else if (number > a) {
                System.out.println("Число " + a + " меньше того, что загадал компьютер.");
            }
        }
    }
}
