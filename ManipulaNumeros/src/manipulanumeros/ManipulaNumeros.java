
package manipulanumeros;

import java.util.Scanner;

public class ManipulaNumeros {

    public static Scanner ler = new Scanner(System.in);
    public static int x, y;
    public static void main(String[] args) {
        
        int op;
        do{
            System.out.println("Menu de Operação com números");
            System.out.println("1 - Maior de 2 números");
            System.out.println("2 - Ordenar valores em decrescente");
            System.out.println("3 - Soma impares multiplica pares");                    
            System.out.println("4 - Trocar números");
            System.out.println("5 - Compara números");
            System.out.println("6 - Calcular média alunos");
            System.out.println("7 - Calcular custo de carro");
            System.out.println("0 - Sair");
            System.out.println("Selecione a opção pretendida");
            op = ler.nextInt();
            switch(op){
                case 0: break;
                case 1:
                    leValores("Insira um valor","Insira outro valor");
                    MaiorNumero.maior2(x,y);
                    break;
                case 2:
                    do{
                        le1Valor("Insira um valor");
                    }while (x<=0);
                    NumeroDecrescente.ordenaDecrescente(x); 
                    break;
                case 3:
                    somaImparesMultiplicaPares();
                    break;
                case 4:
                    TrocaNumero.inverteNumero();
                    break;
                case 5:
                    leValores("Insira um valor","Insira outro valor");
                    ComparaNumero.comparar2Valores(x,y);
                    break;
                case 6:
                    MediaAluno.registaNotas();                    
                    break;
                case 7:
                    Carro.calculaValorFinal();
                    break;
                default: System.out.println("Insira uma opção válida");
            }
        }while (op!=0);
    }

    public static void leValores(String s1, String s2) {
        System.out.println(s1);
        x = ler.nextInt();
        System.out.println(s2);
        y = ler.nextInt();
    }

    private static void le1Valor(String s1) {
        System.out.println(s1);
        x = ler.nextInt();
    }

    private static void somaImparesMultiplicaPares() {
        int somaImpares;
        long multiPares;
        somaImpares = 0;
        multiPares = 1;
        for (int i=1; i<=30; i++){
            if (i%2!=0)
                somaImpares += i;
            else
                multiPares *= i; 
        }
        System.out.println("Soma dos nº ímpares: "+somaImpares);
        System.out.println("Multiplicação dos nº pares: "+multiPares);
                
    }
    
}
