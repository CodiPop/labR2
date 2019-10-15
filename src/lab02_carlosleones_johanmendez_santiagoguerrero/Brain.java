/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02_carlosleones_johanmendez_santiagoguerrero;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;
import static lab02_carlosleones_johanmendez_santiagoguerrero.Graph.matrizPeso;
import static lab02_carlosleones_johanmendez_santiagoguerrero.Graph.neurons;
import static lab02_carlosleones_johanmendez_santiagoguerrero.Graph.relations;

/**
 *
 * @author Lenovo
 */
public class Brain extends javax.swing.JFrame {

    /**
     * Creates new form Brain
     */
    
    Graphics g;
    
    int option;
    
    Neuron [] neuronaRecorrido;
    
    Warshall warshall;
            
    int cont2;
    
    int automatizar;
    
    int cont;
    
    int contadorNeuronas;
    
    Neuron neuronaAnterior;
    Neuron N[][];
    
    public Brain() {
        initComponents();
        this.g = panel.getGraphics();
        this.option = 0;
        this.cont = 0;
        this.cont2 = 0;
        this.automatizar = 0;
        this.contadorNeuronas = 0;
        this.neuronaAnterior = null;
    }
    
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        super.paint(g);
        for (Neuron neuron : neurons) {
            g.fillOval(neuron.getX(), neuron.getY(), 32, 32);
        }
        g.setColor(Color.red);
        for (Synapse relation : relations) {
            g.drawLine((int)relation.getX()+16, (int)relation.getY()+16, (int)relation.getDistanceX()+16, (int)relation.getDistanceY()+16);
        }
        g.setColor(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        add = new javax.swing.JButton();
        connect = new javax.swing.JButton();
        panel = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        caminocorto = new javax.swing.JButton();
        interfaz = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        auto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add.setText("AÑADIR");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        connect.setText("CONECTAR");
        connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectActionPerformed(evt);
            }
        });

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/person-brain-final-image.jpg"))); // NOI18N
        panel.setViewportView(jLabel1);

        caminocorto.setText("CAMINO MÁS CORTO");
        caminocorto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caminocortoActionPerformed(evt);
            }
        });

        interfaz.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        auto.setText("AUTO");
        auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoActionPerformed(evt);
            }
        });

        jButton1.setText("¿Neurona?");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("¿Sinapsis?");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(auto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(interfaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(caminocorto)
                        .addGap(18, 18, 18)
                        .addComponent(connect)
                        .addGap(18, 18, 18)
                        .addComponent(add))
                    .addComponent(jButton2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(add)
                                .addComponent(connect)
                                .addComponent(caminocorto)
                                .addComponent(eliminar))
                            .addComponent(interfaz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(auto)
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseClicked
        int match = 0;
        int x = evt.getX();
        int y = evt.getY();
        if (option != 0) {
            if (option == 1) {
                if (neurons.isEmpty()){
                    this.g.setColor(Color.white);
                    this.g.fillOval(x-16, y-16, 32, 32);
                    neurons.add(new Neuron(this.contadorNeuronas, x-16, y-16));
                    contadorNeuronas++;
                } else {
                    for (Neuron neuron : neurons) {
                        if (((neuron.getX() != x) || (neuron.getY() != y))) {
                            if (!(x >= neuron.getX() && x <= neuron.getX()+32 && y == neuron.getY())) {
                                if (!(y >= neuron.getY() && y <= neuron.getY()+32 && x == neuron.getX())) {
                                    if (!(y >= neuron.getY() && y <= neuron.getY()+32 && x == neuron.getX()+32)) {
                                        if (!(x >= neuron.getX() && x <= neuron.getX()+32 && y == neuron.getY()+32)) {
                                            if (!(x >= neuron.getX() && x <= neuron.getX()+32 && y >= neuron.getY() && y <= neuron.getY()+32)) {
                                                if (!(x >= neuron.getX() && x <= neuron.getX()+32 && (y+32) == neuron.getY())) {
                                                    if (!(y >= neuron.getY() && y <= neuron.getY()+32 && (x+32) == neuron.getX())) {
                                                        if (!(x <= neuron.getX() && y >= neuron.getY() && y <= neuron.getY()+32 && (x+32) >= neuron.getX()  && (x+32) <= neuron.getX()+32)) {
                                                            if (!(y <= neuron.getY() && x >= neuron.getX() && x <= neuron.getX()+32 && (y+32) >= neuron.getY() && (y+32) <= neuron.getY()+32)) {
                                                                if ((x <= neuron.getX() && y <= neuron.getY() && ((x+32) >= neuron.getX() && (x+32) <= neuron.getX()+32) && ((y+32) >= neuron.getY() && (y+32) <= neuron.getY()+32))) {
                                                                    match = 1;
                                                                    interfaz.setText("Dos neuronas colisionan su área desde la superior de la diagonal de una de estas");
                                                                    break;
                                                                }                  
                                                            } else {
                                                                match  = 1;
                                                                interfaz.setText("Dos neuronas intentan colisionar su área desde arriba");
                                                                break;
                                                            }
                                                        } else {
                                                            match = 1;
                                                            interfaz.setText("Dos neuronas intentan colisionar su área desde la izquierda");
                                                            break;
                                                        }
                                                    } else {
                                                        match = 1;
                                                        interfaz.setText("Dos neuronas intentan colisionar su borde derecho e izquierdo");
                                                        break;
                                                    }
                                                } else {
                                                    match = 1;
                                                    interfaz.setText("Dos neuronas intentan colisionar su borde inferior y superior");
                                                    break;
                                                }
                                            } else {
                                                match = 1;
                                                interfaz.setText("Dos neuronas intentan colisionar dentro del radio de una de éstas");
                                                break;
                                            }
                                        } else {
                                            match = 1;
                                            interfaz.setText("Dos neuronas intentan colisionar en el borde inferior");
                                            break;
                                        }
                                    } else {
                                        match = 1;
                                        interfaz.setText("Dos neuronas intentan colisionar en el borde derecho");
                                        break;
                                    }
                                } else {
                                    match = 1;
                                    interfaz.setText("Dos neuronas intentan colisionar en el borde izquierdo");
                                    break;
                                }
                            } else {
                                match = 1;
                                interfaz.setText("Dos neuronas intentan colisionar en el borde superior");
                                break;
                            }
                        } else {
                            match = 1;
                            interfaz.setText("Dos neuronas intentan colisionar en la misma coordenada de inicio");
                            break;
                        }
                    }
                    if (match == 0) {
                        this.g.setColor(Color.white);
                        this.g.fillOval(x, y, 32, 32);
                        neurons.add(new Neuron(this.contadorNeuronas, x, y));
                        contadorNeuronas++;
                    }
                }
            } else {
                if (option == 2) {
                    if (cont == 0) {
                        for (Neuron neuron : neurons) {
                            if (x >= neuron.getX() && x <= neuron.getX()+32 && y >= neuron.getY() && y <= neuron.getY()+32) {
                                cont = 1;
                                neuronaAnterior = neuron;
                                this.g.setColor(Color.red);
                                this.g.fillOval(neuron.getX(), neuron.getY(), 32, 32);
                                this.g.setColor(Color.white);
                            }
                        }
                        if (cont == 0) {
                            interfaz.setText("Por favor selecciona una neurona a conectar");
                        }
                    } else {
                        if (cont == 1) {
                            Neuron neuronaSiguiente = null;
                            for (Neuron neuron : neurons) {
                                if (neuron != neuronaAnterior) {
                                    if (!(x >= neuronaAnterior.getX() && x <= neuronaAnterior.getX()+32 && y >= neuronaAnterior.getY() && y <= neuronaAnterior.getY()+32)) {
                                        if (x >= neuron.getX() && x <= neuron.getX()+32 && y >= neuron.getY() && y <= neuron.getY()+32) {
                                            neuronaSiguiente = neuron;
                                            cont = 0;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (cont == 0) {
                                int f = 0;
                                
                                this.g.setColor(Color.red);
                                this.g.drawLine(neuronaAnterior.getX()+16, neuronaAnterior.getY()+16, neuronaSiguiente.getX()+16, neuronaSiguiente.getY()+16);
                                if (automatizar == 1) {
                                    relations.add(new Synapse(neuronaAnterior, neuronaSiguiente, neuronaAnterior.getX(), neuronaAnterior.getY(), neuronaSiguiente.getX(), neuronaSiguiente.getY()));
                                } else {
                                    if (automatizar == 0) {
                                        try {
                                            f = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Distancia entre los dos vértices seleccionados?"));
                                        } catch (Exception e) {

                                        }
                                        relations.add(new Synapse(neuronaAnterior, neuronaSiguiente, neuronaAnterior.getX(), neuronaAnterior.getY(), neuronaSiguiente.getX(), neuronaSiguiente.getY(), f));
                                    }
                                }
                                neuronaAnterior.neuronas.add(neuronaSiguiente);          
                                this.g.setColor(Color.white);
                                this.g.fillOval(neuronaAnterior.getX(), neuronaAnterior.getY(), 32, 32);
                                neuronaAnterior = null;
                            } else {
                                interfaz.setText("No fue posible una conexión");
                                JOptionPane.showMessageDialog(null, "No fue posible una conexión");
                            }
                        }
                    }
                } else {
                    if (option == 3) {
                        paint(this.g);
                        if (cont2 == 0) {
                            for (Neuron neuron : neurons) {
                                if (x >= neuron.getX() && x <= neuron.getX()+32 && y >= neuron.getY() && y <= neuron.getY()+32) {
                                    cont2 = 1;
                                    neuronaAnterior = neuron;
                                    this.g.setColor(Color.red);
                                    this.g.fillOval(neuron.getX(), neuron.getY(), 32, 32);
                                    this.g.setColor(Color.white);
                                }
                            }
                            if (cont2 == 0) {
                                interfaz.setText("Por favor selecciona una neurona a conectar");                                
                            }
                        } else {
                            if (cont2 == 1) {
                                Neuron neuronaSiguiente = null;
                                for (Neuron neuron : neurons) {
                                    if (neuron != neuronaAnterior) {
                                        if (!(x >= neuronaAnterior.getX() && x <= neuronaAnterior.getX()+32 && y >= neuronaAnterior.getY() && y <= neuronaAnterior.getY()+32)) {
                                            if (x >= neuron.getX() && x <= neuron.getX()+32 && y >= neuron.getY() && y <= neuron.getY()+32) {
                                                neuronaSiguiente = neuron;
                                                cont2 = 0;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (cont2 == 0) {      
                                    int i = neuronaAnterior.getId();
                                    int j = neuronaSiguiente.getId();
                                    int contador = 0;
                                    int [] recorrido = new int [warshall.getMatriz().length];
                                    Queue<Neuron> neuronas = new LinkedList<Neuron>();
                                    if (!neuronaAnterior.getNeuronas().isEmpty()){
                                        int coincidencia = 0;
                                        for (Synapse relation : relations) {
                                            if (relation.getNeuronaFinal().getId() == neuronaSiguiente.getId()){
                                                coincidencia = 1;
                                                break;
                                            }
                                        }
                                        if (esPosibleLlegar(neuronaAnterior, neuronaSiguiente, neuronas) == 1) {
                                            recorrido[contador] = neuronaAnterior.getId();
                                            this.g.setColor(Color.green);  
                                            contador++;   
                                            Neuron anterior = neuronaAnterior;
                                            for (int k = 0; k < warshall.getMatriz().length; k++) {
                                                for (int l = 0; l < warshall.getMatriz().length; l++) {
                                                    System.out.print(warshall.getMatriz()[k][l].getId());
                                                }
                                                System.out.print("\n");
                                            }
                                            while (warshall.getMatriz()[i][j].getId() != neuronaSiguiente.getId()) {    
                                                recorrido[contador] = warshall.getMatriz()[i][j].getId();
                                                this.g.drawLine(anterior.getX()+16, anterior.getY()+16, warshall.getMatriz()[i][j].getX()+16, warshall.getMatriz()[i][j].getY()+16);
                                                anterior = warshall.getMatriz()[i][j];
                                                i = warshall.getMatriz()[i][j].getId();
                                                contador++;
                                            }
                                            this.g.drawLine(anterior.getX()+16, anterior.getY()+16, neuronaSiguiente.getX()+16, neuronaSiguiente.getY()+16);
                                            recorrido[contador] = neuronaSiguiente.getId();
                                            String linea = new String();
                                            for (int k = 0; k <= contador; k++) {
                                                linea = linea + recorrido[k]+" ";
                                            }
                                            interfaz.setText("Recorrido de "+neuronaAnterior.getId()+" a "+neuronaSiguiente.getId()+" es: "+linea);
                                        } else {
                                            interfaz.setText("A esa neurona no se puede llegar de ninguna forma");
                                        }
                                    } else {
                                        interfaz.setText("Esa neurona no es un punto de partida al no conectar con otras");
                                    }                                    
                                    this.g.setColor(Color.white);
                                    this.g.fillOval(neuronaAnterior.getX(), neuronaAnterior.getY(), 32, 32);
                                    neuronaAnterior = null;                                    
                                } else {
                                    interfaz.setText("No fue posible una conexión para encontrar un camino");                                    
                                }
                            }
                        }
                    } else {
                        if (option == 4) {
                            int p = 0;
                            Neuron neuronaEliminar = null;
                            for (Neuron neuron : neurons) {
                                if (x >= neuron.getX() && x <= neuron.getX()+32 && y >= neuron.getY() && y <= neuron.getY()+32) {
                                    p = 1;
                                    neuronaEliminar = neuron;
                                    this.g.setColor(Color.red);
                                    this.g.fillOval(neuron.getX(), neuron.getY(), 32, 32);
                                    this.g.setColor(Color.white);
                                }
                            }
                            if (p == 0) {
                                interfaz.setText("Por favor selecciona una neurona para eliminar");
                            } else {
                                int sw = 0;
                                Synapse relationEliminar = null;
                                int l = relations.size();
                                for (int i = 0; i < l; i++) {
                                    for (Synapse relation : relations) {
                                        if (relation.getNeuronaFinal().getId() == neuronaEliminar.getId()){
                                            sw = 1;
                                            relationEliminar = relation;
                                        }
                                        if (relation.getNeuronaInicial().getId() == neuronaEliminar.getId()) {
                                            sw = 1;
                                            relationEliminar = relation;
                                        }                                    
                                    }
                                    if (sw == 1) {
                                        relations.remove(relationEliminar);
                                    }
                                }
                                for (Neuron neuron : neurons) {
                                    if (neuron.getId()>neuronaEliminar.getId()){
                                        neuron.id = neuron.getId()-1;
                                    }
                                }
                                contadorNeuronas--;
                                neurons.remove(neuronaEliminar);                               
                                paint(this.g);
                            }
                        }
                    }
                }
            }
        } else {
            interfaz.setText("Por favor seleccione una acción");
        }
    }//GEN-LAST:event_panelMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        option = 1;
    }//GEN-LAST:event_addActionPerformed

    private void connectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectActionPerformed
        option = 2;
    }//GEN-LAST:event_connectActionPerformed

    private void caminocortoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caminocortoActionPerformed
        connect.setVisible(false);
        eliminar.setVisible(false);
        add.setVisible(false);
        option = 3;
        matrizPeso = new double [neurons.size()][neurons.size()];
        for (int i = 0; i < neurons.size(); i++) {
            for (int j = 0; j < neurons.size(); j++) {
                if (i == j) {
                    matrizPeso [i] [j] = 0;
                } else {
                    matrizPeso[i] [j] = 99999;
                }
            }
        }
        for (Neuron neuron : neurons) {
            llenarPeso(neuron);
        }
        warshall = new Warshall(matrizPeso, neurons);
        for (int i = 0; i < neurons.size(); i++) {
            for (int j = 0; j < neurons.size(); j++) {
                System.out.print(matrizPeso[i][j]+" ");
            }
            System.out.print("\n");
        }
    }//GEN-LAST:event_caminocortoActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        option = 4;
    }//GEN-LAST:event_eliminarActionPerformed

    private void autoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoActionPerformed
        automatizar = 1;
        auto.setVisible(false);
    }//GEN-LAST:event_autoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Célula del sistema nervioso formada por un núcleo y una serie de prolongaciones, una de las cuales es más larga que las demás.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Una sinapsis es una estructura que permite que una neurona (o célula nerviosa) transmita una señal eléctrica o química a otra neurona o a la célula efectora objetivo.");
    }//GEN-LAST:event_jButton2ActionPerformed

    public int esPosibleLlegar(Neuron neuron, Neuron neuronaDestino, Queue<Neuron> neuronax) {
        for (Neuron neurona : neuron.getNeuronas()) {
            int x = 0;
            for (Neuron neuron1 : neuronax) {
                if (neurona == neuron1) {
                    x = 1;
                }
            }
            if (x != 1) {
                if (neurona.getId() == neuronaDestino.getId()) {
                    return 1;
                } else {
                    neuronax.add(neuron);
                    return esPosibleLlegar(neurona, neuronaDestino, neuronax);
                }
            }
            
        }
        return 0;
    }
    
    public void llenarPeso(Neuron neuron) {
        for (Neuron neuronx : neuron.getNeuronas()) {
            double distancia = 0;
            if (automatizar == 1) {
                double diferenciaX = (int) Math.pow((neuronx.getX() - neuron.getX()), 2);
                double diferenciaY = (int) Math.pow((neuronx.getY() - neuron.getY()), 2);
                distancia = (int) Math.pow((diferenciaX + diferenciaY), 0.5);
            } else {
                if (automatizar == 0) {
                    for (Synapse relation : relations) {
                        if (relation.getNeuronaInicial() == neuron && relation.getNeuronaFinal() == neuronx) {
                            distancia = relation.distanceUser;
                        }
                    }
                }
            }
            matrizPeso[neuron.getId()][neuronx.getId()] = (int) distancia;
        }
    }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Brain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Brain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Brain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Brain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Brain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton auto;
    private javax.swing.JButton caminocorto;
    private javax.swing.JButton connect;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel interfaz;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane panel;
    // End of variables declaration//GEN-END:variables
}
