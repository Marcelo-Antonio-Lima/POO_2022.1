class Fatorial { // Printa os fatoriais de 1 a 10
  
  public static void main(String[] args) {
    
    int fatorial;
    
    for(int i = 1;i<11;i++){
      
      System.out.print(i+"! = ");
      
      fatorial = 1;
      
      for(int j = i;j>0;j--){ //Faz a operação fatorial multiplicando um número com todos os seus antecessores até 1
        
        fatorial*=j;        
        }
      
      System.out.println(fatorial);
      }
    }    
  }
