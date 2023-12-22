package principal;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// Aceitar input de teclado = Scanner. 
		Scanner leia = new Scanner(System.in); 
		
		// Inicialização de variáveis -- para o menu = escolher OPCÃO. 
		int opcao=0, numeroConta, opcaoProduto, opcaoQuadrinhos, opcaoJogos, opcaoColecionaveis;
		int opcaoVestuario, opcaoDecoracao, opcaoTecnologia; 
		String titular; 
		
		// Criação do Menu -- Instrução ao cliente. 
		// Utilização do {...} while - executa o menu ao menos 1x. 

		do {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                                                                 ");
			System.out.println("                         GEEK EMPORIUM                           ");
			System.out.println("             Sua loja online para produtos geek!                 ");
			System.out.println("                                                                 ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                                                                 ");
			System.out.println("            1 - Produtos e categorias                            ");
			System.out.println("            2 - Carrinho de compras                              ");
			System.out.println("            3 - Criar conta                                      ");
			System.out.println("            4 - Listar todas as contas                           ");
			System.out.println("            5 - Buscar sua conta por número                      ");
			System.out.println("            6 - Apagar conta                                     ");
			System.out.println("            7 - Sair                                             ");
			System.out.println("                                                                 ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                  ENTRE COM A OPÇÃO DESEJADA:                    ");
			opcao=leia.nextInt();
			
			switch (opcao) { 
			case 1: //Produtos e categorias
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                           PRODUTOS                              ");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("1 - QUADRINHOS: HQs de super-heróis, mangás e graphic novels.    ");
				System.out.println("2 - JOGOS: Jogos de tabuleiro, card games e acessórios para jogos.");
				System.out.println("3 - COLECIONÁVEIS: Figuras de ação, estátuas e itens de coleção.");
				System.out.println("4 - VESTUÁRIO: Camisetas, acessórios e moda geek.");
				System.out.println("5 - DECORAÇÃO: Pôsteres, canecas e itens de decoração temáticos.");
				System.out.println("6 - TECNOLOGIA: Acessórios para celular e produtos eletrônicos.");
				System.out.println("-----------------------------------------------------------------");
				opcaoProduto=leia.nextInt(); 
				
				// Nesting Switch-Case para que o produto possa ser selecionado e colocado no carrinho.
				switch  (opcaoProduto){
				case 1:
				System.out.println("Categoria Selecionada: QUADRINHOS.");
				System.out.println("Selecione um produto: ");
				System.out.println("1 - X-MEN. ");
				System.out.println("2 - Jessica Jones. ");
				System.out.println("3 - Homem-Aranha. ");
				System.out.println("OPÇÃO: ");
				opcaoQuadrinhos=leia.nextInt(); 
			
				break; 
				case 2: 
				System.out.println("Categoria Selecionada: JOGOS.");
				System.out.println("Selecione um produto: ");
				System.out.println("1 - HADES. ");
				System.out.println("2 - HADES 2. ");
				System.out.println("3 - Baldur's Gate 3. ");
				System.out.println("OPÇÃO: ");
				opcaoJogos=leia.nextInt(); 
				break; 
				case 3: 
				System.out.println("Categoria Selecionada: COLECIONÁVEIS.");
				System.out.println("Selecione um produto: ");
				System.out.println("1 - Figma Hatsune Miku ");
				System.out.println("2 - Action Figure Batman ");
				System.out.println("3 - Action Figure Harley Quinn ");
				System.out.println("OPÇÃO: ");
				opcaoColecionaveis=leia.nextInt(); 
				break; 
				case 4:
				System.out.println("Categoria Selecionada: VESTUÁRIO.");
				System.out.println("Selecione um produto: ");
				System.out.println("1 - Camisetas ");
				System.out.println("2 - Casacos ");
				System.out.println("3 - Meias ");
				System.out.println("OPÇÃO: ");
				opcaoVestuario=leia.nextInt(); 
				break; 
				case 5: 
				System.out.println("Categoria Selecionada: DECORAÇÃO.");
				System.out.println("Selecione um produto: ");
				System.out.println("1 - Posters. ");
				System.out.println("2 - Organizador de livros. ");
				System.out.println("3 - Porta-lápis. ");
				System.out.println("OPÇÃO: ");
				opcaoDecoracao=leia.nextInt(); 
				break; 
				case 6: 
				System.out.println("Categoria Selecionada: TECNOLOGIA.");
				System.out.println("Selecione um produto: ");
				System.out.println("1 - Lâmpadas LED inteligentes. ");
				System.out.println("2 - Óculos de Realidade Virtual. ");
				System.out.println("OPÇÃO: ");
				opcaoTecnologia=leia.nextInt(); 
				
				
				}
				
			break;
			case 2: // Carrinho de compras. 
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                    CARRINHO DE COMPRAS                          ");
				System.out.println("-----------------------------------------------------------------");
				// System.out.println(" Aqui vai ter que mostrar os produtos dentro do carrinho - como? ");
			break;
			case 3: // Criar conta. 
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                        CRIAR CONTA                              ");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Digite o número da conta: ");
				numeroConta = leia.nextInt(); 
				System.out.println("Digite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
			break; 
			case 4: // Listar todas as contas. 
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                 LISTAR TODAS AS CONTAS                          ");
				System.out.println("-----------------------------------------------------------------");
			break;
			case 5: // Buscar conta por número.
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                 BUSCAR CONTA POR NÚMERO                         ");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Digite o número da conta: "); 
			break; 
			case 6: // Apagar conta.
			break;
			default:
				System.out.println("-----------------------------------------------------------------");
				System.out.println("             OPÇÃO INVÁLIDA, TENTE OUTRA VEZ!                    ");
				System.out.println("-----------------------------------------------------------------");
			}
			
	} while (opcao != 7);
		
	
		if (opcao == 7) { 
			System.out.println("            OPÇÃO 7 - Sair                                       ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                                                                 ");
			System.out.println("                         GEEK EMPORIUM                           ");
			System.out.println("             Sua loja online para produtos geek!                 ");
			System.out.println("                         Até a próxima!                          ");
			System.out.println("                                                                 ");
			System.out.println("-----------------------------------------------------------------");
			System.exit(0);
		}

}
}
