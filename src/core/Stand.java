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
public class Stand {
    private int id;
    private float precio;
    private ArrayList<Editorial> Editorial;

    public Stand(int id, float precio, ArrayList<Editorial> Editorial) {
        this.id = id;
        this.precio = precio;
        this.Editorial = new ArrayList<>();
    }

    
    
}
