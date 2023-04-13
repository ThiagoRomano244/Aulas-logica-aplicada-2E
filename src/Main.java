public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // laço enquanto - while
        int contador = 0;
        while(contador<10){
            System.out.println("Contador = " + contador);
            contador = contador + 1 ;
        }
        //laço do para faça - for
        for(int x = 0; x< 10; x++) {
            System.out.println("Contador =" + x);
        }
        int cont = 1;
        do {
            //processo

            System.out.println(cont);
            cont++;
        }while(cont <= 10);

        }
    }
}