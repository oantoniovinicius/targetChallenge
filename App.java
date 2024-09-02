package targetDesafio.src;

import java.util.Scanner;

public class targetDesafio {
    public static void questao03(){
    int indice = 12;
    int soma = 0;
    int k = 1;

    while(k < indice){
      k += 1;
      soma += k;
    }
    System.out.println(soma);
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

  public static void questao01(){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe um número para a sequencia de Fibonacci:");
    int numero = entrada.nextInt();

    if(verificaFibonacci(numero)) {
      System.out.println("O número " + numero + " informado pertence à sequencia de Fibonacci");
    } else {
      System.out.println("O número " + numero + " informado NÃO pertence à sequencia de Fibonacci");
    }

    entrada.close();
  }

  public static void questao02(){
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe uma string:");
    String texto = entrada.nextLine();

    int count = 0;
    for (char c : texto.toCharArray()) {
        if (c == 'a' || c == 'A') {
            count++;
        }
    }

    if (count > 0) {
        System.out.println("A letra 'a' aparece " + count + " vezes na string.");
    } else {
        System.out.println("A letra 'a' não foi encontrada na string.");
    }

    entrada.close();
}
  public static void main(String[] args) throws Exception {
    questao01();
    //questao02();
    //questao03();
  }
}
  
