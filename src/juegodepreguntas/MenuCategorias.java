package juegodepreguntas;

import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static juegodepreguntas.MuyFacil.baseDePreguntas;
import static juegodepreguntas.MuyFacil.renglones;
import static juegodepreguntas.Facil.baseDePreguntas1;
import static juegodepreguntas.Facil.renglones1;
import static juegodepreguntas.Medio.baseDePreguntas2;
import static juegodepreguntas.Medio.renglones2;
import static juegodepreguntas.Dificil.baseDePreguntas3;
import static juegodepreguntas.Dificil.renglones3;
import static juegodepreguntas.MuyDificil.baseDePreguntas4;
import static juegodepreguntas.MuyDificil.renglones4;

public class MenuCategorias extends javax.swing.JFrame {
    
    
    //DECLARO VARIABLES ESTATICAS PARA QUE SE PUEDAN UTILIZAR EN LAS OTRAS CLASES
    static Personas personas = new Personas();
    static Metodos metodos = new Metodos();
    static DefaultTableModel mdlTabla;
    static Vector vCabeceras = new Vector();
    static String nombre = "";
    static int puntaje = 0;
    
    
    //CONSTRUCTOR
    public MenuCategorias() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        lblRequerido.setVisible(false);
        
        
    }

    //FRONT END
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnMuyFacil = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblRequerido = new javax.swing.JLabel();
        btnPuntajes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("JUEGO DE PREGUNTAS Y RESPUESTAS");

        btnMuyFacil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMuyFacil.setText("Empezar");
        btnMuyFacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuyFacilActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ingrese su nombre");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblRequerido.setForeground(new java.awt.Color(255, 0, 0));
        lblRequerido.setText("Requerido");

        btnPuntajes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPuntajes.setText("Ver Puntajes");
        btnPuntajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntajesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 217, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPuntajes, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(30, 30, 30)
                                    .addComponent(lblRequerido)
                                    .addGap(320, 320, 320))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnMuyFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(225, 225, 225)))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblRequerido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(btnMuyFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPuntajes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //BOTON QUE INICIA EL TEST DESDE LA PRIMERA DIFICULTAD
    private void btnMuyFacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuyFacilActionPerformed
        
        //VALIDA SI EL CAMPO NOMBRE ESTÁ VACIÓ
        if (txtNombre.getText().equals("")) {
            lblRequerido.setVisible(true);
        }else{
        //SI TIENE CARACTERES EN EL CAMPO INICIA EL TEST Y VALIDA EL TEXTO INGRESADO   
            new MuyFacil();
            nombre=txtNombre.getText();
            
            
        }
    }//GEN-LAST:event_btnMuyFacilActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    //BOTON QUE MUESTRA LA TABLA DE PUNTAJES
    private void btnPuntajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntajesActionPerformed
        //VALIDA SI EL CAMPO NOMBRE ESTÁ VACIÓ 
        if (txtNombre.getText().equals("")) {
            lblRequerido.setVisible(true);
        }else{
            //ABRE LA CLASE PUNTAJES
            new Puntajes();
 
        }
        
    }//GEN-LAST:event_btnPuntajesActionPerformed

    /**
     * @param args the command line arguments
     */
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
        //CADA FOR CUENTA EL NUMERO DE RENGLONES QUE HAY EN EL ARREGLO DE PREGUNTAS Y RESPUESTAS 
        for (int i=0;i<renglones.length;i++ ) {
            String renglon = renglones[i];
            baseDePreguntas[i] = renglon.split("\t");
        }
        for (int i=0;i<renglones1.length;i++ ) {
            String renglon = renglones1[i];
            baseDePreguntas1[i] = renglon.split("\t");
        }
        for (int i=0;i<renglones2.length;i++ ) {
            String renglon = renglones2[i];
            baseDePreguntas2[i] = renglon.split("\t");
        }
        for (int i=0;i<renglones3.length;i++ ) {
            String renglon = renglones3[i];
            baseDePreguntas3[i] = renglon.split("\t");
        }
        for (int i=0;i<renglones4.length;i++ ) {
            String renglon = renglones4[i];
            baseDePreguntas4[i] = renglon.split("\t");
        }
        new MenuCategorias();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMuyFacil;
    private javax.swing.JButton btnPuntajes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblRequerido;
    public static javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
