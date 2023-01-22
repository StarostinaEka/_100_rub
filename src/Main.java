public class Main {
    public static void main(String[] args) {
        int clientsAccount = 100;
        int depositAccount = 1100;

        int bonus;

        if (depositAccount > 1000) {
            bonus = depositAccount / 100;//формула подсчета бонусных рублей за каждые доп внесенные 100р на депозит.
        } else {
            bonus = 0;
        }
        int total = clientsAccount + depositAccount + bonus;
        System.out.println("Ваш итоговый счет: " + total + " руб.");
        System.out.println("Ваш бонус: " + bonus + " руб.");

    }
}
