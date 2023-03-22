package tema5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

   public static void main(String[] args) {

      List<Persona> lista = new ArrayList<>();
      lista.add(new Persona(3,"Maria",26));
      lista.add(new Persona(2,"kain",13));
      lista.add(new Persona(1,"Ares",10));
//      Collections.sort(lista);
//      Collections.reverse(lista);
//      Collections.sort(lista, new NombreComparator());
//      Collections.sort(lista, new Comparator<Persona>() {
//         @Override
//         public int compare(Persona per1, Persona per2) {
//            int rpta = 0;
//            if ( per1.getEdad() > per2.getEdad()){
//               rpta = 1;
//            }else if (per1.getEdad() < per2.getEdad()){
//               rpta = -1;
//            }else{
//               rpta = 0;
//            }
//            return rpta;
//         }
//      });
      Collections.sort(lista);

      for (Persona p : lista){
         System.out.println(p.getEdad() + "-" + p.getNombre());
      }
   }
}
