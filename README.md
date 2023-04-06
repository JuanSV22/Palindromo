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
      1. d
      2. d
      3. e
      4. e
      5. r