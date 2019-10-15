/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_carlosleones_johanmendez_santiagoguerrero;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class Graph {

    /**
     * @param args the command line arguments
     */
    
    //neuronas y las relaciones entre estas que permiten controlar el programa
    static ArrayList<Neuron> neurons;
    static ArrayList<Synapse> relations;
    static double [] [] matrizPeso;

    public Graph() {
        Graph.neurons = new ArrayList<>();
        Graph.relations = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.createBrain();
    }
    
    private void createBrain() {
        //crear una ventana de brain
        Brain brain = new Brain();
        brain.setLocationRelativeTo(null);
        brain.setSize(1045, 660);
        brain.setResizable(false);
        brain.setVisible(true);
        JOptionPane.showMessageDialog(brain, "Bienvenido a NEUROGRAPH");
    }
    
}
