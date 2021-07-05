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
    public String toSave(){

        return this.idComprobante+";"+this.cliente+";"+date+";"+this.idioma+";"+this.nivel+";"+calculoPago()+";"+date;

    }

    public void guardarComporbante(){
        String Comprobante = toSave();

        File datos_Comprobante = new File("Datos_Comprobante.txt");
        if(datos_Comprobante.exists()) {
            try{
                FileWriter escribir_datos = new FileWriter(datos_Comprobante,true);
                FileReader leer_datos = new FileReader(datos_Comprobante);
                BufferedReader blr_datos = new BufferedReader(leer_datos);
                BufferedWriter bwr_datos = new BufferedWriter(escribir_datos);
                PrintWriter mostrarDatos = new PrintWriter(bwr_datos);

                String linea = blr_datos.readLine();

                /*while(linea != null){
                    bwr_datos.append(linea+"\n");
                    bwr_datos.flush();
                    linea = blr_datos.readLine();
                }*/
                mostrarDatos.println(toSave());
                bwr_datos.flush();
                //escribir_datos_Comprobante.write(Comprobante);
                escribir_datos.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error inesperado");

            }
        }else{
            try{
                datos_Comprobante.createNewFile();
                FileWriter escribir_datos = new FileWriter(datos_Comprobante);
                BufferedWriter bwr_datos = new BufferedWriter(escribir_datos);
                PrintWriter mostrar_datos = new PrintWriter(bwr_datos);

                mostrar_datos.println(toSave());
                bwr_datos.flush();
                escribir_datos.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }


    }

    public double calculoPago(){
        return valor*0.12+valor;
    }

}
