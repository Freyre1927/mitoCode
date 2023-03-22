package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaApp {

   public  void  ordenar(){
      List<String> lista = new ArrayList<>();
      lista.add("Kain");
      lista.add("Nano");
      lista.add("Ares");

//      Collections.sort(lista, new Comparator<String>() {
//         @Override
//         public int compare(String o1, String o2) {
//            return o1.compareTo(o2);
//         }
//      });
      Collections.sort(lista,(String p1, String p2) -> p1.compareTo(p2)) ;

      for(String elemento : lista){
         System.out.println(elemento);
      }
   }

   public static void main(String[] args) {
      LambdaApp app = new LambdaApp();
      app.ordenar();
   }
}
