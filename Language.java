public abstract class Language {

    // method of abstract class
    public void display() {
      System.out.println("Welcome to Java");
    }
  }
  
  class Main extends Language {
  
    public static void main(String[] args) {
      
      // create an object of Main
      Main obj = new Main();
  
      // access method of abstract class
      // using object of Main class
      obj.display();
    }
  }  
