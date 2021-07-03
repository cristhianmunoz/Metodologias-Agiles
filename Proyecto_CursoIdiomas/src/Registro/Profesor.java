package Registro;

public class Profesor extends Persona{

    private  String estado;

    public Profesor(String nombre,String apellidos,int id){
        super(nombre,apellidos,id);
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
