package com.singleton;

public class App {

   public static void main(String[] args) {

      PaisDaoImpl dao = PaisDaoImpl.getInstance();

      for (Object obj : dao.getPaises()) {
         System.out.println(((Pais)obj).getNombre());
      }

      for (Object obj : dao.getPaises()){
         System.out.println( ((Pais)obj).getNombre());
      }

      PaisDaoImpl dao1 = PaisDaoImpl.getInstance();
      for (Object obj : dao1.getPaises()){
         System.out.println(((Pais)obj).getNombre());
      }
   }

}
