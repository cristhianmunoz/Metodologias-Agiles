package Registro;

public class Persona {
    private String nombre;
    private String apellidos;
    private int id;

    public Persona(String nombre,String apellidos,int id){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.id=id;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


}
