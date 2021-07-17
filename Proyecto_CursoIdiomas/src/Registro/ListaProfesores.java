package Registro;

import javax.swing.*;
import java.io.*;

public class ListaProfesores {
    private Profesor profesor;
    private ListaProfesores listaProfesores;

    public void agregarProfesor (Profesor profesor){
    this.profesor=profesor;
        File file= new File(getPath());

        if(file.exists()){
            try {
                setEscribirEnArchivo(file, true);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ha sucedido un error en ListaProfesores");
            }
        }else {
            try {
                file.createNewFile();
                setEscribirEnArchivo(file, false);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ha sucedido un error en ListaProfesores");
            }
        }
    }

    private void setEscribirEnArchivo(File file, boolean b) throws IOException {
        FileWriter fw = new FileWriter(file,b);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw= new PrintWriter(bw);

        pw.println(this.profesor.toSave());
        pw.close();
        bw.close();
    }
    private String getPath(){
        return "ListaProfesores.txt";
    }

    public void darDeBaja(Profesor profesor){

    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
