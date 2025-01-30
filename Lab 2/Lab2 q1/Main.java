
abstract class Animal {
    abstract void makeVoice(); 
}

class Cow extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Moo!");
    }
}

class Dog extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Woof!");
    }
}


class Pig extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Oink!");
    }
}


class Goat extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Baa!");
    }
}


class Lion extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Roar!");
    }
}

class Voice {
  
    Animal[] animals = new Animal[5];
    
    
    public void prepareVoice() {
        animals[0] = new Cow();  
        animals[1] = new Dog();   
        animals[2] = new Pig();   
        animals[3] = new Goat();  
        animals[4] = new Lion();  
    }

   
    public void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();  
        }
    }
}

