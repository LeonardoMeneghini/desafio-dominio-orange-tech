package src.com.orangetech;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Azure");
        curso1.setDescricao("Azure - conceitos fundamentais");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Java");
        curso2.setDescricao("Java - Java com Paridigma Orientado a Objetos");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria Spring boot");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLeonardo = new Dev();
        devLeonardo.setNome("Leonardo");
        devLeonardo.inscreverBootcamp (bootcamp);
        System.out.println ("Conteúdos Inscritos" + devLeonardo.getConteudosInscritos ());
        devLeonardo.progredir();
        System.out.println("-");
        System.out.println ("Conteúdos Inscritos Leonardo:" + devLeonardo.getConteudosInscritos ());
        System.out.println ("Conteúdos Concluidos Leonardo:" + devLeonardo.getConteudosConcluidos ());
        System.out.println ("XP:" + devLeonardo.calcularTotalXp ());


        System.out.println("----------")


        Dev devLeonora = new Dev();
        devLeonora.setNome("Leonora");
        devLeonora.inscreverBootcamp (bootcamp);
        System.out.println ("Conteúdos Inscritos da Leonora" + devLeonora.getConteudosInscritos ());
        System.out.println ("Conteúdos Concluídos da Leonora" + devLeonora.getConteudosConcluidos ());
    }
}
