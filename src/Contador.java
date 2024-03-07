import java.util.Scanner;

public class Contador {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

		
        Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();

		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();
		
		try {

		    //chamando o método contendo a lógica de contagem

			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
            
            System.out.println(e.getMessage());

			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;

        for(int i = 1; i <= contagem; i++);

		//realizar o for para imprimir os números com base na variável contagem
	}
}


