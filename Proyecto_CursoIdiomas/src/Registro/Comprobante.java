package Registro;

import javax.swing.*;
import java.io.*;
import java.util.Date;

public class Comprobante {
    private int idComprobante=0;
    private String cliente;
    private Date date;
    private String idioma;
    private String nivel;
    private double valor=250.0;
    private Date fecha_pago;

    public Comprobante(Estudiante cliente,Curso curso) {
        this.idComprobante =+ idComprobante;
        this.cliente = cliente.getNombre()+" "+cliente.getApellidos();
        this.date = date;
        //this.idioma = curso.getIdioma();
        //this.nivel= curso.getNivel();
        this.valor = calculoPago();
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

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
        File voucher = new File("Datos_Comprobante.txt");
        checkFile(voucher);
    }

    private void checkFile(File voucher) {
        if(voucher.exists()) {
            try{
                FileTXT(voucher, true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            try{
                voucher.createNewFile();
                FileTXT(voucher, false);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }

    private void FileTXT(File voucher, boolean b) throws IOException {
        FileWriter escribir_datos = new FileWriter(voucher,b);
        BufferedWriter bwr_datos = new BufferedWriter(escribir_datos);
        PrintWriter mostrarDatos = new PrintWriter(bwr_datos);

        mostrarDatos.println(toSave());
        bwr_datos.flush();
        escribir_datos.close();
    }

    public double calculoPago(){
        return valor*0.12+valor;
    }

}
