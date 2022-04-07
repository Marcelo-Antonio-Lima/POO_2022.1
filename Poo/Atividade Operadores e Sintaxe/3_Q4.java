import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler= new Scanner(System.in);
    System.out.printf("Informe um número para saber todos os valores anteriores na série de Fibonacci: ");
    int valorMax = ler.nextInt() ;
    int atual = 0, anterior=0, proximo = 1;
    while(valorMax>atual ){
      System.out.println(atual);   
      anterior = atual;
      atual = proximo;
      proximo = atual+anterior;      
      
    }
     ler.close();
      }
    }    
  
