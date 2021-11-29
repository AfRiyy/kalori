/*
* File: Calorie.java
* Author: Madarász Dávid
* Copyright: 2021, Madarász Dávid
* Group: Szoft II
* Date: 2021-11-29
* Github: https://github.com/afriyy/
* Licenc: GNU GPL
*/

//Ez a program kiszámolja egy ember napi kalória szükségletét.
public class Calorie {
    double calcCalorieWoman(double height,double weight, double age){
        if(weight <= 0 || age <= 0 || height <= 0){
            throw new IllegalArgumentException("Nem lehet nulla, vagy az alatt egyik érték sem!");
        }
        if(weight >= 200){
            throw new IllegalArgumentException("Nem lehet 200-nál nagyobb a súly!");
        }
        if(weight < 30){
            throw new IllegalArgumentException("Nem lehet 30-nál kisebb a súly!");
        }
        if(age <= 6){
            throw new IllegalArgumentException("Nem lehet 6 évesnél fiatalabb!");
        }
        if(age >= 100){
            throw new IllegalArgumentException("Nem lehet 100 évesnél idősebb!");
        }
        if(height < 130){
            throw new IllegalArgumentException("Nem lehet 130-nál kisebb a magasság!");
        }
        if(height >= 250){
            throw new IllegalArgumentException("Nem lehet 250-nél nagyobb a magasság!");
        }
        return ((9.247*weight)+(3.098*height)-(4.330*age)+447.593);
    }
    double calcCalorieMan(double height,double weight, double age){
        if(weight <= 0 || age <= 0 || height <= 0){
            throw new IllegalArgumentException("Nem lehet nulla, vagy az alatt egyik érték sem!");
        }
        if(weight >= 200){
            throw new IllegalArgumentException("Nem lehet 200-nál nagyobb a súly!");
        }
        if(weight < 30){
            throw new IllegalArgumentException("Nem lehet 30-nál kisebb a súly!");
        }
        if(age <= 6){
            throw new IllegalArgumentException("Nem lehet 6 évesnél fiatalabb!");
        }
        if(age >= 100){
            throw new IllegalArgumentException("Nem lehet 100 évesnél idősebb!");
        }
        if(height < 130){
            throw new IllegalArgumentException("Nem lehet 130-nál kisebb a magasság!");
        }
        if(height >= 250){
            throw new IllegalArgumentException("Nem lehet 250-nél nagyobb a magasság!");
        }
        return ((13.397*weight)+(4.799*height)-(5.667*age)+88.362);
    }
}
