public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int amount = 3333;

        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }

        int total = balance + amount + bonus;

        System.out.println("Бонусы:" + bonus);
        System.out.println("Итоговый счет:" + total);

        
    }
}