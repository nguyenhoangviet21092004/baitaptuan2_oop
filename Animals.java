package baitaptuan2;

public abstract class Animals {
      public   abstract String makeSound();

}

 class Tiger extends Animals {

    public String makeSound() {
        return "Tiger ";
    }

}

 class Chicken extends  Animals implements Edible{
   public String makeSound() {
       return "Ga " ;
   }
   public String howtoEat() {
       return "Eat" ;
   }
}

interface Edible {
    String howtoEat();
}


abstract class Fruit implements Edible {
   public abstract String howtoEat();
}

class Apple extends Fruit {
    @Override
    public String howtoEat() {
        return "Apple";
    }
}

class Orange extends  Fruit {
    @Override
    public String howtoEat() {
        return "Orange";
    }
}



class Test {
    public static void main(String[] args) {
        Animals [] animals = new Animals[2] ;
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        Fruit []fruit = new Fruit[2] ;
           fruit[0] = new Apple();
           fruit[1] = new Orange();

        for (Fruit fruit1: fruit
             ) {
            System.out.println(fruit1.howtoEat());
        }

        for (Animals animals1: animals
             ) {
            System.out.println( animals1.makeSound());

            if (animals1 instanceof Chicken ){
                Edible edible = (Chicken) animals1 ;

                System.out.println("Nguoi :"+edible.howtoEat());
            }
        }
    }
}