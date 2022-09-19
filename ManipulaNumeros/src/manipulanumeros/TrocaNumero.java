
package manipulanumeros;


class TrocaNumero {

    static void inverteNumero() {
        ManipulaNumeros m = new ManipulaNumeros();
        m.leValores("Insira um valor","Insira outro valor");
        int z;
        z = m.x;
        m.x = m.y;
        m.y = z;
        System.out.println("Os valores inseridos foram "+m.x+" e"+m.y);
    }
    
}
