
package projetointegradorrpg;

import projetointegradorrpg.ProjetoIntegradorRpg;


public class teste {
    public static void main(String[] args) {
        TestarRemoverVida();
    }
    
    public static void TestarRemoverVida()
    {

        ProjetoIntegradorRpg.removeVida();

        if(ProjetoIntegradorRpg.totVidas == 2)
            System.out.println("Passou");
        else
            System.out.println("Não passou");
    }
}
