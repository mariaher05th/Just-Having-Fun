/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author maryj
 */
public class Editorial {
    private String nit;
    private String nombre;
    private String direccion;
    private Gerente Gerente;
    private ArrayList<Libro> Libro;
    private ArrayList<Stand> Stand;

    public Editorial(String nit, String nombre, String direccion, ArrayList<Libro> Libro, ArrayList<Stand> Stand) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.Libro = new ArrayList<>();
        this.Stand = new ArrayList<>();
        this.Gerente = null;
    }

    public String getNit() {
        return nit;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Gerente getGerente() {
        return Gerente;
    }

    public ArrayList<Libro> getLibro() {
        return Libro;
    }

    public ArrayList<Stand> getStand() {
        return Stand;
    }

    
    
    
}
