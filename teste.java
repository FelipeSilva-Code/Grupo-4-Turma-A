
package projetointegradorrpg;

import projetointegradorrpg.ProjetoIntegradorRpg;


public class teste {
    public static void main(String[] args) {
        TestarRemoverVida();
    }
    
    //ESSE TESTE REMOVE UMA VIDA DO PERSONAGEM E VERIFICA SE A VIDA REALMENTE ABAIXOU (DEVE TER IDO PARA 2)
    public static void TestarRemoverVida()
    {
        ProjetoIntegradorRpg.removeVida();

        int valorEsperado = 2;

        if(ProjetoIntegradorRpg.totVidas == valorEsperado)
            System.out.println("Passou no teste!");
        else
            System.out.println("Não passou no teste!");
    }
}
