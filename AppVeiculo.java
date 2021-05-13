import java.util.Scanner;
/**
 * AppVeiculo
 */
public class AppVeiculo {

        public static void main(String[]args) {
            GerenciarVeiculo veiculo = new GerenciarVeiculo();
            Scanner teclado = new Scanner(System.in);
            int menu;
            String automoveis;
            String marca, modelo;
     
            do {
                System.out.println("1-Adiciona Veiculo");
                System.out.println("2-Remove Veiculo");
                System.out.println("3-Buscar Placa");
                System.out.println("4-Listar Veiculo");
                System.out.println("5-Valor Imposto");
                System.out.println("6-Veiculo por combustivel");
                menu = Integer.parseInt(teclado.nextLine());
     
                switch (menu) {
                    case 1:
                    System.out.println("Informe o Modelo:");
                    modelo = teclado.nextLine();
                    System.out.println("Informe a marca:");
                    marca = teclado.nextLine();
                    veiculo.novoVeiculo(modelo, marca);

                    break;
                    
                    case 2:
                    System.out.println(veiculo.exibirTodos());
                    System.out.println("Digite a placa do veiculo que será retirado:");
                    veiculo = teclado.nextLine();
                    System.out.println();
                    veiculo.retirarPlaca();

                    break;

                    case 3:
                    System.out.println("Digite a placa do veiculo");
                    System.out.println(placa.listaPlaca());

                    break;

                    case 4:
                    System.out.println(veiculo.exibirTodos);
                    break;

                    case 5:
                    System.out.println(calcularImposto);

                    break;
                    
                    case 6:
                    System.out.println();


                    default:
                        break;
                }
            }
          while (menu !=5);
         teclado.close();
     }
    
}