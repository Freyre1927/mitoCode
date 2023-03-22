package tema5;

import java.util.Comparator;

//public class NombreComparator implements Comparator {
public class NombreComparator implements Comparator<Persona> {
//   @Override
//   public int compare(Object o1, Object o2) {
//      Persona per1 = (Persona) o1;
//      Persona per2 = (Persona) o2;
//
//      return per1.getNombre().compareTo(per2.getNombre());
//      }

   @Override
   public int compare(Persona per1, Persona per2){
      return per1.getNombre().compareTo(per2.getNombre());
   }
}
