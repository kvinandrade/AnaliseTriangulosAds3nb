// Primeiramente, importei as classes. Scanner para capturar as entradas do usuário,
// e Arrays para manipular os lados do triângulo 3, 4 5.
// Criei um loop infinito para que o menú continue aparecendo
// até que o usuário decida sair. Esse menú mostra as três opções
// e lê a entrada do usuário.


import java.util.Scanner;
import java.util.Arrays;

public class TrianguloController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu - Análise de Triângulos:");
            System.out.println("1 - Verificar se é um triângulo retângulo");
            System.out.println("2 - Verificar se é um triângulo '3, 4, 5'");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    verificarTrianguloRetangulo(scanner);
                    break;
                case 2:
                    verificarTipo345(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

// Adicionei um método para identificação do triângulo retângulo, capturando os três
//  lados do triângulo, e usei a fórmula do teorema de Pitágoras para o programa
//  calcular se as entradas que o usuário digitar corresponderão ou não ao triângulo retângulo.


    public static void verificarTrianguloRetangulo(Scanner scanner) {
        System.out.println("\nInforme os três lados do triângulo (separados por espaço):");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            System.out.println("É um triângulo retângulo!");
        } else {
            System.out.println("Não é um triângulo retângulo.");
        }
    }

// Aqui, adicionei um método para verificação do triângulo '3, 4, 5',
//  com criação do Array para armazenar os 3 lados.

    public static void verificarTipo345(Scanner scanner) {
        System.out.println("\nInforme os três lados do triângulo (separados por espaço):");

        double [] lados = new double[3];
        lados[0] = scanner.nextDouble();
        lados[1] = scanner.nextDouble();
        lados[2] = scanner.nextDouble();

        Arrays.sort(lados);

        if (Arrays.equals(lados, new double[]{3.0, 4.0, 5.0})) {
            System.out.println("É um triângulo '3, 4, 5'!");
        } else {
            System.out.println("Não é um triângulo '3, 4, 5'!");
        }
    }
}

// Testei várias vezes, fiz alguma modificações e melhorias, e o programa rodou perfeitamente! 

// PS: Eu estava na turma ADS3NC e pedi tranferência para a ADS3NB.
// Se meu nome não estiver na chamada, é por causa disso.
// Ademais, tive que usar o chat GPT para --> aprender <-- a fazer algumas coisas. Não copiei; pedi para ele me explicar
// o passo a passo. Essa foi a minha única opção, uma vez que não aprendi absolutamente nada em suas aulas. Isso porque,
// nas vezes em que eu mencionei que você estava indo muito rápido e que  eu não estava conseguindo acompanhar,
// você simplesmente ignorou, em tom de sarcasmo, respondeu: "É mesmo? que merda!". Portanto, se você identificar algo
// diferente do que foi ensinado em sala, peço que leve em consideração que
// as minhas dúvidas em sala de aula não foram sanadas por você. 
// **Não tenho o restante do projeto de geometria, quando mudei de turma, essa já estava a frente no conteúdo. 
