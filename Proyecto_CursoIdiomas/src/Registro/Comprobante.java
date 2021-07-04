package Registro;

import java.util.Date;
import java.io.File;
import java.io.FileWriter;

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
                "\nCliente: "+this.cliente+
                "\nFecha de emisiòn: "+date+
                "\nIdioma: "+this.idioma+
                "\nNivel: "+this.nivel+
                "\nCosto: "+calculoPago()+
                "\nFecha de Pago: "+date;
    }

    public void guardarComporbante(){
        String Comprobante = imprimirComprobante();
        try{

            File datos_Comprobante = new File("Datos_Comprobante.txt");
            FileWriter escribir_datos_Comprobante = new FileWriter(datos_Comprobante,true);
            escribir_datos_Comprobante.write(Comprobante);
            escribir_datos_Comprobante.close();

        } catch (Exception e) {
            System.out.println("Error al escribir");
        }
    }

    public double calculoPago(){
        return valor*0.12+valor;
    }

}
