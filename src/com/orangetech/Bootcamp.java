package src.com.orangetech;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicio = LocalDate.now();
    private final LocalDate dataFim = dataInicio.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public LocalDate getDataInicio(){
        return dataInicio;
    }

    public LocalDate getDataFim(){
        return dataFim;
    }

    public Set<Dev> getDevsInscritos(){
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos){
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos(){
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos){
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass () != o.getClass ()) return false;

        Bootcamp bootcamp = (Bootcamp) o;

        if (nome != null ? !nome.equals (bootcamp.nome) : bootcamp.nome != null) return false;
        if (descricao != null ? !descricao.equals (bootcamp.descricao) : bootcamp.descricao != null) return false;
        if (dataInicio != null ? !dataInicio.equals (bootcamp.dataInicio) : bootcamp.dataInicio != null) return false;
        if (dataFim != null ? !dataFim.equals (bootcamp.dataFim) : bootcamp.dataFim != null) return false;
        if (devsInscritos != null ? !devsInscritos.equals (bootcamp.devsInscritos) : bootcamp.devsInscritos != null)
            return false;
        return conteudos != null ? conteudos.equals (bootcamp.conteudos) : bootcamp.conteudos == null;
    }

    @Override
    public int hashCode(){
        int result = nome != null ? nome.hashCode () : 0;
        result = 31 * result + (descricao != null ? descricao.hashCode () : 0);
        result = 31 * result + (dataInicio != null ? dataInicio.hashCode () : 0);
        result = 31 * result + (dataFim != null ? dataFim.hashCode () : 0);
        result = 31 * result + (devsInscritos != null ? devsInscritos.hashCode () : 0);
        result = 31 * result + (conteudos != null ? conteudos.hashCode () : 0);
        return result;
    }
}
