package example5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static Translater generateTranslater() {
        int random = ThreadLocalRandom.current().nextInt(2);
        if (random == 0) {
            return new YandexTranslater();
        } else {
            return new GoogleTranslater();
        }
    }

    public static void main(String[] args) {
        Translater t = generateTranslater();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String translation = t.translate(scanner.next());
        System.out.println(translation);

    }
}
