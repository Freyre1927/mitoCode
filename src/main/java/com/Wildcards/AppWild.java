package com.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class AppWild {

//   public void listar(List<Alumno> lista) {
//      for (Alumno a : lista){
//         System.out.println(a.getNombre());
//      }
//   }
   //Recibe cualquier tipo que sea subclase de la clase que indicamos, (HERENCIA O INTERFAZ) -SUBCLASE
   public void listarUpperBounded(List<? extends Persona> lista){
      for (Persona per : lista){
            System.out.println(per.getNombre());
         }
      }
   //recibe cualquier tipo que sea una super clase de la clase que estamos indicando SUPERCLASE
   public void listarLowerBounded(List<? super Alumno> lista){
      for (Object al : lista){
            System.out.println(((Persona)al).getNombre());
         }
      }
   //no indicamos el tipo, esperamos de un tipo object en comun
   public void listarUnBounded(List<?> lista){
      for (Object obj : lista){
            System.out.println(((Alumno) obj).getNombre() );
         }
      }

   public static void main(String[] args) {
      AppWild aw = new AppWild();

      Alumno al1 = new Alumno("Ares");
      Alumno al2 = new Alumno("kain");
      Alumno al3 = new Alumno("ILY");

      List<Persona> lista = new ArrayList<>();
      lista.add(al1);
      lista.add(al2);
      lista.add(al3);

      aw.listarUpperBounded(lista);
      aw.listarLowerBounded(lista);
      aw.listarUnBounded(lista);
   }
}
