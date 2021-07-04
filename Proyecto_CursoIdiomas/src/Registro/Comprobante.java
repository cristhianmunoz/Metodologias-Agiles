package Registro;

import java.util.Date;
import java.io.File;
import java.io.FileWriter;

public class Comprobante {
    private int idComprobante;
    private String cliente;
    private Date date;
    private String idioma;
    private String nivel;
    private double valor;
    private Date fecha_pago;

    public String imprimirComprobante(){
        date = new Date();
        return "Comprobante No: "+ this.idComprobante+
                "Cliente: "+this.cliente+
                "Fecha de emisiòn: "+date.getMonth()+
                "Idioma: "+this.idioma+
                "Nivel: "+this.nivel+
                "Costo: "+calculoPago()+
                "Fecha de Pago: "+date;
    }

    public void guardarComporbante(){
        String Comprobante = imprimirComprobante();
        try{

            File datos_Comprobante = new File("C:/Documentos/Datos_Comprobante.txt");
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
