package dominio.bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

import dominio.conteudo.Conteudo;
import dominio.dev.Dev;

public class Bootcamp {
    
    private String nome;
    private String descricao;
    
    private final LocalDate data_inicio = LocalDate.now();
    private final LocalDate data_fim = data_inicio.plusDays(45);
    
    private Set<Dev> devs = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData_inicio() {
        return data_inicio;
    }


    public LocalDate getData_fim() {
        return data_fim;
    }

    public Set<Dev> getDevs() {
        return devs;
    }

    public void setDevs(Set<Dev> devs) {
        this.devs = devs;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }



    @Override
    public String toString() {
        return "Bootcamp{" + "nome=" + nome + ", descricao=" + descricao + ", data_inicio=" + data_inicio + ", data_fim=" + data_fim + '}';
    }

    // equals e hashCode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Bootcamp other = (Bootcamp) obj;
        return Objects.equals(this.nome, other.nome) && Objects.equals(this.descricao, other.descricao) 
        && Objects.equals(this.data_inicio, other.data_inicio) && Objects.equals(this.data_fim, other.data_fim);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, data_inicio, data_fim, devs, conteudos);
    }
}