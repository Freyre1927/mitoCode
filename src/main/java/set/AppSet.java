package set;

import tema5.Persona;

import java.util.HashSet;
import java.util.Set;

public class AppSet {

//   public static void main(String[] args) {
//      Set<String> lista = new HashSet<>();
//      lista.add("Ares");
//      lista.add("kain");
//      lista.add("Maria");
//      lista.add("Ares");
//      for (String elemento : lista) {
//         System.out.println(elemento);
//      }
//   }

   public static void main(String[] args) {
      Set<Persona> lista = new HashSet<>();
      lista.add(new Persona(1,"Ares",10));
      lista.add(new Persona(1,"kain",10));
      lista.add(new Persona(1,"Ares",10));
      lista.add(new Persona(1,"Maria",10));
      lista.add(new Persona(1,"Ares",10));

      for (Persona per : lista){
         System.out.println(per.getEdad() + " " +  per.getNombre());
      }
   }
}
