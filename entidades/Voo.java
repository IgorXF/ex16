/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class Voo {
    private String numVoo;
    private String destino;
    private int capacidade;
    private List<Passageiro> passageiros;
    private List<String> escalas;
    private String estadoV;
    
    public Voo(String numVoo, String destino, int capacidade) {
        this.numVoo = numVoo;
        this.destino = destino;
        this.capacidade = capacidade;
        this.passageiros = new ArrayList<>();
        this.escalas = new ArrayList<>();
        this.estadoV = "Aguardando decolagem";
    }
    
    public Voo() {
        this.passageiros = new ArrayList<>();
        this.escalas = new ArrayList<>();
        this.estadoV = "";
    }

    public String getNumVoo() {
        return numVoo;
    }

    public void setNumVoo(String numVoo) {
        this.numVoo = numVoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public List<String> getEscalas() {
        return escalas;
    }

    public void setEscalas(List<String> escalas) {
        this.escalas = escalas;
    }

    public String getEstadoV() {
        return estadoV;
    }

    public void setEstadoV(String estadoV) {
        this.estadoV = estadoV;
    }
    
    public void addPassageiro(Passageiro passageiro){
        if(!passageiros.contains(passageiro)){
            passageiros.add(passageiro);
        }
    }
    
    public void removePassageiro(Passageiro passageiro){
        if(passageiros.contains(passageiro)){
            passageiros.remove(passageiro);
        }
    }

    public void adicionarEscala(String escala){
        if(!escalas.contains(escala)){
            escalas.add(escala);
        }
    }
    
    public void removerEscala(String escala){
        if(escalas.contains(escala)){
            escalas.remove(escala);
        }
    }

    public void alterarEstadoVoo(String novoEstadoVoo){
        setEstadoV(novoEstadoVoo);
    }
    
    public boolean verificaAbaixoCapacidadeMin(){
        if(passageiros.size() < 5){
            return true;
        }else
            return false;
    }
    
    @Override
    public String toString() {
        return "Voo{" +
                "numVoo=" + numVoo +
                "destino=" + destino +
                "capacidade=" + capacidade +
                "passageiros=" + passageiros +
                "escalas=" + escalas +
                "estadoV=" + estadoV + '}';
    }
    
    public void imprimir(){
        System.out.println(this);
    }
}
