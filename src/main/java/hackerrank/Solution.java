package hackerrank;

import java.util.Scanner;
import java.util.regex.*;
public class Solution {

      public static void main(String[] args){
         //creo variable para pedir entradas al usuario
         Scanner in = new Scanner(System.in);
         //variable donde guardo la cantidad de entradas
         int testCases = Integer.parseInt(in.nextLine());
         //bucle mientras sea mayor que 0 y tenga otra linea para validar
         while( testCases>0 && in.hasNextLine() ){
            //guardo strings a evaluar si son validos
            String pattern = in.nextLine();
            //try/catch para capturar errores
            try{
               //variable tipo Pattern, para valirdar si es un regex valido
               Pattern patron = Pattern.compile(pattern);
               System.out.println("Valid");
            }catch ( Exception e){
               System.out.println("Invalid");
            }
         }
         in.close();
      }
}
