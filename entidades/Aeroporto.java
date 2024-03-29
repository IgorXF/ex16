/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author igorxf
 */
public class Aeroporto {
    private String nome;
    private String localizacao;
    private List<Voo> voos;

    public Aeroporto(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
        this.voos = new ArrayList<>();
    }
    
    public Aeroporto() {
        this.voos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Voo> getVoos() {
        return voos;
    }

    public void setVoos(List<Voo> voos) {
        this.voos = voos;
    }
    
    public void addVoo(Voo voo){
        if(!voos.contains(voo)){
            voos.add(voo);
        }
    }
    
    public void removeVoo(Voo voo){
        if(voos.contains(voo)){
            voos.remove(voo);
        }
    }
    
    public List<Voo> listarVoos() {
        return voos;
    }
    
    public void iniciarVoo(String numVoo) {
        for (Voo v : voos) {
            if (v.getNumVoo().equals(numVoo)) {
                v.alterarEstadoVoo("Voando");
                System.out.println("Voo " + numVoo + " iniciado.");
                return; // Encerra o método após encontrar e iniciar o voo
            }
        }
        System.out.println("Voo " + numVoo + " não encontrado no aeroporto.");
    }
    
    public List<Voo> verificaPreju() {
        List<Voo> voosPrejuizo = new ArrayList<>();
        for (Voo voo : voos) {
            if (voo.verificaAbaixoCapacidadeMin()) {
                voosPrejuizo.add(voo);
            }
        }
        return voosPrejuizo;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.localizacao);
        hash = 89 * hash + Objects.hashCode(this.voos);
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
        final Aeroporto other = (Aeroporto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.localizacao, other.localizacao)) {
            return false;
        }
        return Objects.equals(this.voos, other.voos);
    }

    @Override
    public String toString() {
        return "Aeroporto{" +
                "nome=" + nome +
                "localizacao=" + localizacao +
                "voos=" + voos + '}';
    }
    
    public void imprimir(){
            System.out.println(this);
    }
}
