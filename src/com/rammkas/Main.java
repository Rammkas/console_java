package com.rammkas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        String readData;
        boolean exit = false;

        SecondMe smObj = new SecondMe(10);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Привет");
        smObj.printMe();
        try {
            do {
                System.out.print("Введите число: ");
                readData = br.readLine();
                if (readData.matches("[0-9]+")) {
                    System.out.print("Введенное число: ");
                    System.out.println(readData);
                    smObj.changeMe(Integer.parseInt(readData));
                    smObj.printMe();
                }else
                    System.out.println("Нужно было ввести число!");
                System.out.println("Выход? (Y'es / N'o)");
                readData = br.readLine();
                if (readData.equalsIgnoreCase("y")) exit = true;
            }while (exit != true);
        }
        catch(NumberFormatException nfe){
            System.err.println("Неправильный формат!");
        }

    }
}
