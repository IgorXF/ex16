/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package att16;

import entidades.Aeroporto;
import entidades.Passageiro;
import entidades.Voo;
import java.util.List;

/**
 *
 * @author igorxf
 */
public class Att16 {
    
    public static void main(String[] args) {
        Aeroporto aeroporto = new Aeroporto("Aeroporto Internacional de Brasília", "Brasília");
        Voo voo1 = new Voo("BR123", "Nova York", 100);
        Passageiro passageiro1 = new Passageiro("João Silva", "12345678900");

        // Adicionando escalas ao voo
        voo1.adicionarEscala("Miami");
        voo1.adicionarEscala("Orlando");

        aeroporto.addVoo(voo1);
        voo1.addPassageiro(passageiro1);
    
        // Passageiro acumula pontos após completar um voo
        passageiro1.getSistemaFidelidade().adicionarPontos(500);

        // Iniciar voo
        aeroporto.iniciarVoo("BR123");

        // Verificar voos com prejuízo
        System.out.println("Voos com prejuízo:");
        List<Voo> voosPrejuizo = aeroporto.verificaPreju();
        for (int i = 0; i < voosPrejuizo.size(); i++) {
            System.out.println(voosPrejuizo.get(i).getNumVoo());
        }
    }
    
}
