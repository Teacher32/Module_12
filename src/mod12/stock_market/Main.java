package mod12.stock_market;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StockAccount stockAccount = new StockAccount(); // заводим счет на бирже
        StockAccount.start(); // запускаем счет в работу    // ПОЧЕМУ КРАСНОЕ ПОДЧЕРКИВАНИЕ?
        long profit = 0;        // переменная прибыли
        // далее блок управления с вводом данных от пользователя
        Scanner scanner = new Scanner(System.in);
        String command = "";    // начальное значение переменной, которая хранит введенные пользователем данные
        while(!command.equals("exit")) {    // пока не будет введена команда "exit", выполнять switch-case
            command = in.next();    // ПОЧЕМУ ТУТ ОШИБКА????
            switch(command) {
                case "check":
                    System.out.println(stockAccount.money);
                    break;
                case "fix":
                    profit += (long) stockAccount.money - 1000; // фиксация прибыли
                    System.out.println("Прибыль: " + profit);
                    stockAccount.money = 1000;  // минимальный остаток
            }
        }

    }
}
