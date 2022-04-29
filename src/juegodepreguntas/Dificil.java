
package juegodepreguntas;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import static juegodepreguntas.Medio.puntajeAcumulado;
import static juegodepreguntas.MenuCategorias.nombre;
import static juegodepreguntas.MenuCategorias.personas;
import static juegodepreguntas.MenuCategorias.puntaje;

public class Dificil extends javax.swing.JFrame {
    //EN ESTE ARREGLO SE CREAN LAS PREGUNTAS Y RESPUESTAS
    static String textoBaseDePreguntas = "¿Cuales NO son conceptos básicos de OOPS?\tClase\tHerencia\tAbstracción\tEncapsulación"
            +"\n"
            +"¿Qué es una clase?\tEs el plan que define las características de un objeto\tEs una característica del objeto y guarda todos los datos ocultos\tEs el concepto con el cual se aclara que una clase divide la estructura y comportamiento definidos en otra clase\tEs la técnica usada por  compiladores y que  indica que introduzcas el cuerpo entero de la función"
            +"\n"
            +"¿Qué es un objeto?\tEs parte de una clase, tiene su propio estado, comportamiento y definición\tEs el plan que define las características de un objeto\tEs el concepto con el cual se aclara que una clase divide la estructura y comportamiento definidos en otra clase\tEs la técnica usada por  compiladores y que  indica que introduzcas el cuerpo entero de la función"
            +"\n"
            +"¿Qué es la encapsulación?\tEs una característica del objeto y guarda todos los datos ocultos\tEs parte de una clase, tiene su propio estado, comportamiento y definición\tEs la técnica usada por  compiladores y que  indica que introduzcas el cuerpo entero de la función\tEs el concepto con el cual se aclara que una clase divide la estructura y comportamiento definidos en otra clase"
            +"\n"
            +"¿Qué es la herencia?\tEs el concepto con el cual se aclara que una clase divide la estructura y comportamiento definidos en otra clase\tEs una característica del objeto y guarda todos los datos ocultos\tEs parte de una clase, tiene su propio estado, comportamiento y definición\tEs parte de una clase, tiene su propio estado, comportamiento y definición\tEs la técnica usada por  compiladores y que  indica que introduzcas el cuerpo entero de la función";
    
    //DECLARACION DE VARIABLES
    static String[] renglones3 = textoBaseDePreguntas.split("\n");
    static int cantidadDePreguntas = renglones3.length;    
    static String[][] baseDePreguntas3 = new String[cantidadDePreguntas][4];    
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
        for (int i=0;i<renglones3.length;i++ ) {
            String renglon = renglones3[i];
            baseDePreguntas3[i] = renglon.split("\t");
        }
    }
    
    //VALIDA EL ORDEN DEL ARREGLO, EN LA POSICION 0, SERÍA LA PREGUNTA Y LA POSICION 1 LA RESPUESTA CORRECTA
    public void escogerPregunta(int n){
        preguntaEscogida = baseDePreguntas3[n];
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
            personas.setPuntaje(puntaje);
            JOptionPane.showMessageDialog(this,nombre+", su respuesta es correcta, su puntaje actual es: "+puntaje,
                    "¡Muy bien!",
                    JOptionPane.INFORMATION_MESSAGE
            );
            
        }else{
            //AL SER INCORRECTA LA RESPUESTA, CON ESTA FUNCION TE FINALIZA EL JUEGO Y TE LLEVA A LAS PUNTUACIONES
            JOptionPane.showMessageDialog(this,nombre+", su respuesta es incorrecta, la respuesta es: "+respuesta,
                    "Que mal :(",
                    JOptionPane.ERROR_MESSAGE
            );
            JOptionPane.showMessageDialog(this,nombre+", su puntaje es: "+puntaje,
                    "¡Sigue intentandolo!",
                    JOptionPane.INFORMATION_MESSAGE
            );
            new Puntajes();
        }
        jugar();
    }    
    
    //ESTA FUNCION VALIDA SI SE RESPONDIERON TODAS LAS PREGUNTAS DEL ACTUAL NIVEL Y CONTINUA CON EL OTRO NIVEL
    public void jugar(){
        if (n_pregunta==cantidadDePreguntas) {
            JOptionPane.showMessageDialog(this,nombre+", siguiente nivel, su puntaje es: "+puntaje,
                    "Muy bien",
                    JOptionPane.PLAIN_MESSAGE
            );
            new MuyDificil();
        }
        escogerPregunta(n_pregunta);
        mostrarPregunta();
        n_pregunta++;
        
    }
    
    //CONTRUCTOR
    public Dificil() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
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
