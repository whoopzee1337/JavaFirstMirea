package ru.mirea.lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        try(FileWriter writer = new FileWriter("TextFile1")){
            writer.write(text);
            writer.flush();
        }
        catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
