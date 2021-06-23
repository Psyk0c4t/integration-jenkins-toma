package fr.epsi.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void init(){
        System.out.println("---------------------------");
        System.out.println("Init globale");
        this.calculator = new Calculator();
    }
    @Test
    public void should_add_two_numbers(){
        int a = 3;
        int b = 6;
        int result = a + b;
        Assertions.assertEquals(result, this.calculator.add(a, b));
        System.out.println("Addition terminé");
    }
    @Test
    public void should_substract_two_numbers(){
        int a = 3;
        int b = 6;
        int result  = a - b;
        Assertions.assertEquals(result, this.calculator.substract(a, b));
        System.out.println("Soustraction terminé");
    }
    @Test
    public void should_multi_two_numbers(){
        int a = 3;
        int b = 6;
        int result = a*b;
        Assertions.assertEquals(result, this.calculator.multi(a, b));
        System.out.println("Multiplication terminé");
    }
    @Test
    public void should_div_two_numbers(){
        int a = 3;
        int b = 6;
        int result = 3/6;
        Assertions.assertEquals(result, this.calculator.div(a, b));
        System.out.println("Division terminé");
    }
    @Test
    public void add_tableau(){
        int[] nmbers = {1,2,3,4,5};
            Assertions.assertEquals(10, this.calculator.add(nmbers));
            System.out.println("Tableau terminé");
        }
    }
