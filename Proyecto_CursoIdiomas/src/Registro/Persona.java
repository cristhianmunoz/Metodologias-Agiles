package Registro;

public abstract class Persona {
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

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", id=" + id +
                '}';
    }
}
