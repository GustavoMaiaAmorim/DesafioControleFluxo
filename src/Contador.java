import java.util.Scanner;

public class Contador{

	public static void main(String[] args) {

		Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
        System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
        //chamando o método contendo a lógica de contagem
		try {
			contar(parametroUm, parametroDois);
		
		}catch (Exception e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!" + e.getMessage());
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}	
	}

        
    static void contar(int parametroUm, int parametroDois){
        // Validar se parametro Um é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            System.out.println("O parâmetro um não pode ser maior que o parâmetro dois.");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Contador: " + i);
        }
         // Realizar o for para imprimir os números com base na variável contagem
    }
}
       
