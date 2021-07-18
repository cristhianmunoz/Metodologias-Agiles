package ec.edu.epn.tdd.courses_Lenguagues;

import javax.swing.*;
import java.io.*;

public class List_Students {
    private Student student;

    public void add_Student(Student student, String path){
        this.student = student;

        File file= new File(path);

        if(file.exists()){
            try {
                set_write_file(file, true);
            }catch (Exception e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ha sucedido un error en List_Students");
            }
        }else {
            try {
                file.createNewFile();
                set_write_file(file, false);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ha sucedido un error en List_Students");
            }
        }
    }

    private void set_write_file(File file, boolean b) throws IOException {
        FileWriter fw = new FileWriter(file, b);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.println(this.student.toSave());
        pw.close();
        bw.close();
    }

    public Student unsubscribe_Student(String id, String path){
        String line = "";
        String sCadena="";
        String id_Student= id;
        Student result= null;

        try {
            //BUSCAR SI EXISTE UNA PALABRA
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((line= br.readLine()) !=null){
                if(line.contains(id_Student)){

                    String [] elements= toString().split(";");
                    result= new Student(elements[1],elements[2],Integer.parseInt(elements[0]));
                    sCadena += line.replaceAll(line,"");
                    return result;
                }else{
                    sCadena += line+"\n";
                    return null;
                }
            }
            FileWriter wr = new FileWriter(path);
            wr.write(sCadena);
            br.close();
            wr.close();

        }catch (IOException e){
            e.printStackTrace();
        }
        return result;
    }

    public int get_Enrolled_Students(String path){
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

