package Registro;

import javax.swing.*;
import java.io.*;

public class ListaEstudiantes {
    private Estudiante estudiante;
    private ListaEstudiantes listaEstudiantes;

    public void agregarEstudiante (Estudiante estudiante){
        this.estudiante=estudiante;

        File file= new File("ListaEstudiantes.txt");

        if(file.exists()){
            try {
                FileWriter fw = new FileWriter(file);
                FileReader fr= new FileReader(file);
                BufferedReader br=new BufferedReader(fr);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw= new PrintWriter(bw);

                String linea =br.readLine();

                while (linea!=null){
                    bw.append(linea+"\n");
                    bw.flush();
                    linea=br.readLine();
                }

                pw.write(this.estudiante.toSave());
                bw.flush();

            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "ha sucedido un error");

            }

        }else {
            try {
                file.createNewFile();
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter wr= new PrintWriter(bw);

                wr.write(this.estudiante.toSave());
                bw.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
    public void darDeBaja(Estudiante estudiante){

    }

}

