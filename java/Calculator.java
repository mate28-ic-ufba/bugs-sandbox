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

  public static boolean test(Integer result, Integer expected){
    if (result != expected) {
    System.out.println("Test FAIL");
      return false;
    }
    System.out.println("Test OK");
    return true;
  }
  
  public static void main(String[] args) {
    boolean testResult = true;
    testResult &= test(sum(10, 2), 12);
    testResult &= test(sub(0, 2), 2);
    testResult &= test(sub(2, 10), 8);
    testResult &= test(div(10, 2), 5);
    testResult &= test(div(10, 0), null);
    testResult &= test(mul(10, 2), 20);

    if (!testResult) {
      throw new Error("Nem todos os testes passaram.");
    }
  }
}