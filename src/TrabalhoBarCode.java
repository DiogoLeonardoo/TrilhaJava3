// Diogo Leonardo Lima e Silva 
// Análise e Desenvolvimento de Sistemas - Lógica de Programação / IFS 


import java.util.Scanner;

public class TrabalhoBarCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Variável para armazenar a opção do usuário.
        int choice = 0;
        
        //Estrutura de repetição para exibir o menu e receber a opção do usuário. 
        while (choice != 3) {
            displayMenu();
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    validateCode();
                    break;

                case 2:
                    identifyCountry();
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            //Pulando uma linha para melhorar a visualização.
            System.out.println();
        }
            //Fechando o scanner.
            scanner.close();
    }
            //Método para exibir o menu.
            public static void displayMenu() {
        System.out.println("==========Menu==========");
        System.out.println("1) Validar código");
        System.out.println("2) Identificar país");
        System.out.println("3) Sair");
        System.out.println("========================");
        System.out.print("Escolha uma opção: ");
        
    }

            //Método para validar o código. (Quantidade de dígitos e se é válido ou não).
            public static void validateCode() {
            Scanner scanner = new Scanner(System.in);
       
            System.out.println("Opção 1 selecionada - Validar código");
            System.out.println("Digite o código de barras (GTIN-13): ");
            String barcode = scanner.next();

            if(barcode.length() != 13) {
                System.out.println("Código inválido. O código deve conter 13 dígitos.");
            } else {
                //Chamando o método para validar o código.
                boolean isValid = validateBarcode(barcode);
                if (isValid) {
                    System.out.println("O código de barras é válido.");
                } else {
                    System.out.println("O código de barras é inválido.");
                }
            }

        }
            
            //Método para validar o código de barras. Seguindo o padrão GTIN-13
            public static boolean validateBarcode(String barcode) {
                int soma = 0;
                //Percorrer os 12 primeiros dígitos do código.
                for (int i = 0; i < 12; i++) {
                    int digit = Character.getNumericValue(barcode.charAt(i));
                    //Se o dígito for par, multiplica por 3, se não, mantém o valor.
                    soma += (i % 2 == 0) ? digit : digit * 3;
                }
                //Pegando o último dígito do código.
                int checkDigit = Character.getNumericValue(barcode.charAt(12));
                //Verificando se o dígito é válido.
                return (soma + checkDigit) % 10 == 0;
            }
    
            //Método para identificar o país.
            public static void identifyCountry() {
                System.out.println("Opção 2 selecionada - Identificar país");
                System.out.println("Digite o código de barras (GTIN-13): ");
                Scanner scanner = new Scanner(System.in);
                String barcode = scanner.next();

                //Verificando se o código tem 13 dígitos.
                if (barcode.length() != 13) {
                    System.out.println("Código inválido. O código deve conter 13 dígitos.");
                    return;
                }
                
                //Pegando os 3 primeiros dígitos do código.
                String countryCode = barcode.substring(0, 3);
                
                //Verificando o país.
                switch (countryCode) {
                    case "789":
                        System.out.println("O código de barras é do Brasil.");
                        break;
                    case "790":
                        System.out.println("O código de barras é do Brasil.");
                        break;
                    case "779":
                        System.out.println("O código de barras é da Argentina.");
                        break;
                    case "773":
                        System.out.println("O código de barras é do Uruguai.");
                        break;
                    case "780":
                        System.out.println("O código de barras é do Chile.");
                        break;
                    case "784":
                        System.out.println("O código de barras é do Paraguai.");
                        break;
                    case "786":
                        System.out.println("O código de barras é do Equador.");
                        break;
                    case "770":
                        System.out.println("O código de barras é da Colômbia.");
                        break;
                    case "743":
                        System.out.println("O código de barras é da Nicarágua.");
                        break;
                    case "600":
                        System.out.println("O código de barras é da África do Sul.");
                        break;
                    case "601":
                        System.out.println("O código de barras é da África do Sul.");
                        break;
                    default:
                        System.out.println("O código de barras não é de região alguma.");
                        break;
                }

                }
            }