abstract class Person {
    abstract void eat();
    abstract void exercise();
}

class Athlete extends Person {
    @Override
    void eat() {
        System.out.println("Athlete eats a balanced diet to maintain performance.");
    }

    @Override
    void exercise() {
        System.out.println("Athlete follows a strict exercise regimen to stay fit and improve performance.");
    }
}

class LazyPerson extends Person {
    @Override
    void eat() {
        System.out.println("Lazy person eats whatever is convenient, often unhealthy food.");
    }

    @Override
    void exercise() {
        System.out.println("Lazy person avoids exercise and prefers sedentary activities.");
    }
}

public class Main {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();

        System.out.println("Athlete:");
        athlete.eat();
        athlete.exercise();

        System.out.println("\nLazy Person:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
