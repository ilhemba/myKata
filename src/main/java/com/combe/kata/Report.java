package com.combe.kata;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class Report implements Serializable {


    public static void printReport() {
        try {
            FileWriter fileWriter = new FileWriter("report.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            //printWriter.printf("Your report is ready at %d!",System.);
            printWriter.printf("The current quantity of tea sold is %d \n ",Tea.drinkSold);
            printWriter.printf("The current quantity of chocolate sold is %d \n ",Chocolate.drinkSold);
            printWriter.printf("The current quantity of coffee sold is %d \n ",Coffe.drinkSold);
            printWriter.printf("The current quantity of juice sold is %d \n ",Juice.drinkSold);
            printWriter.printf("The total amount earned so far is %f \n ",Drink.totalAmount);
            printWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}





