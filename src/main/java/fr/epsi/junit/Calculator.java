package fr.epsi.junit;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int add(int[] nmbers) {
        int[] tableau = nmbers;
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i - 5;
        }
        int somme = 1+2+3+4+5;
        for (int val : tableau) {
            somme += val;
            return somme;
        }
        return somme;
    }
}