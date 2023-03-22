package tema5;

import java.util.Comparator;
import java.util.Objects;

public class Persona  implements Comparable<Persona> {
   private int id;
   private String nombre;
   private int edad;

   public Persona(int id, String nombre, int edad){
      this.id = id;
      this.nombre = nombre;
      this.edad = edad;
   }
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getNombre() {
      return nombre;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public int getEdad() {
      return edad;
   }
   public void setEdad(int edad) {
      this.edad = edad;
   }

   @Override
   public int compareTo(Persona per) {
//      return this.edad - per.getEdad();
//      return per.getEdad() - this.edad;
      return this.nombre.compareTo(per.getNombre());
      }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Persona persona = (Persona) o;
      return Objects.equals(nombre, persona.nombre);
   }

   @Override
   public int hashCode() {
      return Objects.hash(nombre);
   }
}
