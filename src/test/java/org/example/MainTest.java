package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void testEmpty() { //Test de String vacio.
        Assert.assertTrue(Main.esPalindromo(""));
    }
    @Test
    public void testMayusAS() { //Test de String palindromico con mayusculas no simetricas.
        Assert.assertTrue(Main.esPalindromo("Hooh"));
    }
    @Test
    public void testSingleChar() { //Test de String de un solo caracter.
        Assert.assertTrue(Main.esPalindromo("b"));
    }
    @Test
    public void testSpacesWithin() { //Test de String con espacios, que seria palindromico sin espacios
        Assert.assertTrue(Main.esPalindromo("anita lava la tina"));
    }
    @Test
    public void testDiacritic() { //Test de String con simbolos diacriticos, que es palindromo sin simbolos diacriticos.
        Assert.assertTrue(Main.esPalindromo("aérea"));
    }
    @Test
    public void testNonPalindrome() { //Test de String no palindromico.
        Assert.assertFalse(Main.esPalindromo("ardilla"));
    }
    @Test
    public void testParagraph() { //Test de parrafo palindromico.
        Assert.assertTrue(Main.esPalindromo("""
                'Amor azul' Ramera, de todo te di. Mariposa colosal, sí, yo de todo te di.

                Poda la rosa, Venus. El átomo como tal es un evasor alado.

                Pide, todo te doy: isla, sol, ocaso, pirámide. Todo te daré: mar, luz, aroma."""));
    }
}