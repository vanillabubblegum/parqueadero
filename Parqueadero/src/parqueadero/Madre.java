/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parqueadero;

import java.awt.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nicole
 */
public class Madre {
    int numplaca;
    String nomUsuario;
    int idUsuario;
    int horaEntrada;
  
 
   public static ArrayList <Madre> motoss = new ArrayList <Madre> ();
  public ArrayList<Madre> llenado(int a, String b, int c, int d){
      Madre Motosss = new Madre();
      Motosss.numplaca=a;
      Motosss.nomUsuario=b;
      Motosss.idUsuario=c;
      Motosss.horaEntrada=d;
      motoss.add(Motosss);
      return motoss;
     
    }
  public void imprimir (){
      System.out.println(motoss.get(0).numplaca);
  }
  public Integer tamaño (){
      int tamaño=0;
      tamaño = motoss.size();
      return tamaño;
  }
    
}
