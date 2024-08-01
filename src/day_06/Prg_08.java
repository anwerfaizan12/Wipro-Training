package day_06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Prg_08 {

    public static void readNumbers() throws FileNotFoundException, PositiveNumberException {
        File f = new File("C:\\Users\\Administrator\\Desktop\\f4.txt");
        FileInputStream in = null;
        Scanner scanner = null;

        try {
            in = new FileInputStream(f);
            scanner = new Scanner(in);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] numbers = line.split(" ");
                for (String num : numbers) {
                    int val = Integer.parseInt(num.trim());
                    if (val > 0) {
                        throw new PositiveNumberException("Number " + val + " is positive.");
                    }
                    System.out.println("Number: " + val);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (PositiveNumberException e) {
            throw e;
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("Failed to close the input stream: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        try {
            readNumbers();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

class PositiveNumberException extends Exception {
    public PositiveNumberException(String message) {
        super(message);
    }
}



