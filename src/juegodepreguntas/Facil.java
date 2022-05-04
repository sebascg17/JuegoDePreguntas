
package juegodepreguntas;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import static juegodepreguntas.MenuCategorias.nombre;
import static juegodepreguntas.MenuCategorias.personas;
import static juegodepreguntas.MenuCategorias.premio;
import static juegodepreguntas.MenuCategorias.puntaje;
import static juegodepreguntas.MenuCategorias.ronda;

public final class Facil extends javax.swing.JFrame {
    //EN ESTE ARREGLO SE CREAN LAS PREGUNTAS Y RESPUESTAS
    static String textoBaseDePreguntas = "¿Cual es el actual presidente de Colombia?\tIván Duque\tAlvaro Uribe\tGustavo Petro\tFederico Gutierrez"
            +"\n"
            +"¿Cual es el actual presidente de Venezuela?\tNicolás Maduro\tHugo Chavez\tFidel Castro\tGustavo Petro"
            +"\n"
            +"¿Cual es el actual presidente de Rusia?\tVladimir Putin\tFidel Castroky\tGustavo Petrosky\tChavezosky"
            +"\n"
            +"¿Cual es el actual presidente de EE.UU?\tJoe Biden\tDonald Trump\tBarack Obama\tGeorge Washington"
            +"\n"
            +"¿Cual es el actual presidente del Reino Unido?\tNinguno\tElizabeth Alexandra Mary\tCecilia Cavendish-Bentinck\tDiana Frances Spencer";
    
    //DECLARACION DE VARIABLES
    static String[] renglones1 = textoBaseDePreguntas.split("\n");
    static int cantidadDePreguntas = renglones1.length;    
    static String[][] baseDePreguntas1 = new String[cantidadDePreguntas][5];    
    String[] preguntaEscogida;
    static int puntajeAcumulado = 0;
    String pregunta;
    String respuesta;
    ArrayList<String> Opciones = new ArrayList<>();    
    int n_pregunta=0;

    public static void main(String args[]) {

    try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception ex) {
    }
        for (int i=0;i<renglones1.length;i++ ) {
            String renglon = renglones1[i];
            baseDePreguntas1[i] = renglon.split("\t");
        }
    }
    
    //VALIDA EL ORDEN DEL ARREGLO, EN LA POSICION 0, SERÍA LA PREGUNTA Y LA POSICION 1 LA RESPUESTA CORRECTA
    public void escogerPregunta(int n){
        preguntaEscogida = baseDePreguntas1[n];
        pregunta = preguntaEscogida[0];
        respuesta = preguntaEscogida[1];
        Opciones.clear();
        for(int i=1; i<preguntaEscogida.length; i++){
          Opciones.add(preguntaEscogida[i]);
        }
        //PONE EL ORDEN DE LAS RESPUESTAS EN ALEATORIO
        for (int i = 0; i < 4; i++) {
            Collections.shuffle(Opciones);
        }
//        Opciones= new String[4];
//        for(int i=1; i<preguntaEscogida.length; i++){
//          Opciones[i-1]=preguntaEscogida[i];
//        }
    }
    
    //MUESTRA LAS PREGUNTAS EN SUS RESPECTIVOS BOTONES DE ELECCION DE PREGUNTA
    public void mostrarPregunta(){
        jLabel1.setText(pregunta);
        btnOpcion1.setText(Opciones.get(0));
        btnOpcion2.setText(Opciones.get(1));
        btnOpcion3.setText(Opciones.get(2));
        btnOpcion4.setText(Opciones.get(3));
        
    }
    
    //ESTA FUNCION PERMITE ESCOGER LAS RESPUESTAS
    void escogerRespuesta(int n){
        
        //VALIDA LA RESPUESTA CORRECTA Y SUMA UN PUNTO
        if (Opciones.get(n).equals(respuesta)) {
            puntaje++;
            premio = premio+200000;
            personas.setPuntaje(puntaje);
            personas.setPremio(premio);
            JOptionPane.showMessageDialog(this,nombre+", su respuesta es correcta, su puntaje actual es: "+puntaje+", ganando $"+premio+" pesos",
                    "¡Muy bien!",
                    JOptionPane.INFORMATION_MESSAGE
            );
            
        }else{
            //AL SER INCORRECTA LA RESPUESTA, CON ESTA FUNCION TE FINALIZA EL JUEGO Y TE LLEVA A LAS PUNTUACIONES
            JOptionPane.showMessageDialog(this,nombre+", su respuesta es incorrecta, la respuesta es: "+respuesta,
                    "Que mal :(",
                    JOptionPane.ERROR_MESSAGE
            );
            JOptionPane.showMessageDialog(this,nombre+", su puntaje es: "+puntaje+", ganando $"+premio+" pesos",
                    "¡Sigue intentandolo!",
                    JOptionPane.INFORMATION_MESSAGE
            );
            new Puntajes();
            this.dispose();
        }
        jugar();
    }
    
    //ESTA FUNCION VALIDA SI SE RESPONDIERON TODAS LAS PREGUNTAS DEL ACTUAL NIVEL Y CONTINUA CON EL OTRO NIVEL
    public void jugar(){
        if (puntaje==10) {
            ronda++;
            JOptionPane.showMessageDialog(this,nombre+", has pasado a la ronda, #" +ronda ,
                    "Muy bien",
                    JOptionPane.PLAIN_MESSAGE
            );
            JOptionPane.showMessageDialog(this,"Su puntaje es: "+puntaje+"\nGanando $"+premio+" pesos"+"\nIncrementando a $300000 pesos por cada respuesta correcta en la siguiente ronda.",
                    ":)",
                    JOptionPane.PLAIN_MESSAGE
            );
            new Medio();
            this.dispose();
        }
        escogerPregunta(n_pregunta);
        mostrarPregunta();
        n_pregunta++;
        
    }
    
    //CONTRUCTOR
    public Facil() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        jugar();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnOpcion1 = new javax.swing.JButton();
        btnOpcion2 = new javax.swing.JButton();
        btnOpcion3 = new javax.swing.JButton();
        btnOpcion4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pregunta");

        btnOpcion1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion1.setText("Opcion 1");
        btnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion1ActionPerformed(evt);
            }
        });

        btnOpcion2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion2.setText("Opcion 2");
        btnOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion2ActionPerformed(evt);
            }
        });

        btnOpcion3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion3.setText("Opcion 3");
        btnOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion3ActionPerformed(evt);
            }
        });

        btnOpcion4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOpcion4.setText("Opcion 4");
        btnOpcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpcion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOpcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOpcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpcion2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpcion3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOpcion4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ESTOS BOTONES INGRESAN UN VALOR, EL CUAL SERÍAN LAS RESPUESTAS
    private void btnOpcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion4ActionPerformed
        escogerRespuesta(3);
    }//GEN-LAST:event_btnOpcion4ActionPerformed

    private void btnOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion1ActionPerformed
        escogerRespuesta(0);
    }//GEN-LAST:event_btnOpcion1ActionPerformed

    private void btnOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion2ActionPerformed
        escogerRespuesta(1);
    }//GEN-LAST:event_btnOpcion2ActionPerformed

    private void btnOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion3ActionPerformed
        escogerRespuesta(2);
    }//GEN-LAST:event_btnOpcion3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpcion1;
    private javax.swing.JButton btnOpcion2;
    private javax.swing.JButton btnOpcion3;
    private javax.swing.JButton btnOpcion4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables


}
