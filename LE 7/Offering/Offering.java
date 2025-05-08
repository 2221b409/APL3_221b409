abstract class Offering {
    abstract int getPrice();
    abstract String getName();
}

class Coffee extends Offering {
    int getPrice() {
        return 5; 
    }

    String getName() {
        return "Coffee";
    }
}

abstract class Decorator extends Offering {
    Offering offering;

    Decorator(Offering offering) {
        this.offering = offering;
    }
}

class Gin extends Decorator {
    Gin(Offering offering) {
        super(offering);
    }

    String getName() {
        return offering.getName() + " with Gin";
    }

    int getPrice() {
        return offering.getPrice() + 55;
    }
}

class Rum extends Decorator {
    Rum(Offering offering) {
        super(offering);
    }

    String getName() {
        return offering.getName() + " with Rum";
    }

    int getPrice() {
        return offering.getPrice() + 55;
    }
}

class Soda extends Decorator {
    Soda(Offering offering) {
        super(offering);
    }

    String getName() {
        return offering.getName() + " with Soda";
    }

    int getPrice() {
        return offering.getPrice() + 55;
    }
}

public class Main {
    public static void main(String[] args) {
        Offering coffee = new Coffee();
        System.out.println(coffee.getName() + " costs: " + coffee.getPrice());

        Offering coffeeWithRum = new Rum(coffee);
        System.out.println(coffeeWithRum.getName() + " costs: " + coffeeWithRum.getPrice());

        Offering coffeeWithGin = new Gin(coffee);
        System.out.println(coffeeWithGin.getName() + " costs: " + coffeeWithGin.getPrice());

        Offering coffeeWithSoda = new Soda(coffee);
        System.out.println(coffeeWithSoda.getName() + " costs: " + coffeeWithSoda.getPrice());
    }
}