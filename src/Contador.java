import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scaner = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = scaner.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = scaner.nextInt();

        try {

            contar(parametroUm, parametroDois);

        } catch (ParametroInvalidoExeception e) {
            System.out.println("O Primeiro parametro Deve ser menor que o segundo");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoExeception {
        if(parametroUm < parametroDois){
            int contagem = parametroDois - parametroUm;

            for(int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o número " + i);
            }

        }else{
             throw new ParametroInvalidoExeception("O Primeiro parametro Deve ser menor que o segundo");
         }
    }
}
