/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import gerenciador.SistemaFidelidade;
import java.util.Objects;

/**
 *
 * @author igorxf
 */
public class Passageiro {
    private String nome;
    private String CPF;
    private SistemaFidelidade sistemaFidelidade;
    
    public Passageiro() {
        this.sistemaFidelidade = new SistemaFidelidade();
    }

    public Passageiro(String nome, String CPF) {
        this.nome = nome;
        this.CPF = CPF;
        this.sistemaFidelidade = new SistemaFidelidade();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    
    public SistemaFidelidade getSistemaFidelidade() {
        return sistemaFidelidade;
    }

    public void setSistemaFidelidade(SistemaFidelidade sistemaFidelidade) {
        this.sistemaFidelidade = sistemaFidelidade;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.CPF);
        hash = 53 * hash + Objects.hashCode(this.sistemaFidelidade);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Passageiro other = (Passageiro) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.CPF, other.CPF)) {
            return false;
        }
        return Objects.equals(this.sistemaFidelidade, other.sistemaFidelidade);
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "nome=" + nome +
                "CPF=" + CPF +
                "Sistema de Fidelidade=" + sistemaFidelidade + '}';
    }
    
    public void imprimir(){
        System.out.println(this);
    }
}
