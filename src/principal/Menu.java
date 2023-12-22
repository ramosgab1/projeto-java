package principal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import carrinhoDeCompras.Carrinho;
import carrinhoDeCompras.Produto;

public class Menu {

	public static void main(String[] args) {
		// Aceitar input de teclado = Scanner.
		Scanner leia = new Scanner(System.in);

		// Inicialização de variáveis -- para o menu = escolher OPCÃO.

		int opcao = 0, numeroConta, opcaoProduto, opcaoQuadrinhos, opcaoJogos, opcaoColecionaveis;
		int opcaoVestuario, opcaoDecoracao, opcaoTecnologia, numeroContaApagar;
		int numeroContaBuscar;
		boolean voltar = false; 
		String titular;

		// Criando carrinho e produtos;
		Carrinho carrinho = new Carrinho();

		Produto quadrinho1 = new Produto("X-MEN", 29.99);
		Produto quadrinho2 = new Produto("Jessica Jones", 29.99);
		Produto quadrinho3 = new Produto("Homem-Aranha", 29.99);
		Produto jogo1 = new Produto("HADES", 49.99);
		Produto jogo2 = new Produto("HADES 2", 49.99);
		Produto jogo3 = new Produto("Baldur's Gate 3", 229.99);
		Produto colecionavel1 = new Produto("Figma Hatsune Miku", 39.99);
		Produto colecionavel2 = new Produto("Action Figure Batman", 129.99);
		Produto colecionavel3 = new Produto("Action Figure Harley Quinn", 249.99);
		Produto vestuario1 = new Produto("Camiseta", 19.99);
		Produto vestuario2 = new Produto("Casaco", 59.99);
		Produto vestuario3 = new Produto("Meia", 9.99);
		Produto decoracao1 = new Produto("Pôster", 19.99);
		Produto decoracao2 = new Produto("Organizador de livros", 24.99);
		Produto decoracao3 = new Produto("Porta-lápis", 9.99);
		Produto tecnologia1 = new Produto("Lâmpada LED inteligente", 34.99);
		Produto tecnologia2 = new Produto("Óculos Realidade Virtual", 259.99);

		// PARA CRIAR UMA CONTA
		List<Conta> contas = new ArrayList<>();

		// Criação do Menu -- Instrução ao cliente.
		// Utilização do {...} while - executa o menu ao menos 1x.
		do {
			// Try catch para impedir que pegue input de string em número. 
			try {
				
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                         GEEK EMPORIUM                           ");
			System.out.println("             Sua loja online para produtos geek!                 ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("            1 - Produtos e categorias                            ");
			System.out.println("            2 - Carrinho de compras                              ");
			System.out.println("            3 - Criar conta                                      ");
			System.out.println("            4 - Listar todas as contas                           ");
			System.out.println("            5 - Buscar sua conta por número                      ");
			System.out.println("            6 - Apagar conta                                     ");
			System.out.println("            7 - Sair                                             ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                  ENTRE COM A OPÇÃO DESEJADA:                    ");
			opcao = leia.nextInt();
			} catch (InputMismatchException e) {
		        System.out.println("Por favor, insira um número correspondente à opção desejada.");
		        leia.next(); // P/ evitar loop infinito
		        opcao = 0;
		    }

			switch (opcao) {
			case 1: // Produtos e categorias
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                           PRODUTOS                              ");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("1 - QUADRINHOS: HQs de super-heróis, mangás e graphic novels.    ");
				System.out.println("2 - JOGOS: Jogos de tabuleiro, card games e acessórios para jogos.");
				System.out.println("3 - COLECIONÁVEIS: Figuras de ação, estátuas e itens de coleção.");
				System.out.println("4 - VESTUÁRIO: Camisetas, acessórios e moda geek.");
				System.out.println("5 - DECORAÇÃO: Pôsteres, canecas e itens de decoração temáticos.");
				System.out.println("6 - TECNOLOGIA: Acessórios para celular e produtos eletrônicos.");
				System.out.println("7 - Voltar ao MENU PRINCIPAL. ");
				System.out.println("-----------------------------------------------------------------");
				opcaoProduto = leia.nextInt();

				// Nesting Switch-Case para que o produto possa ser selecionado e colocado no
				// carrinho.
				switch (opcaoProduto) {
				case 1:
					System.out.println("Categoria Selecionada: QUADRINHOS.");
					System.out.println("Selecione um produto: ");
					System.out.println("1 - X-MEN. ");
					System.out.println("2 - Jessica Jones. ");
					System.out.println("3 - Homem-Aranha. ");
					System.out.println("4 - Voltar ao MENU PRINCIPAL. ");
					System.out.println("OPÇÃO: ");
					// Try catch para impedir que pegue input de string em número. 
					try {
						opcaoQuadrinhos = leia.nextInt();
					}catch(InputMismatchException e) {
			            System.out.println("Entrada inválida. Por favor, insira um número válido.");
			            leia.next(); // Limpar o buffer do scanner
			            continue;
					}

					// Nesting dnv.
					switch (opcaoQuadrinhos) {
					case 1:
						carrinho.adicionarItem(quadrinho1);
						System.out.println("O quadrinho 'X-MEN' foi adicionado ao seu carrinho!");
						break;
					case 2:
						carrinho.adicionarItem(quadrinho2);
						System.out.println("O quadrinho 'JESSICA JONES' foi adicionado ao seu carrinho!");
						break;
					case 3:
						carrinho.adicionarItem(quadrinho3);
						System.out.println("O quadrinho 'HOMEM-ARANHA' foi adicionado ao seu carrinho!");
						break;
					case 4: 
						voltar = true; 
						if (voltar) {
						    voltar = false;
						    continue; 
					}
					break;
					default:
						System.out.println("Não encontramos essa opção! Tente outra vez!");
						break;
					}

					break;
				case 2:
					System.out.println("Categoria Selecionada: JOGOS.");
					System.out.println("Selecione um produto: ");
					System.out.println("1 - HADES. ");
					System.out.println("2 - HADES 2. ");
					System.out.println("3 - Baldur's Gate 3. ");
					System.out.println("4 - Voltar ao MENU PRINCIPAL. ");
					System.out.println("OPÇÃO: ");
					// Try catch para impedir que pegue input de string em número. 
					try {
						opcaoJogos = leia.nextInt();
					} catch (InputMismatchException e) {
			            System.out.println("Entrada inválida. Por favor, insira um número válido.");
			            leia.next(); // Limpar o buffer do scanner
			            continue;
			            }

					// Nesting switch.
					switch (opcaoJogos) {
					case 1:
						carrinho.adicionarItem(jogo1);
						System.out.println("O jogo 'HADES' foi adicionado ao seu carrinho!");
						break;
					case 2:
						carrinho.adicionarItem(jogo2);
						System.out.println("O jogo 'HADES 2' foi adicionado ao seu carrinho!");
					case 3:
						carrinho.adicionarItem(jogo3);
						System.out.println("O jogo 'Baldur's Gate 3' foi adicionado ao seu carrinho!");
						break;
					case 4: 
						voltar = true; 
						if (voltar) {
						    voltar = false;
						    continue; 
					}
					default:
						System.out.println("Não encontramos essa opção! Tente outra vez!");
						break;
					}
					break;
				case 3:
					System.out.println("Categoria Selecionada: COLECIONÁVEIS.");
					System.out.println("Selecione um produto: ");
					System.out.println("1 - Figma Hatsune Miku ");
					System.out.println("2 - Action Figure Batman ");
					System.out.println("3 - Action Figure Harley Quinn ");
					System.out.println("4 - Voltar ao MENU PRINCIPAL. ");
					System.out.println("OPÇÃO: ");
					// Try catch para impedir que pegue input de string em número. 
					try { 
						opcaoColecionaveis = leia.nextInt();
					}catch(InputMismatchException e) {
			            System.out.println("Entrada inválida. Por favor, insira um número válido.");
			            leia.next(); // Limpar o buffer do scanner
			            continue;
			            }
					
					// Nesting switch.
					switch (opcaoColecionaveis) {
					case 1:
						carrinho.adicionarItem(colecionavel1);
						System.out.println("O colecionável 'FIGMA HATSUNE MIKU' foi adicionado ao seu carrinho!");
						break;
					case 2:
						carrinho.adicionarItem(colecionavel2);
						System.out.println("O colecionável 'ACTION FIGURE BATMAN' foi adicionado ao seu carrinho!");
					case 3:
						carrinho.adicionarItem(colecionavel3);
						System.out
								.println("O colecionável 'ACTION FIGURE HARLEY QUINN' foi adicionado ao seu carrinho!");
						break;
					case 4: 
						voltar = true; 
						if (voltar) {
						    voltar = false;
						    continue; 
					}
					default:
						System.out.println("Não encontramos essa opção! Tente outra vez!");
						break;
					}
					break;
				case 4:
					System.out.println("Categoria Selecionada: VESTUÁRIO.");
					System.out.println("Selecione um produto: ");
					System.out.println("1 - Camisetas ");
					System.out.println("2 - Casacos ");
					System.out.println("3 - Meias ");
					System.out.println("4 - Voltar ao MENU PRINCIPAL. ");
					System.out.println("OPÇÃO: ");
					// Try catch para impedir que pegue input de string em número. 
					try {
						opcaoVestuario = leia.nextInt();
					}catch(InputMismatchException e) {
			            System.out.println("Entrada inválida. Por favor, insira um número válido.");
			            leia.next(); // Limpar o buffer do scanner
			            continue;
			            }
					// Nesting switch.
					switch (opcaoVestuario) {
					case 1:
						carrinho.adicionarItem(vestuario1);
						System.out.println("A peça 'CAMISETA' foi adicionada ao seu carrinho!");
						break;
					case 2:
						carrinho.adicionarItem(vestuario2);
						System.out.println("A peça 'CASACO' foi adicionada ao seu carrinho!");
					case 3:
						carrinho.adicionarItem(vestuario3);
						System.out.println("A peça 'MEIA' foi adicionada ao seu carrinho!");
						break;
					case 4: 
						voltar = true; 
						if (voltar) {
						    voltar = false;
						    continue; 
					}
					default:
						System.out.println("Não encontramos essa opção! Tente outra vez!");
						break;
					}
					break;
				case 5:
					System.out.println("Categoria Selecionada: DECORAÇÃO.");
					System.out.println("Selecione um produto: ");
					System.out.println("1 - Posters. ");
					System.out.println("2 - Organizador de livros. ");
					System.out.println("3 - Porta-lápis. ");
					System.out.println("4 - Voltar ao MENU PRINCIPAL. ");
					System.out.println("OPÇÃO: ");
					// Try catch para impedir que pegue input de string em número. 
					try { 
						opcaoDecoracao = leia.nextInt();
					} catch(InputMismatchException e) {
			            System.out.println("Entrada inválida. Por favor, insira um número válido.");
			            leia.next(); // Limpar o buffer do scanner
			            continue;
					}

					// Nesting switch.
					switch (opcaoDecoracao) {
					case 1:
						carrinho.adicionarItem(decoracao1);
						System.out.println("O item 'POSTER' foi adicionada ao seu carrinho!");
						break;
					case 2:
						carrinho.adicionarItem(decoracao2);
						System.out.println("O item 'ORGANIZADOR DE LIVROS' foi adicionada ao seu carrinho!");
					case 3:
						carrinho.adicionarItem(decoracao3);
						System.out.println("O item 'PORTA-LÁPIS' foi adicionada ao seu carrinho!");
						break;
					case 4: 
						voltar = true; 
						if (voltar) {
						    voltar = false;
						    continue; 
					}
					default:
						System.out.println("Não encontramos essa opção! Tente outra vez!");
						break;
					}
					break;
				case 6:
					System.out.println("Categoria Selecionada: TECNOLOGIA.");
					System.out.println("Selecione um produto: ");
					System.out.println("1 - Lâmpadas LED inteligentes. ");
					System.out.println("2 - Óculos de Realidade Virtual. ");
					System.out.println("3 - Voltar ao MENU PRINCIPAL. ");
					System.out.println("OPÇÃO: ");
					// Try catch para impedir que pegue input de string em número. 
					try {
						opcaoTecnologia = leia.nextInt();
					}catch(InputMismatchException e) {
			            System.out.println("Entrada inválida. Por favor, insira um número válido.");
			            leia.next(); // Limpar o buffer do scanner
			            continue;
					}
					// Nesting switch.
					switch (opcaoTecnologia) {
					case 1:
						carrinho.adicionarItem(tecnologia1);
						System.out.println("O item 'LÂMPADA LED INTELIGENTE' foi adicionada ao seu carrinho!");
						break;
					case 2:
						carrinho.adicionarItem(tecnologia2);
						System.out.println("O item 'ÓCULOS DE REALIDADE VIRTUAL' foi adicionada ao seu carrinho!");
					case 3: 
						voltar = true; 
						if (voltar) {
						    voltar = false;
						    continue; 
					} break;
					case 7: 
						voltar = true; 
						if (voltar) {
						    voltar = false;
						    continue;
				}
						break;
					default:
						System.out.println("Não encontramos essa opção! Tente outra vez!");
						break;
					}

				}

				break;
			case 2: // Carrinho de compras.
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                    CARRINHO DE COMPRAS                          ");
				System.out.println("-----------------------------------------------------------------");
				carrinho.mostrarCarrinho();
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Total: R$" + carrinho.calcularTotal()); // Mostrar o total do carrinho
				// System.out.println(" Aqui vai ter que mostrar os produtos dentro do carrinho
				break;
			case 3: // Criar conta.
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                        CRIAR CONTA                              ");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Digite o número da conta: ");
				// Try catch para impedir que pegue input de string em número. 
				try { 
					numeroConta = leia.nextInt();
				}catch(InputMismatchException e) {
		            System.out.println("Entrada inválida. Por favor, insira números.");
		            leia.next(); // Limpar o buffer do scanner
		            continue;
				}
				// Como faz pra impedir número em lugar de string? Esqueci 
				System.out.println("Digite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				Conta novaConta = new Conta(numeroConta, titular);
				contas.add(novaConta);
				System.out.println(
						"Conta criada com sucesso para " + titular + " (Número da conta: " + numeroConta + ")");
				break;
			case 4: // Listar todas as contas.
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                 LISTAR TODAS AS CONTAS                          ");
				System.out.println("-----------------------------------------------------------------");
				if (contas.isEmpty()) {
					System.out.println("Não há contas cadastradas.");
				} else {
					System.out.println("Lista de contas cadastradas:");
					for (Conta conta : contas) {
						System.out.println("Número: " + conta.getNumero() + ", Titular: " + conta.getTitular());
					}
				}
				break;
			case 5: // Buscar conta por número.
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                 BUSCAR CONTA POR NÚMERO                         ");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Digite o número da conta: ");
				// Try catch para impedir que pegue input de string em número. 
				 try {
					 numeroContaBuscar = leia.nextInt(); //JACQUE E LIZA TBM NÃO VOU MENTIR EU PEDI ARREGO AQUI OK
				 for (Conta conta : contas) { // EU AINDA ME CONFUNDO COM O FOR EACH ME PERDOA
				        if (conta.getNumero() == numeroContaBuscar) { 
				            System.out.println("Conta encontrada:");
				            System.out.println("Número: " + conta.getNumero() + ", Titular: " + conta.getTitular());
				            break;
				        }else { 
	    					    System.out.println("Conta não encontrada.");
				    }
				    }

				break;
				 } catch(InputMismatchException e) {
			            System.out.println("Entrada inválida. Por favor, insira números.");
			            leia.next(); // Limpar o buffer do scanner
			            continue;
				 }
			case 6: // Apagar conta.
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                 APAGAR CONTA                                     ");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("Digite o número da conta que deseja apagar: ");
				numeroContaApagar = leia.nextInt();
			    Iterator<Conta> iterator = contas.iterator(); // Não vou mentir, pedi ajuda pros universitários aqui
			    boolean contaRemovida = false;                // Ainda não sei usar iterator direito (COPIEI). 
			    while (iterator.hasNext()) {
			        Conta conta = iterator.next();
			        if (conta.getNumero() == numeroContaApagar) {
			            iterator.remove();
			            contaRemovida = true;
			            System.out.println("Conta removida com sucesso.");
			            break;
			        }
			    }
			    if (!contaRemovida) {
			        System.out.println("Conta não encontrada.");
			    }
				break;
			}
			
			// DEFAULT TAVA DANDO ERRO ENTÃO VAMO NO QUE DÁÁÁÁÁÁÁÁ PQ NÃO TEM TEMPO DE CORRIGIR!!! 
			
			if (opcao < 1 || opcao > 7) {
			    System.out.println("-----------------------------------------------------------------");
			    System.out.println("             OPÇÃO INVÁLIDA, TENTE OUTRA VEZ!                    ");
			    System.out.println("-----------------------------------------------------------------");
			    continue;
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

			// EU SEI QUE EU FIZ MT NESTING SWITCH MAS EU TENTEI!! ME CRITIQUEM COM CARINHO!!! 

	}
}
}
