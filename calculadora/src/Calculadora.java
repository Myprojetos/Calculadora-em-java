import java.util.Scanner;


public class Calculadora {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int op, op1, op2, op3, op4, op5, op6;
        Scanner scanner = new Scanner(System.in);
        
        //chamada do metodo que apresenta o menu de opções
        menu();
        System.out.println("------- Digite a operação desejada -------");
        op = scanner.nextInt();

        switch (op) {

            case 1:
                do {
                    System.out.println("=================================================");
                    System.out.println("-------------------- TABUADA -------------------");
                    System.out.println("=================================================");
                    System.out.println("__________________________________________________");
                    System.out.println(".");
                    System.out.println("Digite o numero da tabuada:");
                    int n = scanner.nextInt();

                    // chamada do metodo que calcula a tabuada:
                    tabuada(n);
                    System.out.println("__________________________________________________");
                    System.out.println(".");
                    System.out.println("1 - Novo calculo");
                    System.out.println("2- Voltar ao menu");
                    System.out.println(".");
                    System.out.println("Digite a opção desejada: ");
                    op1 = scanner.nextInt();
                } while (op1 == 1);
                break;
            
            case 2:
                do{
                    System.out.println("=================================================");
                    System.out.println("-------------------- MULTIPLICAÇÃO -------------------");
                    System.out.println("=================================================");
                    System.out.println("__________________________________________________");
                    System.out.println(".");
                    System.out.println("Digite um numero:");
                    int num1 = scanner.nextInt();
                    System.out.println("Digite outro numero:");
                    int num2 = scanner.nextInt();
                    double resultado = 0;
                    // chamada do metodo que calcula multiplicação:
                    multiplicação(num1, num2, resultado);
                    System.out.println("__________________________________________________");
                    System.out.println(".");
                    System.out.println("1 - Novo calculo");
                    System.out.println("2- Voltar ao menu");
                    System.out.println(".");
                    System.out.println("Digite a opção desejada: ");
                    op2 = scanner.nextInt();
                } while (op2 == 1);
                break;

            case 3:
                do{
                    System.out.println("=================================================");
                    System.out.println("-------------------- DIVISÃO -------------------");
                    System.out.println("=================================================");
                    System.out.println("__________________________________________________");
                    System.out.println(".");
                    System.out.print("Digite o dividendo: ");
                    double dividendo = scanner.nextDouble();
                    System.out.print("Digite o divisor: ");
                    double divisor = scanner.nextDouble();
                    double resultado = 0; 
                    // chamada do metodo que calcula multiplicação:
                    divisão(dividendo, divisor, resultado);
                    System.out.println("__________________________________________________");
                    System.out.println(".");
                    System.out.println("1 - Novo calculo");
                    System.out.println("2- Voltar ao menu");
                    System.out.println(".");
                    System.out.println("Digite a opção desejada: ");
                    op3= scanner.nextInt();
                } while (op3 == 1);
                break;

            case 4:
                do{
                    System.out.println("=================================================");
                    System.out.println("-------------------- SUBTRAÇÃO -------------------");
                    System.out.println("=================================================");
                    System.out.println("__________________________________________________");
                    System.out.println(".");
                    System.out.println("Digite um numero:");
                    int num1 = scanner.nextInt();
                    System.out.println("Digite outro numero:");
                    int num2 = scanner.nextInt();
                    double resultado = 0;
                    // chamada do metodo que calcula subtração:
                    subtração(num1, num2, resultado);
                    System.out.println("__________________________________________________");
                    System.out.println(".");
                    System.out.println("1 - Novo calculo");
                    System.out.println("2- Voltar ao menu");
                    System.out.println(".");
                    System.out.println("Digite a opção desejada: ");
                    op4 = scanner.nextInt();
                } while (op4 == 1);
                break;
            default:
                break;
        }
    }

    public static void menu() {
        System.out.println("=================================================");
        System.out.println("----------------- CALCULADORA -------------------");
        System.out.println("=================================================");
        System.out.println(".");
        System.out.println("__________________________________________________");
        System.out.println(".");
        System.out.println("1 - Tabuada");
        System.out.println("2 - Multiplicação");
        System.out.println("3 - Divisão");
        System.out.println("4 - Subtração");
        System.out.println("5 - Adição");
        System.out.println(".");

    }

    //metodo que faz o calcula tabuada
    public static void tabuada(int n) {

        System.out.println("A tabuada de " + n + " é:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + " = " + (n * i));
        }

    }

    //metodo que faz o calculo de MULTIPLICAÇÃO
    public static void multiplicação(int num1, int num2, double resultado) {
        resultado = num1 * num2;
        System.out.println("O resultado é: ");
        System.out.println(".");
        System.out.println(num1 + " X " + num2 + " = " + resultado);
        System.out.println(".");
        
        
    }

    //metodo que faz o calculo de subtração
    public static void subtração(int num1, int num2, double resultado) {
        resultado = num1 - num2;
        System.out.println("O resultado é: ");
        System.out.println(".");
        System.out.println(num1 + " - " + num2 + " = " + resultado);
        System.out.println(".");
    }

    //metodo que faz o calculo de adição
    public static void adição(int num1, int num2, double resultado) {
        resultado = num1 + num2;
        System.out.println("O resultado é: ");
        System.out.println(".");
        System.out.println(num1 + " + " + num2 + " = " + resultado);
        System.out.println(".");
        
    }

    //metodo que faz o calculo de divisão
    public static void divisão(double divisor, double dividendo, double resultado) {
        if (divisor != 0) {
            resultado = dividendo / divisor;
            System.out.println("Resultado da divisão:" + dividendo + "/" + divisor + " = " + resultado);
        } else {
            System.out.println("Erro: Divisão por zero.");
        }

    }

}
