package baitaptuan2;

public abstract class Animall {
   public abstract String makeSound();
}

class Cats extends Animall implements Edibler {

    public String makeSound() {
        return "Meo meo";
    }


    public String howtoEat() {
        return "Mam mam";
    }
}


interface Edibler {
    String howtoEat();
}

class Tests {
    public static void main(String[] args) {
        Animall[] animals = new Animall[1];
        animals[0] = new Cats();

        for (Animall  animal: animals
             ) {
            System.out.println(animal.makeSound());

            if (animal instanceof  Cats) {
                Edibler edibler = (Cats) animal;

                System.out.println(edibler.howtoEat());

            }
        }
    }

}

