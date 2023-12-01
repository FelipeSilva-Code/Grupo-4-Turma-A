package projetointegradorrpg;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class ProjetoIntegradorRpg {

    public static String nome;
    public static int totVidas = 3;
    
    public static void main(String[] args) throws Exception {
       
        menu();

        pulaLinha();
        
        exibeTexto("Lakaka: Seja bem-vindo meu companheiro (a), eu sou o Lakaka. Para começarmos nossa aventura, precisamos que se apresente, me diga qual o seu nome");
        nome = usuarioDigita();
        
        exibeCapitulo("Capitulo 1 - O Inicio");

        exibeTexto("Lakaka: Para começar, precisamos falar um pouco sobre o meu avô, uma figura misteriosa que contava histórias incríveis. A família desacreditava nas aventuras do vovô, considerando-as desculpas para sua ausência." );
        exibeTexto("Hoje pela manhã minha mãe me deu a notícia de que meu avô estava gravemente doente, então corri para vê-lo. Em um momento privado, ele me revelou que as histórias eram reais e que havia um presente guardado, o qual era a chave para uma nova aventura. Na qual eu conheceria alguns de seus antigos companheiros de navegação");
        exibeTexto("Ele me instruiu a buscar o presente, usar seu barco e seguir um mapa para descobrir o legado de suas histórias. O vovô expressou seu amor e confiança em mim, pedindo desculpas por sua ausência e garantindo que as aventuras agora seriam minhas");
        exibeTexto("Apesar de abalado, mantive a fé e corri para casa em busca do presente mencionado. Ao encontrá-lo, notei que estava um pouco empoeirado e havia um cadeado, que só seria aberto com a combinação correta. Sobre a caixa tem um papel colado com os seguintes números e letras E4F6");
        
        exibeDesafio("Me parece um número em haxadecimal " + nome +  ". Converta E4F6 para decimal e vamos tentar colocar o resultado no cadeado", "58614");
        
        exibeTexto("Lakaka: Parabéns " + nome + " era isso mesmo. Vamos abrir e ver o que tem aqui. Hmm tem uma carta, um mapa e uma bússola. Vamos dar uma olhada no que está escrito na carta");

        String[] carta = {
            " ____________________________________________",
            "/                                             \\",
            "|   Ola, meu querido neto                      |",
            "|   Chegou o momento de voce iniciar suas      |",
            "|   proprias aventuras                         |",
            "|                                              |",
            "|   Para isso, va ate seguinte local           |",
            "|   8,3405 S; 115,0920 E                       |",
            "|                                              |",
            "|    Ass: Vovo                                 |",
            "\\                                             /",
            " --------------------------------------------",
 
        };  
        
        exibeCarta(carta);
                      
        exibeTexto("Lakaka: Parece que o vovô montou uma aventura para nós. Vamos dar uma olhada no mapa e ver para onde essas coordenadas nos levam");
        exibeTexto("De acordo com o mapa essas coordenadas nos levam até a ilha de Bali. Pegue apenas os itens essenciais enquanto eu preparo o barco. Parece que temos uma aventura para iniciar");

        exibeCapitulo("Capitulo 2 - A ilha de Bali");

        exibeTexto("Lakaka: Acorda " + nome +  ", chegamos na ilha de Bali. Venha, me ajude a deixar o barco em terra firme");
        exibeTexto("Guardião da Soma: Olha se não é o famoso Lakaka. Eu ja espero a sua chegada a um tempo.");  
        exibeTexto("Lakaka: Quem é você e como você sabe meu nome?");
        exibeTexto("Guardião da Soma: Hmmm podemos dizer que eu sou um velho conhecido de seu avo. Ele me incubiu da missao de lhe entregar uma carta, mas primeiro você precisa decifar um código");
        exibeDesafio("É necessário que vocês transformem os números 3F e A7 de hexadecimal para decimal, e depois realize a soma entre eles", "230");
        
        exibeTexto("Guardião da Soma: Vocês conseguiram! Minha missão aqui acabou. Pegue essa carta que seu avô pediu para lhe entregar");
        
        String[] carta2 = {
            " ____________________________________________",
            "/                                             \\",
            "|   Boa, Lakaka                                |",
            "|   Parece que voce conseguiu passar pelo      |",
            "|   guadiao. Nunca duvidei da sua capacidade.  |",
            "|                                              |",
            "|   Tenho mais um desafio para voce.           |",
            "|   7,6145 S; 110,7126 E                       |",
            "|                                              |",
            "|    Ass: Vovo                                 |",
            "\\                                             /",
            " --------------------------------------------",
 
        };  
        
        exibeCarta(carta2);
        
        exibeTexto("Lakaka: Pelo jeito temos mais um lugar para ir " + nome + ". De acordo com o mapa, essas coordenadas deixadas pelo vovô apontam para a Ilha de Java.");
        exibeTexto("Se apresse. Podemos chegar lá antes de anoitecer");
        
        exibeCapitulo("Capitulo 3 - A ilha de Java");
        
        exibeTexto("Lakaka: Finalmente chegamos, mas parece que alguem já está nos esperando novamente");
        exibeTexto("Sombra da Subtração: Bem vindo Lakaka. Aguardava ansiosamente vossa chegada. Eu sou a Sombra da Subtração, e fui encarregado de lhes passar um desafio.");
        exibeDesafio("Se acertarem com êxito, tenho algo para lhes entregar. Mas primeiro, vocês precisam deixar os números hexadecimais F7 e B4 em decimal e, em seguida, realize a subtração entre eles.", "67");
        exibeTexto("Sombra da Subtração:Excelente trabalho! Vocês foram dignos do desafio. Aqui está o artefato prometido e que vossas próximas jornadas sejam tão desafiadoras quanto esta. Boa sorte!");
        exibeTexto("Lakaka: Venha " + nome + " vamos dar uma olhada no que tem na carta." );

        String[] carta3 = {
            " ____________________________________________",
            "/                                             \\",
            "|   Parabens, Lakaka. Voce esta indo bem       |",
            "|   Vejo que se saiu muito bem com o desafio   |",
            "|   do Sombra.                                 |",
            "|                                              |",
            "|   Pegue suas coisas e parta novamente.       |",
            "|   0,7893 N; 102,2526 E                       |",
            "|                                              |",
            "|    Ass: Vovo                                 |",
            "\\                                             /",
            " --------------------------------------------",
 
        };  
        
        exibeCarta(carta3);
        exibeTexto("Lakaka: O vovô nos passou mais um desafio. Pegue o mapa pra mim, por favor");
        exibeTexto("Hmmmm parece que agora nosso destino é a ilha de Sumatra. Se ajeite que ja iremos partir para o proximo desafio");
        
        exibeCapitulo("Capitulo 4 - Sumatra");

        exibeTexto("Lakaka: Finalmente. Depois de um dia no barco chegamos em Sumatra.");
        exibeTexto("Caçador da Multiplicação: Até que enfim vocês chegaram. Não aguentava mais esperar por voces.");   
        exibeTexto("Lakaka: Deixa eu advinhar. Você é um amigo do vovô que quer me passar um desafio");
        exibeTexto("Caçador da Multiplicação: Muito bem, parece que já estão cientes de como isso vai funcionar.");                                                                                                                                                                                                                                             
        exibeDesafio("Então vamos direto ao ponto. Converta os números 2F e A para decimal, e depois realize a multiplicação entre eles", "470");
        exibeTexto("Caçador da Multiplicação: Resposta correta. Tome esse pergaminho deixado por seu avô");   

        String[] carta4 = {
            " ____________________________________________",
            "/                                             \\",
            "|   Muito bem, meu rapaz.                      |",
            "|   Voce resolveu o enigma do Caçador.         |",
            "|   Nunca duvidei da sua capacidade.           |",
            "|                                              |",
            "|   Tenho mais um desafio para voce.           |",
            "|   2,8256 N; 114,1577 E                       |",
            "|                                              |",
            "|    Ass: Vovo                                 |",
            "\\                                             /",
            " --------------------------------------------",
 
        };  
        
        exibeCarta(carta4);

        exibeCapitulo("Capitulo 5 - O desafio final");

        exibeTexto("Lakaka: Chegamos em Bornéu e parece que mais um amigo do vovô esta no esperando.");
        exibeTexto("Fantasma da Divisão: Sejam bem vindos meus convidados. Vocês chegaram ao desafio final. Se responderem corretamente o meu desafio, lhes darei esse baú que pertence ao seu avô. Nele vocês encontrarão tudo o que é necessário para a próxima aventura.");     
        exibeDesafio("Mas para isso, transforme os números A5 e B para decimal e depois realize a divisão entre eles", "15");
        exibeTexto("Fantasma da Divisão: Muito bem. Voces acertaram. Aqui está o baú de seu avô");
        
        exibeTexto("Lakaka: Vamos abrir o baú " + nome + ". " );
        exibeTexto("Tem muitas coisas aqui dentro. Mas olha, mais uma carta deixada pelo vovô. Vamos ver o que tem nela");
        String[] carta5 = {
            " _________________________________________________",
            "/                                                   \\",
            "|   Parabens, Lakaka. Você conseguiu.               |",
            "|   Estou muito orgulhoso de você                   |",
            "|                                                   |",
            "|   Nesse bau contem todas as informacoes que       |",
            "|   reuni durante os ultimos 20 anos sobre o        |",
            "|   Grande Tesouro. Ninguem foi capaz de econtra-lo |",
            "|   Nem mesmo eu e meus amigos. Mas eu acredito     |",
            "|   que voce ira conseguir.                         |",
            "|                                                   |",
            "|   Chegou sua vez de escrever sua propria aventura |",
            "|                                                   |",
            "|   Ass: Vovo                                       |",
            "\\                                                  /",
            " -------------------------------------------------",
 
        };  
        
        exibeCarta(carta5);

        exibeTexto("Lakaka: Muito bem, " + nome + ". Nós conseguimos. Chegou a hora de trilharmos nosso próprio caminho.");
        exibeTexto("Vamos em busca de encontrar o Grande Tesouro, mas isso vai ficar para o próximo semestre.");
    }
    

    public static void menu() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        
        boolean isContinuarJogo = false;
        do {
            exibeTexto("******* MENU *******");
            exibeTexto("Seja bem vindo abordo nessa viagem. Escolha abaixo qual opção deseja realizar");
            exibeTexto("1 - Instruções");
            exibeTexto("2 - Jogar");
            exibeTexto("3 - Créditos");
            exibeTexto("4 - Sair");
            System.out.print("Digite: ");
            int n = scanner.nextInt();
        
            switch (n) {
                case 1:
                    exibirInstrucoes();
                    break;
                case 2:
                    isContinuarJogo = true;
                    break;
                case 3:
                    exibirCriadores(); 
                    break;
                case 4:
                    encerrarPrograma(); 
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (!isContinuarJogo); 
    }

    public static void exibirInstrucoes() throws Exception
    {
        exibeTexto("Esse é o jogo Temple Of Number's. Nele você vai acompanhar o Lakaka, um jovem destemido em uma aventura pelos mares.");
    }

    public static void exibirCriadores() throws Exception
    {
        exibeTexto("Os criadores do jogo Temple Of Number's são:");
        exibeTexto("Deivid Duarte");
        exibeTexto("Diego de Souza");
        exibeTexto("Felipe Conceicao");
        exibeTexto("Nicolas Passos");
    }

    public static void encerrarPrograma()
    {
        System.out.println("Saindo.....");
        System.exit(0);
    }


    public static void exibeTexto(String mensagem) throws InterruptedException
    {   
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;

        for (char caractere : mensagem.toCharArray()) {
            System.out.print(caractere);
            timeUnit.sleep(05);
        }
        
        System.out.println("");
    }

    public static void exibeCapitulo(String texto)
    {   
        pulaLinha();
        System.out.println("******* " + texto + " *******");
        pulaLinha();
    }
    
     public static void exibeCarta(String[] carta)
    {
        pulaLinha();
        
        for (String linha : carta) {
            System.out.println(linha);
        }
        
        pulaLinha();   
    }
    
    public static void pulaLinha()
    {
        System.out.println("");
    }

    public static String usuarioDigita()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite: ");
        String texto = scanner.next();
        return texto;
    }
    
    public static void exibeDesafio(String desafio, String respostaCorreta)
    {    
        System.out.println(desafio);
        boolean respostaDesafio = false;
        
        do {
            
            String respostaUsuario = usuarioDigita();
            
            if(respostaCorreta.equalsIgnoreCase(respostaUsuario))
            {
                respostaDesafio = true;
                pulaLinha();
            }
            else
            {
               pulaLinha();
               removeVida(); 
            }
           
        } while (!respostaDesafio);

    }

    public static void removeVida()
    {
        totVidas--;
        
        if(totVidas == 0)
        {
            System.out.println("A jornada foi longa " + nome + ", mas infelizmente chegou ao final. Espero te encontrar novamente em outra aventura");
            System.out.println("******GAME OVER******");
            encerrarPrograma();
        }
        else if(totVidas == 1)
        {
            System.out.println("Resposta errada, " + nome +". Cuidado você possui apenas mais uma tentativa");
        }
        else if(totVidas == 2)
        {
            System.out.println("Resposta errada, " + nome  +". Você ainda possui mais duas tentativas");
        }
    }
}