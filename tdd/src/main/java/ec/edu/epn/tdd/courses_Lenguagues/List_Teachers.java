package ec.edu.epn.tdd.courses_Lenguagues;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class List_Teachers {
    ArrayList<String[]> AUX = new ArrayList<>();
    private Teacher teacher;
    private List_Teachers listTeachers;

    public List_Teachers() {
        this.teacher = teacher;
    }

    public void agregarProfesor (Teacher teacher){
    this.teacher = teacher;
        File file= new File(getPath());

        if(file.exists()){
            try {
                setEscribirEnArchivo(file, true);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ha sucedido un error en List_Teachers");
            }
        }else {
            try {
                file.createNewFile();
                setEscribirEnArchivo(file, false);
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Ha sucedido un error en List_Teachers");
            }
        }
    }
    public void darDeBaja(Teacher teacher, Course[] course){
        this.teacher = teacher;

        File file= new File(getPathInactiveTeacher());
        try{
            //teacher.setEstado(false);
            if(file.exists()){
                setEscribirEnArchivo(file, true);
            }else{
                file.createNewFile();
                setEscribirEnArchivo(file, true);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        //teacher.getEstado() = TRUE = disponible
        //!teacher.getEstado() = FALSE = no esta disponible
        if(!teacher.getEstado()){
            //System.out.println("estado:"+teacher.getEstado());
            for(int i = 0; i< course.length; i++){
                if(course[i].getProfesor()== teacher){
                    System.out.println("Asignar un nuevo teacher al course "+ course[i]);
                    course[i].setProfesor(null);
                }
            }
        }
        editedFileTxt(getPath(), teacher.getApellidos());
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

    public void eliminarProfesor(Teacher teacher, Course[] courses, String path1, String path2){
        teacher = null;


    }
    private void setEscribirEnArchivo(File file, boolean b) throws IOException {
        FileWriter fw = new FileWriter(file,b);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw= new PrintWriter(bw);

        pw.println(this.teacher.toSave());
        pw.close();
        bw.close();
    }
    private String getPath(){
        return "List_Teachers.txt";
    }
    private String getPathInactiveTeacher(){
        return "InactiveTeachers.txt";
    }

    public Teacher getProfesor() {
        return teacher;
    }

    public void setProfesor(Teacher teacher) {
        this.teacher = teacher;
    }
}
