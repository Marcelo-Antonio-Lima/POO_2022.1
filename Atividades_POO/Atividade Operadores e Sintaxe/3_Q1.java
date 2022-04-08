class LaçoCondicional { //Laço é executado enquanto a condição for verdadeira
  public static void main(String[] args) {
    
    int varx=13; //Variável a ser testada
    
    while(varx != 1){ //O laço ocorre enquanto varx for diferente de 1
      
      if(varx % 2 == 0){ //Testa se varx é par
        varx = varx/2; //Caso seja varx é dividido por 2
        
        if (varx == 1){ // Caso varx seja 1 será imprimido apenas varx 
          System.out.print(varx);
        }
        
        else{
          System.out.print(varx+" -->");// Caso varx seja diferente de 1 será imprimido "varx -->"
        }
        
      }  
      else{ // Caso varx seja impar varx é multiplicado por 3 e somado 1, então é imprimido     
        varx = 3 * varx + 1; 
        System.out.print(varx+" -->");
      }
    }    
  }
}
