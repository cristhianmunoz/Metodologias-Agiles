package Registro;

import javax.swing.*;
import java.io.*;
import java.util.Date;

public class Comprobante {
    private int idComprobante=6;
    private String cliente="Andrea";
    private Date date;
    private String idioma="Ingles";
    private String nivel="Academico";
    private double valor=250.0;
    private Date fecha_pago;

    public String imprimirComprobante(){
        date = new Date();
        return "Comprobante No: "+ this.idComprobante+
                "; Cliente: "+this.cliente+
                "; Fecha de emisiòn: "+date+
                "; Idioma: "+this.idioma+
                "; Nivel: "+this.nivel+
                "; Costo: "+calculoPago()+
                "; Fecha de Pago: "+date;
    }

    public void guardarComporbante(){
        String Comprobante = imprimirComprobante();

        File datos_Comprobante = new File("Datos_Comprobante.txt");
        if(datos_Comprobante.exists()){
            try{
                FileWriter escribir_datos_Comprobante = new FileWriter(datos_Comprobante,true);
                FileReader leer_datos_comprobante = new FileReader(datos_Comprobante);
                BufferedReader blr_datos = new BufferedReader(leer_datos_comprobante);
                BufferedWriter bwr_datos = new BufferedWriter(escribir_datos_Comprobante);
                PrintWriter mostrarDatos = new PrintWriter(bwr_datos);

                String lìnea = blr_datos.readLine();

                while(lìnea != null){
                    bwr_datos.append(linea+"\n");
                    bwr_datos.flush();
                    lìnea = blr_datos.readLine();
                }
                mostrarDatos.write(Comprobante);
                bwr_datos.flush();
                /*escribir_datos_Comprobante.write(Comprobante);
                escribir_datos_Comprobante.close();*/

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error inesperado");

            }
        }else{
            try{

            }
        }

    }

    public double calculoPago(){
        return valor*0.12+valor;
    }

}
