public interface Flyable {
    void fly();
}


public interface Quackable {
    void quack();
}


public interface Swimmable {
    void swim();
}


public class RubberDuck implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Rubber Duck is swimming.");
    }
    
  
    public void squeak() {
        System.out.println("Rubber Duck squeaks!");
    }
}


public class WoodenDuck implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Wooden Duck is swimming.");
    }
    
    
    public void mute() {
        System.out.println("Wooden Duck is mute.");
    }
}


public class RedHeadDuck implements Flyable, Quackable, Swimmable {
    @Override
    public void swim() {
        System.out.println("RedHead Duck is swimming.");
    }
    
    @Override
    public void fly() {
        System.out.println("RedHead Duck is flying.");
    }
    
    @Override
    public void quack() {
        System.out.println("RedHead Duck is quacking.");
    }
}


public class LakeDuck implements Flyable, Quackable, Swimmable {
    @Override
    public void swim() {
        System.out.println("Lake Duck is swimming.");
    }
    
    @Override
    public void fly() {
        System.out.println("Lake Duck is flying.");
    }
    
    @Override
    public void quack() {
        System.out.println("Lake Duck is quacking.");
    }
}


public class DuckGame {
    public static void main(String[] args) {
        RubberDuck rd = new RubberDuck();
        WoodenDuck wd = new WoodenDuck();
        RedHeadDuck rhd = new RedHeadDuck();
        LakeDuck ld = new LakeDuck();
        
       
        System.out.println("Rubber Duck Actions:");
        rd.swim();
        rd.squeak();  
        System.out.println();
        
       
        System.out.println("Wooden Duck Actions:");
        wd.swim();
        wd.mute(); 
        System.out.println();
        
        
        System.out.println("RedHead Duck Actions:");
        rhd.swim();
        rhd.fly();
        rhd.quack();
        System.out.println();
        

        System.out.println("Lake Duck Actions:");
        ld.swim();
        ld.fly();
        ld.quack();
    }
}
