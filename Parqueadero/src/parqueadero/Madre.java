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
    int numMarco;
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
  public static ArrayList <Madre> bici = new ArrayList <Madre> ();
  public ArrayList<Madre> llenar(int a, String b, int c, int d){
      
      Madre bicis = new Madre();
      bicis.numMarco=a;
      bicis.nomUsuario=b;
      bicis.idUsuario=c;
      bicis.horaEntrada=d;
      bici.add(bicis);
      return bici;
     
    }
  public void imp (int marco){
      for(int i=0;i<8;i++){
          if(bici.get(i).numMarco==marco){
      System.out.println("Numero de marco: "+bici.get(i).numplaca+"   Hora de entrada: "+bici.get(i).horaEntrada+"    Identificacion del usuario: " + bici.get(i).idUsuario+"   Nombre del usuario: "+bici.get(i).nomUsuario);
        }
    }
     
  }
  public Integer taño (){
      int t=0;
      t = bici.size();
      return t;
  }
  public void eli(int marco){
      for(int i=0;i<8;i++){
          if(bici.get(i).numMarco==marco){
      bici.remove(i);
      }
  }  
  }
  public void recolectarPrecio (double pr){
      double preciooo;
      preciooo = pr;
  }

    void llenado(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. hice lo de arriba
    }

    void llenado(int parseInt, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
