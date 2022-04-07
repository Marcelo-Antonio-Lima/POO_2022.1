//
class Teste {
  static public int varclass; //Variável de classe
  public int varObj; //Variável de objeto
  public static void main(String[] args) {    
    int varlocal = 10; //Variável local = 10
    Teste teste1 = new Teste();
    Teste teste2 = new Teste();

    Teste.varclass = 5; //Variável de classe = 5
    teste1.varObj = varlocal*2+teste1.varclass; //10*2+5 = 25
    teste2.varObj = varlocal*3+teste2.varclass; //10*3+5 = 35
    System.out.println(varlocal);
    System.out.println(teste1.varclass+ " " +teste2.varclass+ " " +Teste.varclass);//Printa a mesma variável 3 vezes
    System.out.println(teste1.varObj);
    System.out.println(teste2.varObj);
  }
}
//