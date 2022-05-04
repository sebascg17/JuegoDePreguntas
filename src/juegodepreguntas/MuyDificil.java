
package juegodepreguntas;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import static juegodepreguntas.MenuCategorias.nombre;
import static juegodepreguntas.MenuCategorias.personas;
import static juegodepreguntas.MenuCategorias.premio;
import static juegodepreguntas.MenuCategorias.puntaje;
import static juegodepreguntas.MenuCategorias.ronda;

public class MuyDificil extends javax.swing.JFrame {
    //EN ESTE ARREGLO SE CREAN LAS PREGUNTAS Y RESPUESTAS
    static String textoBaseDePreguntas = "Alberto, Benjamín y Carlota hicieron un total de 20 sándwiches. "
            + "Benjamín hizo 3 veces más que Alberto, "
            + "y Carlota hizo el doble que Benjamín "
            + "¿Cuántos sándwiches hizo Alberto?\t2\t4\t5\t6"
            +"\n"
            +"Si 10 + x es 5 más que 10, ¿cuál es el valor de 2x?\t10\t5\t15\t50"
            +"\n"
            +"Adivina cuántos años tengo sabiendo que la tercera parte de ellos menos 1 es igual a la sexta parte\t6\t7\t5\t8"
            +"\n"
            +"7/5 + 2/3 - 1 = \t16/15\t1\t17/15\t8/8"
            +"\n"
            +"¿Qué expresa esta formula? e =mc^2\tEquivalencia entre masa y energía\tCircunferencia de un circuito\tTeoría de la probabilidad\tVolumen de un tubo";
    
    //DECLARACION DE VARIABLES
    static String[] renglones4 = textoBaseDePreguntas.split("\n");
    static int cantidadDePreguntas = renglones4.length;    
    static String[][] baseDePreguntas4 = new String[cantidadDePreguntas][4];    
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
        for (int i=0;i<renglones4.length;i++ ) {
            String renglon = renglones4[i];
            baseDePreguntas4[i] = renglon.split("\t");
        }
    }
    
    //VALIDA EL ORDEN DEL ARREGLO, EN LA POSICION 0, SERÍA LA PREGUNTA Y LA POSICION 1 LA RESPUESTA CORRECTA
    public void escogerPregunta(int n){
        preguntaEscogida = baseDePreguntas4[n];
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
    }
    
    //MUESTRA LAS PREGUNTAS EN SUS RESPECTIVOS BOTONES DE ELECCION DE PREGUNTA
    public void mostrarPregunta(){
        jLabel1.setText(pregunta);
        jButton1.setText(Opciones.get(0));
        jButton2.setText(Opciones.get(1));
        jButton3.setText(Opciones.get(2));
        jButton4.setText(Opciones.get(3));
        
    }
    
    //ESTA FUNCION PERMITE ESCOGER LAS RESPUESTAS
    void escogerRespuesta(int n){
        
        //VALIDA LA RESPUESTA CORRECTA Y SUMA UN PUNTO
        if (Opciones.get(n).equals(respuesta)) {
            puntaje++;
            premio = premio+500000;
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
        if (puntaje==25) {
            JOptionPane.showMessageDialog(this,"¡Felicitaciones "+nombre+"! ganaste con un puntaje de: "+puntaje+" y un total de $"+premio+" de pesos",
                    "VICTORIA",
                    JOptionPane.PLAIN_MESSAGE
            );
            new Puntajes();
        }
        escogerPregunta(n_pregunta);
        mostrarPregunta();
        n_pregunta++;
        
        
    }
    
    //CONTRUCTOR
    public MuyDificil() {
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pregunta");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("Opcion 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Opcion 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Opcion 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Opcion 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 1010, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ESTOS BOTONES INGRESAN UN VALOR, EL CUAL SERÍAN LAS RESPUESTAS
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        escogerRespuesta(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        escogerRespuesta(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        escogerRespuesta(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        escogerRespuesta(3);
    }//GEN-LAST:event_jButton4ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
