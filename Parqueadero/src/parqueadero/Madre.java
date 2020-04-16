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
  public void imprimir (int placa){
      for(int i=0;i<8;i++){
          if(motoss.get(i).numplaca==placa){
      System.out.println("Numero de placa: "+motoss.get(i).numplaca+"   Hora de entrada: "+motoss.get(i).horaEntrada+"    Identificacion del usuario: "+motoss.get(i).idUsuario+"   Nombre del usuario: "+motoss.get(i).nomUsuario);
      }
  }  
  }
  public Integer tamaño (){
      int tamaño=0;
      tamaño = motoss.size();
      return tamaño;
  }
  public void eliminar(int placa){
      for(int i=0;i<8;i++){
          if(motoss.get(i).numplaca==placa){
      motoss.remove(i);
      }
  }  
  }
 
  
   public static ArrayList <Madre> carross = new ArrayList <Madre> ();
  public ArrayList<Madre> llena(int a, String b, int c, int d){
      Madre carrosss = new Madre();
      carrosss.numplaca=a;
      carrosss.nomUsuario=b;
      carrosss.idUsuario=c;
      carrosss.horaEntrada=d;
      carross.add(carrosss);
      return carross;
     
    }
  
  public void impri (int placa){
      for(int i=0;i<8;i++){
          if(carross.get(i).numplaca==placa){
      System.out.println("Numero de placa: "+carross.get(i).numplaca+"   Hora de entrada: "+carross.get(i).horaEntrada+"    Identificacion del usuario: "+carross.get(i).idUsuario+"   Nombre del usuario: "+carross.get(i).nomUsuario);
        }
    }
     
  }
  public Integer tama (){
      int tama=0;
      tama = carross.size();
      return tama;
  }
  public void elimi(int placa){
      for(int i=0;i<8;i++){
          if(carross.get(i).numplaca==placa){
      carross.remove(i);
      }
  }  
  }
}
