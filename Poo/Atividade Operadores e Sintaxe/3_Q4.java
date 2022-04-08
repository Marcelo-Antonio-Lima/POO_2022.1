import java.util.Scanner; // Usado para poder receber um dado do usuário

class Fibonacci { //Recebe um número do usuário e printa todos os valores anteriores na série de Fibonacci
  public static void main(String[] args) {
    
    Scanner ler= new Scanner(System.in); //Instancia um objeto "ler" do tipo Scanner que será usado para receber um dado do usuário
    
    System.out.printf("Informe um número para saber todos os valores anteriores na série de Fibonacci: ");
    
    int valorMax = ler.nextInt() ; // Ultiliza o método nextInt do objeto ler para receber um inteiro do usuário
    
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
