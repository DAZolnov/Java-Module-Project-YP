import java.util.Scanner;

public class Product {
    String nameOfProduct;
    double priceOfProduct;


    Product(String nameOfProduct, double priceOfProduct) {
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
    }

    Scanner scannerProduct = new Scanner(System.in);

    public double printListOfProducts() {

        while (true) {
            System.out.println("Введите название нового товара. Если хотите прекратить, введите \"завершить\"");
            String oneMoreProduct = scannerProduct.next();
            if (oneMoreProduct.equalsIgnoreCase("завершить")) {
                break;
            } else {
                if (!(oneMoreProduct.trim().isEmpty())) {
                    nameOfProduct += oneMoreProduct + "\n";
                    priceOfProduct += calcPrice(oneMoreProduct);
                    scannerProduct.nextLine();
                } else {
                    System.out.println("Введите корректное наименование товара: пробелы не считаются!");
                    scannerProduct.nextLine();
                }
            }
        }
        System.out.println("Добавленные товары:\n" + nameOfProduct);
        scannerProduct.close();
        return priceOfProduct;
    }

    public double calcPrice(String nameOfProduct) {
        //double oneMorePrice = 0;
        System.out.println("Введите стоимость товара \"" + nameOfProduct + "\" в формате рубли.копейки");
        while (true) {
            if (scannerProduct.hasNextDouble()) {
                double oneMorePrice = scannerProduct.nextDouble();
                if (oneMorePrice > 0) {
                    return oneMorePrice;
                } else {
                    System.out.println("Вы ввели некорректное значение.\nПожалуйста, будьте внимательны и введите число больше 0");
                }
            } else {

                System.out.println("Неверный ввод данных. Пожалуйста, введите ЧИСЛОВОЙ эквивалент стоимости");
                scannerProduct.nextLine();
            }
        }
    }
}
