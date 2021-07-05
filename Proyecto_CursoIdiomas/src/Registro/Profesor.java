package Registro;

import java.io.*;

public class Profesor extends Persona{

    private  Boolean estado;

    public Profesor(String nombre,String apellidos,int id){
        super(nombre,apellidos,id);
        this.estado=true;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Boolean getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id= "+getId()+";"+
                "nombre= "+ getNombre()+";"+
                "apellidos= "+getApellidos()+";"+
                "estado=" + estado + '\'' +
                '}';
    }

    public String toSave(){
        return getId()+";"+getNombre()+";"+getApellidos()+";"+estado + ";";
    }



}
