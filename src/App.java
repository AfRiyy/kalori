/*
* File: App.java
* Author: Madarász Dávid
* Copyright: 2021, Madarász Dávid
* Group: Szoft II
* Date: 2021-11-29
* Github: https://github.com/afriyy/
* Licenc: GNU GPL
*/

import java.util.Scanner;

public class App {
    static Calorie calorie;
    static Scanner scanner;
    public static void main(String[] args) throws Exception {
        init();
    }
    public static void init(){
        scanner = new Scanner(System.in);
        calorie = new Calorie();
        System.out.println("Válassz kalkulátort: Férfi[1] - Nő[2]");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                {
                calculateForMan();
                break;}
            case 2:
                {
                calculateForWoman();
                break;}
            default:
                System.out.println("Ez a szám nem jó! Férfi[1] - Nő[2]");
                break;
        }
    }
    public static void calculateForMan(){
        System.out.println("Kalória számítás Férfiaknak");
        System.out.println("Írd be a magasságot");
        double height = scanner.nextDouble();
        System.out.println("Írd be a súlyt");
        double weight = scanner.nextDouble();
        System.out.println("Írd be a kort");
        double age = scanner.nextDouble();
        double result = calorie.calcCalorieMan(height, weight, age);
        System.out.println("A számított kalória: "+result+" kalória!");
    }
    public static void calculateForWoman(){
        System.out.println("Kalória számítás Nőknek");
        System.out.println("Írd be a magasságot");
        double height = scanner.nextDouble();
        System.out.println("Írd be a súlyt");
        double weight = scanner.nextDouble();
        System.out.println("Írd be a kort");
        double age = scanner.nextDouble();
        double result = calorie.calcCalorieWoman(height, weight, age);
        System.out.println("A számított kalória: "+result+" kalória!");
    }
}
