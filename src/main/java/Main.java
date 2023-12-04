import java.util.Scanner;
import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Привет, на какое количество людей поделим счет?\nПожалуйста, введите целое число больше 1");
        Scanner scanner = new Scanner(System.in);
        int amountOfPeople;
        while (true) {
            if (scanner.hasNextInt()) {
                amountOfPeople = scanner.nextInt();
                if (amountOfPeople > 1) {
                    System.out.println("Количество людей, на которых поделим счет: " + amountOfPeople);
                    break;
                } else {
                    System.out.println("Вы ввели некорректное значение.\nПожалуйста, будьте внимательны и введите целое число больше 1");
                }
            } else {
                scanner.nextLine();
                System.out.println("Неверный ввод данных. Пожалуйста, введите ЦЕЛОЕ число больше 1");
            }
        }


        Product product = new Product("", 0);
        double totalPrice = product.printListOfProducts();

        Formatter formatter = new Formatter(totalPrice, amountOfPeople);
        formatter.printFinalResult();
        scanner.close();
    }
}

