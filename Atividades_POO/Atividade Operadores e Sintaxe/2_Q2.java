class Main { // Operação com operador ternário
  public static void main(String[] args) {
    int a = 10;
    int x = (a%2==0)? a / 2 : 3 * a + 1; // Verifica se a é par, caso seja x recebe a/2, caso não, x recebe 3 * a + 1
    System.out.println(x);
  }
}
