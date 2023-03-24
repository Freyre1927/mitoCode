package hackerrank;

import java.io.*;
import java.util.*;

public class RegularExpresion {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String s = scan.nextLine().trim();
      scan.close();
      //guardo las subcadenas que me pasa el metodo split en un array
      String[] tokens = s.split("[ !,?._'@]+");
      //inicializo variable contadora
      int j = 0;
      //validación para detectar un parametro vacio e imprimir el 0
      if ( s.isEmpty()){
         j = 0;
         System.out.println(j);
         return;
      }
      //guardo longitud del array
      j = tokens.length;
      System.out.println(j);
//      for(String t : tokens){
//         j++;
//      }
//      recorro el array
//      for (int i = 0; i < j; i++){
//         System.out.println(tokens[i]);
//      }
      //recorro el array
      for(String h : tokens){
         System.out.println(h);
      }
   }
}