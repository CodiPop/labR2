/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_carlosleones_johanmendez_santiagoguerrero;

/**
 *
 * @author Lenovo
 */

//clase que representa la conexión neuronal unidireccional: arista que une dos vertices

public class Synapse {
    //par de neuronas conectadas por esta sinapsis
    Neuron neuronaInicial;
    Neuron neuronaFinal;
    
    //par de coordenadas donde empieza el área de colisión
    double x;
    double y;
    
    double distanceUser;
    
    //la distancia desde las coordenadas (x,y) hasta el final de la sinapsis
    double distanceX;
    double distanceY;
    
    //la pendiente de la recta
    double pendiente;
    
    //orientacion de la recta
    int orientacion;
    
    public Synapse (Neuron neuronaInicial, Neuron neuronaFinal, double x, double y, double distanceX, double distanceY,  double distanceUser) {
        this.neuronaInicial = neuronaInicial;
        this.neuronaFinal = neuronaFinal;
        this.x = x;
        this.y = y;
        this.distanceX = distanceX;
        this.distanceY = distanceY;
        this.distanceUser = distanceUser;
    }

    public Synapse(Neuron neuronaInicial, Neuron neuronaFinal, double x, double y, double distanceX, double distanceY) {
        this.neuronaInicial = neuronaInicial;
        this.neuronaFinal = neuronaFinal;
        this.x = x;
        this.y = y;
        this.distanceX = distanceX;
        this.distanceY = distanceY;
        double ys = y - distanceY;
        double xs = distanceX - x;
        this.pendiente = ys / xs;
        if (this.pendiente > 0) {
            orientacion = 1;
        } else {
            if (this.pendiente < 0) {
                orientacion = 2;
            }
        }
    }

    public Neuron getNeuronaInicial() {
        return neuronaInicial;
    }

    public Neuron getNeuronaFinal() {
        return neuronaFinal;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistanceX() {
        return distanceX;
    }

    public double getDistanceY() {
        return distanceY;
    }

    public double getPendiente() {
        return pendiente;
    }

    public int getOrientacion() {
        return orientacion;
    }
    
    
}
