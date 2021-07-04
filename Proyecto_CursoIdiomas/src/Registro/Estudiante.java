package Registro;

public class Estudiante  extends Persona{

    public Estudiante(String nombre,String apellidos,int id){
        super(nombre,apellidos,id);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    public String toSave(){
        return getId()+";"+getNombre()+";"+getApellidos()+";";
    }
}
