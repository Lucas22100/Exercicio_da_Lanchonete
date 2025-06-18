import java.util.Scanner;

public class Exercicio_3 {
    
public static void main(String[] args){

    Scanner input = new Scanner(System.in);

   String nomeCliente;
   
   System.out.println("*** Seja bem-vindo a lanchonete Lucas Games ***");

   System.out.println("*** Digite seu nome: ***");
   nomeCliente = input.nextLine();

   System.out.println("*** Olá, " + nomeCliente + "! O que vai pedir?" + "***");
   int opcao_pedido;
   
   do{
   
   System.out.println("\n*** Menu ***");
   System.out.println("*** Pedido 1: Big Mac ***");
   System.out.println("*** Pedido 2: Double Cheese ***");
   System.out.println("*** Pedido 3: Double Salada ***");
   System.out.println("*** Pedido 4: Cheddar Australiano ***");
   System.out.println("*** Pedido 5: Mc Lanche Feliz ***");
   System.out.println("*** Opção 6: Encerrar ***");

   System.out.print("Digite o número do seu pedido (de 1 a 6): ");
   opcao_pedido = input.nextInt();

   switch (opcao_pedido) {
        case 1:
            System.out.println("Você selecionou: Big Mac");
            break;

        case 2:
            System.out.println("Você selecionou: Double Cheese");
            break;
        
        case 3:
            System.out.println("Você selecionou: Double Salada");
            break;
        
        case 4:
            System.out.println("Você selecionou: Cheddar Australiano");
            break;
        
        case 5:
            System.out.println("Você selecionou: Mc Lanche Feliz");
            break;
        
        case 6:
            System.out.println("Você selecionou: Encerrar o seu pedido, obrigado pela visita, " + nomeCliente + "!");
            break;

        default:
            System.out.println("Você selecionou a opção errada, selecione outra");
            continue;

   }
   if (opcao_pedido >= 1 && opcao_pedido <= 5){
   System.out.print("Avalie o nosso atendimento! De 1 a 5 o quanto você recomendaria? ");
   int notaCliente;
   notaCliente = input.nextInt();
        if (notaCliente == 5) {
            System.out.print("Obrigado!!! Estamos felizes com sua avaliação excelente sobre nosso atendimento!");
        }
        else if (notaCliente == 4){
            System.out.print("Obrigado! Estamos felizes com sua avaliação muito boa sobre nosso atendimento!");
        }
        else if (notaCliente == 3){
            System.out.print("Obrigado! Estamos felizes com sua avaliação boa sobre nosso atendimento!");
        }
        else if (notaCliente == 2){
            System.out.print("Opa, compreendemos sua nota sobre nosso atendimento, buscamos sempre melhorar o nosso empenho!");
        }
        else {
            System.out.print("Desculpa por qualquer possível incomodo com nosso estabelecimento.");
        }
    }
    break;
    } while (true);
    
    input.close();
}
}
