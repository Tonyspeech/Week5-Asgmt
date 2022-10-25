package codingAssignment;

public class App {

  public static void main(String[] args) {
    
    
    Logger logger = new AsteriskLogger();
    
    logger.Log("Hello");
    
    logger.Error("Hello"); 
    
    
    Logger logger1 = new SpacedLogger();
    
    logger1.Log("Hello");
    
    logger1.Error("Hello");
 
  }

}
