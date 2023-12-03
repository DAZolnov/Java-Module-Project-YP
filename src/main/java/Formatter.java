public class Formatter {
    double totalPrice;
    int amountOfPeople;

    Formatter(double totalPrice, int amountOfPeople) {
        this.totalPrice = totalPrice;
        this.amountOfPeople = amountOfPeople;
    }

    public void printFinalResult() {
        double averagePrice = totalPrice / amountOfPeople;
        String correctRuble = "рубль";


        int nearestInt = (int) (totalPrice / amountOfPeople);
        if ((nearestInt >= 5) && (nearestInt <= 20)) {
            correctRuble = "рублей";
        } else {
            switch (nearestInt % 10) {
                case 1: {
                    correctRuble = "рублю";
                    break;
                }
                case 2, 3, 4: {
                    correctRuble = "рубля";
                    break;
                }
                case 5, 6, 7, 8, 9, 0: {
                    correctRuble = "рублей";
                    break;
                }
            }
        }


        String template = "Каждому придется заплатить по %.2f ";
        System.out.println(String.format(template, averagePrice) + correctRuble);
    }
}
