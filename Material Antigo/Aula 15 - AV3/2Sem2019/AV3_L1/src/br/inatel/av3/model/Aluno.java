package br.inatel.av3.model;

import java.io.Serializable;

public class Aluno implements Comparable<Aluno>, Serializable {

    private String nome;
    private String curso;
    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public int compareTo(Aluno a) {
        return nome.compareTo(a.nome);
    }

    @Override
    public String toString() {
        return this.nome + ", Matricula: " + this.matricula 
                + ", Curso: " + this.curso;
    }
    
    

}
