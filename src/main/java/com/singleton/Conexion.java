package com.singleton;

public class Conexion {
   private static Conexion instancia = null;

   public static Conexion getInstance(){
      if(instancia == null){
         instancia = new Conexion();
      }
      return instancia;
   }

   private Conexion(){

   }
}
