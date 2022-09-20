
package manipulanumeros;


class Carro {

    static void calculaValorFinal() {
        int custoFabrica;
        float impostos = (float) 0.45;
        float percDist = (float) 0.28;
        System.out.println("Insira o custo de fábrica do carro.");
        custoFabrica = ManipulaNumeros.ler.nextInt();
        System.out.println("Custo para consumidor: "+(custoFabrica*(1+percDist+impostos)));
    }
    
}
