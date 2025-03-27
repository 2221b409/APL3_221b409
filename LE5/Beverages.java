abstract class Beverages {
   
    private void pour(int qty) {
        System.out.println("Pour " + qty + " ml of drink");
    }

    
   protected abstract void addCondiments();

    
   protected void stir() {
        System.out.println("Stirring the beverage");
    }

   
    private void serve() {
        System.out.println("Serve through waiter");
    }

   
    public void templateMethod(int qty) {
        pour(qty);
        addCondiments();
        stir();
        serve();
    }
}

class Whisky extends Beverages {
    @Override
    protected void addCondiments() {
        System.out.println("Add ice accordingly");
    }

    @Override
    protected void stir() {
        System.out.println("Stir for 30 seconds");
    }
}

class Beer extends Beverages {
    @Override
    protected void addCondiments() {
        System.out.println("Nothing");
    }
    
    @Override
    protected void stir() {
        System.out.println("Gently stir the beer");
    }
}

public class Main {
    public static void main(String[] args) {
        Beverages b = new Whisky();
        b.templateMethod(30);

        b = new Beer();
        b.templateMethod(200); 
    }
}