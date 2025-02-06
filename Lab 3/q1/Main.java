
abstract class Bharatvanshi {
    
   
    public abstract String obey();
    
    public abstract String kind();
    
   
    public String fight() {
        return "I fight as a Bharatvanshi.";
    }
}


class Pandav extends Bharatvanshi {
    
   
    @Override
    public String obey() {
        return "I obey as a Pandav.";
    }
    
    
    @Override
    public abstract String kind();
}


class Arjun extends Pandav {
    
    @Override
    public String kind() {
        return "I am kind like a true Pandav.";
    }
}


class Bheem extends Pandav {
    
    @Override
    public String kind() {
        return "I am less kind but equally obedient.";
    }
}


class Kaurav extends Bharatvanshi {
    
  
    @Override
    public String obey() {
        return "I do not obey like a Kaurav.";
    }
    
    
    @Override
    public abstract String kind();
}


class Duryodhan extends Kaurav {
    
    @Override
    public String kind() {
        return "I am cruel like a Kaurav.";
    }
}


class Vikarn extends Kaurav {
    
    @Override
    public String obey() {
        return "I obey, unlike other Kauravs.";
    }
    
    @Override
    public String kind() {
        return "I am kind and noble like a true Bharatvanshi.";
    }
}


public class Main {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        System.out.println(arjun.fight()); 
        System.out.println(arjun.obey());  
        System.out.println(arjun.kind());  

        System.out.println(bheem.fight());  
        System.out.println(bheem.obey());  
        System.out.println(bheem.kind());  

        System.out.println(duryodhan.fight()); 
        System.out.println(duryodhan.obey());   
        System.out.println(duryodhan.kind());   

        System.out.println(vikarn.fight()); 
        System.out.println(vikarn.obey());   
        System.out.println(vikarn.kind());   
    }
}
