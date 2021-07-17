package ec.edu.epn.tdd.courses_Lenguagues;

import javax.swing.*;
import java.io.*;

public class List_Students {
    private Student student;
    private List_Students listStudents;

    public void agregarEstudiante (Student student, String path){
        this.student = student;

        File file= new File(path);

        if(file.exists()){
            try {
                setEscribirEnArchivo(file, true);
            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ha sucedido un error en List_Students");
            }
        }else {
            try {
                file.createNewFile();
                setEscribirEnArchivo(file, false);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ha sucedido un error en List_Students");
            }
        }
    }

    private void setEscribirEnArchivo(File file, boolean b) throws IOException {
        FileWriter fw = new FileWriter(file, b);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(this.student.toSave());
        pw.close();
        bw.close();
    }

    public void darDeBaja(Student student){

    }

    public int getEstudiantesMatriculados(String path){
        int numeroEstudiantes = 0;
        String sCadena="";

        try{
            File file= new File(path);
            if(!file.exists()){
                file.createNewFile();
            }
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
                while ((sCadena = bf.readLine())!=null) {
                    numeroEstudiantes++;
                }
        }catch (IOException e){
            e.printStackTrace();
        }
        return numeroEstudiantes;
    }



}

