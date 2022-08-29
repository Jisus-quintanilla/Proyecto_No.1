/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra2.proyect_1;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ClsVendedores {
   
    private String nombre;
    private double enero;
    private double febrero;
    private double marzo;
    
    
    public ClsVendedores(String nombre){
        this.nombre = nombre;
    }
    
    
    
    public void llenaInformacion(){
        Scanner t= new Scanner(System.in);
        System.out.println("Ingrese nombre");
        setNombre(t.nextLine());
        System.out.println("Ingrese Enero");
        setEnero((double) Double.valueOf(t.nextLine()));
        System.out.println("Febrero");
        setFebrero(t.nextDouble());
        System.out.println("Marzo");
        setMarzo(t.nextDouble());
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
       
        if (nombre.equals("LUCAS")){
            
        } else {
            this.nombre = nombre;    
        }
        
        
    }

    public double getEnero() {
        return enero;
    }

    public void setEnero(double enero) {
        this.enero = enero;
    }

    public double getFebrero() {
        return febrero;
    }

    public void setFebrero(double febrero) {
        this.febrero = febrero;
    }

    public double getMarzo() {
        return marzo;
    }

    public void setMarzo(double marzo) {
        this.marzo = marzo;
    }
   
}
    

