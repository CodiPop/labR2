/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_carlosleones_johanmendez_santiagoguerrero;

import java.util.ArrayList;

import static lab02_carlosleones_johanmendez_santiagoguerrero.Graph.matrizPeso;

/**
 *
 * @author johan
 */
public class Warshall {

    double Peso[][];
    Neuron Matriz[][];
    Neuron[] Neuronas;

    public Warshall(double[][] Peso, ArrayList<Neuron> v) {
        this.Peso = Peso;
        Matriz = new Neuron[Peso.length][Peso.length];
        Neuronas = new Neuron[v.size()];
        int cont = 0;
        for (Neuron neuron : v) {

            Neuronas[cont] = neuron;
            cont++;
        }
        ReiniciarMatriz();
        RehacerPeso(0);
        matrizPeso = this.Peso;
    }

    private void ReiniciarMatriz() {
        for (int i = 0; i < Peso.length; i++) {
            for (int j = 0; j < Peso.length; j++) {
                Matriz[j][i] = Neuronas[i];
            }
        }

    }
    
    public void rehacerPeso(int ubicacion) {
        for (int i = 0; i < Peso.length; i++) {
            for (int j = 0; j < Peso.length; j++) {

                if (Peso[i][ubicacion] + Peso[ubicacion][j] <= Peso[i][j]) {
                    Peso[i][j] = Peso[i][ubicacion] + Peso[ubicacion][j];
                    Matriz[i][j] = Neuronas[ubicacion];
                }

            }
        }
        if (ubicacion < Peso.length-1) {
            RehacerPeso(ubicacion+1);

        }
    }

    private void RehacerPeso(int ubicacion) {
        for (int i = 0; i < Peso.length; i++) {
            for (int j = 0; j < Peso.length; j++) {

                if (Peso[i][ubicacion] + Peso[ubicacion][j] < Peso[i][j]) {
                    Peso[i][j] = Peso[i][ubicacion] + Peso[ubicacion][j];
                    Matriz[i][j] = Neuronas[ubicacion];
                }

            }
        }
        if (ubicacion < Peso.length-1) {
            RehacerPeso(ubicacion+1);

        }

    }

    Neuron[] Recorrido(Neuron n[], Neuron Inicio, Neuron Final, Neuron FinalOriginal, int tamaño) {
        Neuron f[] = new Neuron[tamaño];
        if (n != null) {
            for (int i = 0; i < n.length; i++) {
                f[i] = n[i];
            }
        } else {
            f[0] = Final;
        }

        if (Matriz[Inicio.id][Final.id] != Final) {
            if (n != null) {
                return Recorrido(f, Inicio, Matriz[Inicio.id][Final.id], FinalOriginal, tamaño++);
            } else {
            }

        } else {
            //Para voltear el vector
            Neuron Fin[] = new Neuron[f.length + 1];
            int cont = 0;
            for (int i = f.length; i > 0; i--) {
                if (i == f.length) {
                    Fin[cont] = Inicio;
                } else {
                    Fin[cont] = f[i];
                }
                cont++;

            }
            Fin[cont] = FinalOriginal;

            return Fin;

        }
        return null;

    }

    public double[][] getPeso() {
        return Peso;
    }

    public Neuron[][] getMatriz() {
        return Matriz;
    }

}
