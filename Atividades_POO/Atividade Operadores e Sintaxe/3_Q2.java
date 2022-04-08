class TabelaMultiplos { 
  public static void main(String[] args) {
    
    int tabela=5; //Indica até qual número a tabela mostrará os multiplos
    
    for(int i = 0;i<tabela+1;i++){
      
      for(int j = 1;j<i+1;j++){
        
        System.out.print(i*j+" ");
        }
      
      System.out.println("");
      }
    }    
  }
/*Printa uma tabela de multiplos no formato:
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
*/
