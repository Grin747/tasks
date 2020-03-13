package task2;

import org.jetbrains.annotations.Nullable;

import java.util.stream.IntStream;

public class Main {
    /**
     * Метод "скидка". Применяет скидку discount к цене price, начиная с позиции offset * на количество позиций readLength. Новые цены округляем “вниз”,
     * до меньшего целого числа.
     * @param price - исходные цены.
     * @param discount - % скидки, от 1 до 99.
     * @param offset - номер позиции, с которой нужно применить скидку.
     * @param readLength - количество позиций, к которым нужно применить скидку.
     * @return - массив новых цен.
     */
    public static @Nullable
    int[] decryptData(int[] price, int discount,
                      int offset, int readLength) {
        if(price.length == 0) return null;
        return IntStream.of(price).skip(offset).limit(readLength).map(it -> (int)(it * (double)discount/100.0)).toArray();
    }

    public static void main(String[] args){
        int[] prices = new int[]{
                5, 100, 16, 66, 20, 50, 10
        };

        int[] newPrices = decryptData(prices, 50, 1, 4);
    }
}
