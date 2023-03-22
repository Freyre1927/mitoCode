package com.singleton;

import java.util.ArrayList;
import java.util.List;

public class PaisDaoImpl /**implement Pais*/{

   public static PaisDaoImpl instancia = null;
   private List paises = null;
   private PaisDaoImpl(){

   }
   public static PaisDaoImpl getInstance(){
      if(instancia == null){
         instancia = new PaisDaoImpl();
      }
       return instancia;
   }

   public List getPaises(){
      if (paises == null) {
         paises = new ArrayList();

         Pais p1 = new Pais("Colombia");
         Pais p2 = new Pais("Holanda");
         Pais p3 = new Pais("Canada");

         paises.add(p1);
         paises.add(p2);
         paises.add(p3);
      }
      return paises;
   }
}
