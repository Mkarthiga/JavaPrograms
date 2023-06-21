import java.util.*;

public class EnumExample { 
  public static void main(String[] args) { 
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar); 
  } 
}

enum Level {
  LOW,
  MEDIUM,
  HIGH
}