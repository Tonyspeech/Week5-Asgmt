package codingAssignment;

public class AsteriskLogger implements Logger {
  

  @Override
  public void Log(String Log) {
    System.out.println("***" + Log + "***\n");
  }

  @Override
  public void Error(String Error) {
    Error = "***Error: "+ Error + "***";
    
    for (int i = 0; i < Error.length(); i++) {
      System.out.print("*");
    }
    System.out.println("\n");
    System.out.println(Error + "\n");
    for (int i = 0; i < Error.length(); i++) {
      System.out.print("*");
    }
  }
  

  

}
