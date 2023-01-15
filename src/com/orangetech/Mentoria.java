package src.com.orangetech;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private String titulo;
    private String descricao;
    LocalDate data;


    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

    @Override
    public String toString(){
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + getDescricao () + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }

}
