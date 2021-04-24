package mod12.stock_market;

import java.lang.Thread;

public class StockAccount extends Thread {
    int money = 1000;   // сумма вложения

    @Override
    public void run() {
        while(true) {   // постоянная капитализация
            money++;
        }
    }
}
