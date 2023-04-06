package org.example;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
    }

    public static boolean esPalindromo(String cadena) { //Removes String
        return purifyString(cadena).equals(purifyString(new StringBuilder(cadena).reverse().toString()));
    }
    public static String purifyString(String cadena) {
        return StringUtils.lowerCase(StringUtils.stripAccents(StringUtils.deleteWhitespace(cadena.strip()))).replaceAll("\\p{P}", "");
    }
}