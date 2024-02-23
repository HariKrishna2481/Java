
abstract class Animal {
   
    abstract void eat();
    abstract void sleep();
}


class Lion extends Animal {
    
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeps in a den");
    }
}


class Tiger extends Animal {
   
    @Override
    void eat() {
        System.out.println("Tiger eats meat and occasionally hunts");
    }

  
    @Override
    void sleep() {
        System.out.println("Tiger sleeps in a forest");
    }
}


class Deer extends Animal {
  
    @Override
    void eat() {
        System.out.println("Deer eats grass and plants");
    }

  
    @Override
    void sleep() {
        System.out.println("Deer sleeps in a meadow");
    }
}


public class Main {
    public static void main(String[] args) {
        
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();

     
        System.out.println("Lion:");
        lion.eat();
        lion.sleep();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sleep();

        System.out.println("\nDeer:");
        deer.eat();
        deer.sleep();
    }
}
