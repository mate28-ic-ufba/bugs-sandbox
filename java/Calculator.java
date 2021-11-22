public class Calculator {
  public static int sum(int a, int b){
    return a + b;
  }

  public static int sub(int a, int b){
    return a - b;
  }

  public static int div(int a, int b){
    return a / b;
  }

  public static int mul(int a, int b){
    return a * b;
  }
  
  public static void main(String[] args) {
    System.out.println(sum(10, 2));
    System.out.println(sub(0, 2));
    System.out.println(sub(2, 10));
    System.out.println(div(10, 2));
    System.out.println(div(10, 0));
    System.out.println(mul(10, 2));
  }
}