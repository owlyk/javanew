  public class AddOne {

  public static void main(String[] args) {
    System.out.println(expt(2, 4));
  }

  public static int addOneplus(int a, int b) {
    
    if (b == 0) {
      return a;
    } else if (b > 0) {
      return addOneplus(a + 1, b - 1);      
    } else {
      return addOneplus(a - 1, b + 1);
    }
}
