package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    static String output = "";
    static String[] words = {"apple", "oranges", "peaches", "plums", "cut", "grow",
            "grapes", "swear", "hello", "auto-tune", "banana", "pear", "a", "potato", "hearts"};

    public static void main(String[] args) throws InterruptedException {

        System.out.print("ARE YOU READY???\n");
        TimeUnit.SECONDS.sleep(1);
        for (int i = 3; i > 0; i--) {
            System.out.println(i);
            TimeUnit.SECONDS.sleep(1);
        }
        for (int i = 1; i < 12; i++) {
            Random rand = new Random();
            output = output + words[rand.nextInt(words.length - 1)] + " ";
        }
        System.out.print("\n"+ output);
        System.out.print("\n");
        while (true) {
            Instant start = Instant.now();
            Scanner input = new Scanner(System.in);
            String user_words = input.nextLine();
            Instant end = Instant.now();
            Duration time_span = Duration.between(start, end);
            System.out.print(time_span.toMillis());
            if (output.equals(user_words + " ")){
                break;
            } else {
                System.out.print("\nYou spelled it wrong fam \n");
                System.out.print(output + "\n");
            }
        }
    }
}
