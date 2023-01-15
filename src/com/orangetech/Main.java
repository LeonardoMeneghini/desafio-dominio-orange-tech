package src.com.orangetech;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao ("Curso básico de Java");
        curso1.setCargaHoraria (50);
        System.out.println(curso1);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso php");
        curso1.setDescricao ("Curso básico de PHP");
        curso1.setCargaHoraria (30);
        System.out.println(curso2);



    }
}
