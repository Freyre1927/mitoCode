package com.genericos;

public class Clase<T> {

   private T objeto;

   public Clase (T obejto){
      this.objeto = obejto;
   }

   public void mostrarTipo(){
      System.out.println("Tipo: " + objeto.getClass().getName());
   }
}
