package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrama {
//sin usar la clase Arrays, con esta clase puedo usar array de de chars y ordenarlos para co
   static boolean isAnagram(String a, String b) {
      // Complete the function
      String string1 = a.toLowerCase();
      String string2  = b.toLowerCase();
      //test para metodo
      int[] contador = new int[26];

      for(int i = 0; i < string1.length();i++){
         System.out.print(Arrays.toString(contador));
         contador[string1.charAt(i) - 'a']++;
      }
      for(int i = 0; i < string2.length(); i++){
         System.out.print(Arrays.toString(contador));
         contador[string2.charAt(i) - 'a']--;
      }
      for(int i = 0; i < 26; i++){
         System.out.println(Arrays.toString(contador));
         if(contador[i] != 0){
            return false;
         }
      }
      return true;
   }

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String a = scan.next();
      String b = scan.next();
      scan.close();
      boolean ret = isAnagram(a, b);
      System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
   }
}