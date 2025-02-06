
public interface Testable {
   
    void display();
}

public class Test implements Testable {
    
  
    @Override
    public void display() {
        System.out.println("Displaying the test information.");
    }

    public static void main(String[] args) {
       
        Test t = new Test();
        t.display(); 
    }
}

public abstract class AbsTest implements Testable {

}

public class ConcreteTest extends AbsTest {
    
    @Override
    public void display() {
        System.out.println("Displaying test information from ConcreteTest.");
    }

    public static void main(String[] args) {
       
        ConcreteTest ct = new ConcreteTest();
        ct.display(); 
    }
}
