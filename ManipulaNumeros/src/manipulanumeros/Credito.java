
package manipulanumeros;


class Credito {

    static void calculaCredito() {
        int saldoMedio;
        System.out.println("Insira saldo médio anual.");
        saldoMedio = ManipulaNumeros.ler.nextInt();
        System.out.println(saldoMedio/201);
        switch (saldoMedio/201){
            case 0:
                System.out.println("\nSaldo médio "+saldoMedio+"\nNão tem direito a crédito\n");
                break;
            case 1:
                System.out.println("\nSaldo médio "+saldoMedio+"\nTem crédito de "+(saldoMedio*0.2)+"\n");
                break;
            case 2:
                System.out.println("\nSaldo médio "+saldoMedio+"\nTem crédito de "+(saldoMedio*0.3)+"\n");
                break;
            default: 
                System.out.println("\nSaldo médio "+saldoMedio+"\nTem crédito de "+(saldoMedio*0.4)+"\n"); 
            }
    }
    
}
