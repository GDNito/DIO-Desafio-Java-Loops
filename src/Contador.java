import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException exception) {
            System.out.println("ERRO: O primeiro parâmetro não pode ser maior que o segundo parâmetro");
        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if(parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        System.out.print("Foram ");
        for (int i = 0; i <= contagem; i++){

            System.out.print(i + " ");
        }
        System.out.println("interações");
    }
}