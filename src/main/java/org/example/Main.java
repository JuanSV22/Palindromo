package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(esPalindromo("ae oea"));
    }

    public static boolean esPalindromo(String cadena) {
        String resultado;
        resultado = new StringBuilder(cadena).reverse().toString();
        return cadena.equals(resultado);
    }
}