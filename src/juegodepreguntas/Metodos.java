/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodepreguntas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sebas
 */
public class Metodos {
    
    Vector vPrincipal = new Vector();
    
    public void guardar(Personas unaPersona){
        vPrincipal.addElement(unaPersona);
    }
    
    public void guardarArchivo(Personas persona){
        try {
            FileWriter fw = new FileWriter("Personas.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            pw.printf(persona.getNombre());
            pw.printf("|"+persona.getRonda());
            pw.printf("|"+persona.getPuntaje());
            pw.println("|"+"$"+persona.getPremio());
            
            pw.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }
    
    //FUNCION QUE CONFIGURA LA TABLA Y SU CONTENIDO
    public DefaultTableModel listaPersonas(){
            Vector cabeceras = new Vector();
            cabeceras.addElement("Nombre");
            cabeceras.addElement("Ronda");
            cabeceras.addElement("Puntaje");
            cabeceras.addElement("Premio");
            DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras,0);
            
        try {
            //GENERA UN ARCHIVO DE TEXTO DONDE SE ALMACENAN LOS DATOS DEL USUARIO
            FileReader fr = new FileReader("Personas.txt");
            BufferedReader br = new BufferedReader(fr);
            String d;
            while ((d= br.readLine())!=null) {
                StringTokenizer dato = new StringTokenizer(d,"|");
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {                    
                    x.addElement(dato.nextToken());
                }
                mdlTabla.addRow(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mdlTabla;
    }
    
    
    
}
