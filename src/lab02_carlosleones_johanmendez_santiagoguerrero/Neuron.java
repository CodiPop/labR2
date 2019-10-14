/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_carlosleones_johanmendez_santiagoguerrero;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Neuron {
    int id; //atributo que corresponde a la identificación única de una neurona
    
    //atributos que designan la posición donde empieza el área de la neurona
    int x;
    int y;
    
    ArrayList<Neuron> neuronas; //todas las neuronas a las que esta neurona tiene conexión 

    public Neuron(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.neuronas = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ArrayList<Neuron> getNeuronas() {
        return neuronas;
    }
    
    
    
}
