import java.util.Scanner;

public class App {
  public static void questao01(){
    int indice = 13;
    int soma = 0;
    int k = 0;

    while(k<indice){
      k += 1;
      soma += k;
    }
    System.out.println("Questão 01) O resultado da soma é: "+ soma +"\n\n");
  }

  private static boolean verificaFibonacci(int numero) {
    int a = 0;
    int b = 1;

    while (a <= numero) {
      if (a == numero) {
        return true;
      }
      int next = a + b;
      a = b;
      b = next;
    }

    return false;
  }

  public static void questao02(){
    Scanner entrada = new Scanner(System.in);

    System.out.print("Questão 02) Informe um número para a sequencia de Fibonacci: ");
    int numero = entrada.nextInt();

    if(verificaFibonacci(numero)) {
      System.out.println("O número " + numero + " informado pertence à sequencia de Fibonacci\n\n");
    } else {
      System.out.println("O número " + numero + " informado NÃO pertence à sequencia de Fibonacci\n\n");
    }
  }

  public static void questao05(){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Questão 05) Informe uma string para ser invertida: ");
    String inputString = entrada.nextLine();

    String stringReversa = inverterString(inputString);

    System.out.println("String original: " + inputString);
    System.out.println("\nString com caracteres invertidos: " + stringReversa);

    entrada.close();

  }

  private static String inverterString(String input) {
    char[] chars = input.toCharArray();

    //ponteirios start e end para trocar os caracteres em seus indices
    int start = 0;
    int end = chars.length - 1; //tamanho da string - 1

    while (start < end) {
        //troca os caracteres no start e no end
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;

        //move os ponteiros
        start++;
        end--;
    }

    //retorna uma nova string ja invertida
    return new String(chars);
  }

  public static void main(String[] args) throws Exception {
    questao01();
    questao02();
    questao05();
  }
}
  
