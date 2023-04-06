1. 1. 1. ¿Que hace el metodo?
    Recibe un String, y revisa si es un palindromo, si lo es, retorna un booleano verdadero o falso.
1. 1. 2. ¿Como lo hace?
    Al recibir el String "cadena", crea otro String "resultado" vacio, el cual es el String "cadena" dado, pero primero separado en
    un Array de Strings de un solo caracter, invierte el orden del Array, y luego reuna el Array en un String. Retornando un booleano
    que dice si entre ambos cadena y resultado, hay una igualdad exacta.
1. 1. 3. ¿Como lo uso? Da un ejemplo.
    Se le ingresa un String, por ejemplo, "girafarig", y se espera que retorne si es palindromo o no. En este caso deberia retornar true.
2. 2. Construya en grupo ahora una versión Java que sea 100% equivalente en funcionalidad (lo bueno y lo malo) al anterior método.
   public static boolean esPalindromo(String cadena) {
         String resultado = "";
         resultado = new StringBuilder(cadena).reverse().toString();
         return cadena.equals(resultado);
         }
3. 2. A partir de su plan de pruebas, diseñe los casos de pruebas unitarias a implementar (aún no codifique nada!!!), considere al menos 5.
      1. String vacio, ""; Deberia retornar true.
      2. String palindromico pero con mayusculas no simetricas, "Ho-oh"; Deberia retornar true.
      3. String de un solo caracter; Deberia retornar true.
      4. String con espacios entre medio que serian palindromos sin aquellos espacios, "anita lava la tina"; Deberia retornar true.
      5. String con simbolos diacriticos que serian palindromos sin los diacriticos, "aérea"; Deberia retornar true.
      6. String que no es palindromo, "Ardilla"; Deberia retornar false.
      7. String que es parrafo, 
      "'Amor azul' Ramera, de todo te di. Mariposa colosal, sí, yo de todo te di.
      Poda la rosa, Venus. El átomo como tal es un evasor alado.
      Pide, todo te doy: isla, sol, ocaso, pirámide. Todo te daré: mar, luz, aroma."; Deberia retornar true.
3. 3. Estando seguros que sus casos de pruebas unitarias son amplios y relevantes, ahora impleméntelos en Java usando JUnit.
3. 4. ¿Qué resultados arrojan sus Test con estas entradas: “aca”, “acas”, “h”?
      1. aca: true
      2. acas: false
      3. h: true
4. 1. Considere los siguientes casos de prueba, no codifique NADA, discuta en su grupo.
      1. Input: 200; Output: Exception.
      2. Input: ""; Output: true.
      3. Input: "aaabccbaaa"; Output: true.
      4. Input: "ahabccbaaa"; Output: false.
      5. Input: "La tele letal"; Output: false.
4. 2. De las pruebas analizadas, concluya y construya una versión mejorada de su método. Construya además nuevas pruebas unitarias considerando los casos anteriores y verifique sus resultados teóricos con los empíricos.
      1. ¿Qué consideraciones tomaron en cuenta? 
        Nuestro plan de pruebas y puntuacion, incluyendo caracteres new line "\n".
      2. ¿Qué mejoró en su método?
        Ahora recibe parrafos completos con puntacion, diacriticas, espacios y mayusculas no simetricas. Y retorna lo esperado.
      3. ¿Qué rol jugaron las pruebas en mejorar su código?
        Permitian ver donde el codigo no trabajaba de la forma esperada sin llenar Main().