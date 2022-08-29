/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra2.proyect_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Proyect_1 {
    
    public static void main(String[] args) {
        
        List<ClsVendedores> misEmp = new ArrayList();
         
        Random dato = new Random();
        int c = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0;
        int c9 = 0, c10 = 0, c11 = 0, c12 = 0, c13 = 0, c14 = 0, c15 = 0, c16 = 0, c17 = 0;
        int c18 = 0, c19 = 0, c20 = 0, c21 = 0, c22 = 0, c23 = 0;
        
        for(int i =0; i<1; i++){
            c=dato.nextInt(600); c1=dato.nextInt(600); c2=dato.nextInt(600);
            c3=dato.nextInt(600); c4=dato.nextInt(600); c5=dato.nextInt(600);
            c6=dato.nextInt(600); c7=dato.nextInt(600); c8=dato.nextInt(600);
            c9=dato.nextInt(600); c10=dato.nextInt(600); c11=dato.nextInt(600);
            c12=dato.nextInt(600); c13=dato.nextInt(600); c14=dato.nextInt(600);
            c15=dato.nextInt(600); c16=dato.nextInt(600); c17=dato.nextInt(600);
            c18=dato.nextInt(600); c19=dato.nextInt(600); c20=dato.nextInt(600);
            c21=dato.nextInt(600); c22=dato.nextInt(600); c23=dato.nextInt(600);     
        }
        
        ClsVendedores ven = new ClsVendedores("1-Leonel");
        ven.setEnero(c); ven.setFebrero(c1); ven.setMarzo(c2);
        misEmp.add(ven);
            
        ven=new ClsVendedores("2-Luis");
        ven.setEnero(c3); ven.setFebrero(c4); ven.setMarzo(c5);
        misEmp.add(ven);
 
        ven = new ClsVendedores("3-Donald");
        ven.setEnero(c6); ven.setFebrero(c7); ven.setMarzo(c8);
        misEmp.add(ven);
        
        ven = new ClsVendedores("4-Josue");
        ven.setEnero(c9); ven.setFebrero(c10); ven.setMarzo(c11);
        misEmp.add(ven);
        
        ven = new ClsVendedores("5-Jesus");
        ven.setEnero(c12); ven.setFebrero(c13); ven.setMarzo(c14);
        misEmp.add(ven);
        
        ven = new ClsVendedores("6-Victor");
        ven.setEnero(c15); ven.setFebrero(c16); ven.setMarzo(c17);
        misEmp.add(ven);
        
        ven = new ClsVendedores("7-Samuel");
        ven.setEnero(c18); ven.setFebrero(c19); ven.setMarzo(c20);
        misEmp.add(ven);
        
        ven = new ClsVendedores("8-paco");
        ven.setEnero(c21); ven.setFebrero(c22); ven.setMarzo(c23);
        misEmp.add(ven);
 
        ven = new ClsVendedores("nuevo");
         
        double sumaEnero = 0;  
        double sumaFebrero = 0;
        double sumaMarzo = 0;   
        double SumasMesesTotal = 0;
               
        misEmp.forEach((ob) -> System.out.println(ob.getNombre()));      
        
        for (ClsVendedores v : misEmp){
            sumaEnero += v.getEnero();
            sumaFebrero += v.getFebrero();
            sumaMarzo += v.getMarzo();
            
            SumasMesesTotal= sumaEnero+sumaFebrero+sumaMarzo;
        }

        System.out.println("\nLa suma de enero es="+sumaEnero);
        System.out.println("La suma de febrero es="+sumaFebrero);
        System.out.println("La suma de marzo es="+sumaMarzo);
        
        System.out.println("\n\tNombre\t\t  Enero\t\t  Febrero\t  Marzo");
        System.out.println("\t1-Leonel\t  "+c+"\t\t  "+c1+"\t\t  "+c2);
        System.out.println("\t2-Luis\t\t  "+c3+"\t\t  "+c4+"\t\t  "+c5);
        System.out.println("\t3-Donald\t  "+c6+"\t\t  "+c7+"\t\t  "+c8);
        System.out.println("\t4-Josue\t\t  "+c9+"\t\t  "+c10+"\t\t  "+c11);
        System.out.println("\t5-Jesus\t\t  "+c12+"\t\t  "+c13+"\t\t  "+c14);
        System.out.println("\t6-Victor\t  "+c15+"\t\t  "+c16+"\t\t  "+c17);
        System.out.println("\t7-Samuel\t  "+c18+"\t\t  "+c19+"\t\t  "+c20);
        System.out.println("\t8-paco\t\t  "+c21+"\t\t  "+c22+"\t\t  "+c23);
        System.out.println("\tTotal Mes\t  "+sumaEnero+"\t  "+sumaFebrero+"\t  "+sumaMarzo);
        System.out.println("\nVentas totales por todos los meses = "+SumasMesesTotal);
    }   
}
