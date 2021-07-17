package Registro;

import javax.swing.*;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;

public class ListaProfesores {
    ArrayList<String[]> AUX = new ArrayList<>();
    private Profesor profesor;
    private ListaProfesores listaProfesores;

    public ListaProfesores() {
        this.profesor = profesor;
    }

    public void agregarProfesor (Profesor profesor, String getPath){
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
    public void darDeBaja(Profesor profesor, Curso []curso){
        this.profesor=profesor;

        File file= new File(getPathInactiveTeacher());
        try{
            //profesor.setEstado(false);
            if(file.exists()){
                setEscribirEnArchivo(file, true);
            }else{
                file.createNewFile();
                setEscribirEnArchivo(file, true);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //profesor.getEstado() = TRUE = disponible
        //!profesor.getEstado() = FALSE = no esta disponible
        if(!profesor.getEstado()){
            //System.out.println("estado:"+profesor.getEstado());
            for(int i=0;i<curso.length;i++){
                if(curso[i].getProfesor()==profesor){
                    System.out.println("Asignar un nuevo profesor al curso "+curso[i]);
                    curso[i].setProfesor(null);
                }
            }
        }
        editedFileTxt(getPath(),profesor.getApellidos());
        System.out.println("");
    }

    public void editedFileTxt(String path, String apellidos){
        String line = "";
        String sCadena="";

        try {
            //BUSCAR SI EXISTE UNA PALABRA
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line= br.readLine()) !=null){
                if(line.indexOf(apellidos)!= -1){
                    sCadena += line.replaceAll(line,"");
                }else{
                    sCadena += line+"\n";
                }
            }
            FileWriter wr = new FileWriter(getPath());
            wr.write(sCadena);
            br.close();
            wr.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void eliminarProfesor(Profesor profesor, Curso []cursos, String path1, String path2){
        profesor = null;


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
    private String getPathInactiveTeacher(){
        return "InactiveTeachers.txt";
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
