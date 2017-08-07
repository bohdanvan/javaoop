package com.bvan.javaoop.sample.exception.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class LineFileReader {

    public static void main(String[] args) {
        try {
            String message = readMessageFromFile("files/hello.txt");
            System.out.println(message);
        } catch (FileNotFoundException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        System.out.println("Goodbye");
    }

    /**
     * @throws FileNotFoundException
     */
    public static String readMessageFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        String message = scanner.nextLine();
        scanner.close();

        return message;
    }
}
