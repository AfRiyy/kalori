/*
* File: CalorieTest.java
* Author: Madarász Dávid
* Copyright: 2021, Madarász Dávid
* Group: Szoft II
* Date: 2021-11-29
* Github: https://github.com/afriyy/
* Licenc: GNU GPL
*/

//Ez az osztály teszteli a Calorie osztályt.
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalorieTest {
    Calorie calorie;
    @BeforeEach
    void setUp(){
        this.calorie = new Calorie();
    }
    @Test
    public void testCalcCalorieWoman(){
        double expected = 1503.963;
        double actual = calorie.calcCalorieWoman(160, 70, 20);
        assertEquals(expected, actual);
    }
    @Test
    public void testCalcCalorieMan(){
        double expected = 1691.986;
        double actual = calorie.calcCalorieMan(160, 70, 18);
        assertEquals(expected, actual);
    }
    @Test
    public void testCalcCalorieWomanAnother(){
        double expected = 1327.158;
        double actual = calorie.calcCalorieWoman(150, 65, 43);
        assertEquals(expected, actual,0.01);
    }
    @Test
    public void testCalcCalorieManAnother(){
        double expected = 1567.85;
        double actual = calorie.calcCalorieMan(157, 69, 35);
        assertEquals(expected, actual,0.01);
    }
    @Test
    public void testCalcCalorieWomanZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieMan(0, 0, 0);
        });
        assertEquals("Nem lehet nulla, vagy az alatt egyik érték sem!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieManZero(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieWoman(0, 0, 0);
        });
        assertEquals("Nem lehet nulla, vagy az alatt egyik érték sem!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieWomanOverWeight(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieWoman(150, 200, 20);
        });
        assertEquals("Nem lehet 200-nál nagyobb a súly!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieManOverWeight(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieMan(150, 200, 20);
        });
        assertEquals("Nem lehet 200-nál nagyobb a súly!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieWomanMinus(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieWoman(-1, -200, -20);
        });
        assertEquals("Nem lehet nulla, vagy az alatt egyik érték sem!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieManMinus(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieMan(-150, -200, -20);
        });
        assertEquals("Nem lehet nulla, vagy az alatt egyik érték sem!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieWomanOverAge(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieWoman(150, 150, 500);
        });
        assertEquals("Nem lehet 100 évesnél idősebb!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieManOverAge(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieMan(150, 150, 500);
        });
        assertEquals("Nem lehet 100 évesnél idősebb!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieWomanUnderAge(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieWoman(150, 150, 5);
        });
        assertEquals("Nem lehet 6 évesnél fiatalabb!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieManUnderAge(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieMan(150, 150, 5);
        });
        assertEquals("Nem lehet 6 évesnél fiatalabb!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieWomanOverHeight(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieWoman(1500, 150, 80);
        });
        assertEquals("Nem lehet 250-nél nagyobb a magasság!", exception.getMessage());
    }
    @Test
    public void testCalcCalorieManOverHeight(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calorie.calcCalorieMan(1500, 150, 80);
        });
        assertEquals("Nem lehet 250-nél nagyobb a magasság!", exception.getMessage());
    }
}
