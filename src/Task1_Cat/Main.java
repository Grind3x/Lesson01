package Task1_Cat;

public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Barsik", 9, true, "Brown",25);
        Cat catTwo = new Cat("Rizhik", 4, true, "Black", 35);
        Cat catThree = new Cat("Murka", 5, false, "White", 17);


        System.out.println(catOne);
        System.out.println(catTwo);
        System.out.println(catThree);

        catOne.sayMew();
        catTwo.sayMew();
        catThree.sayMew();

        System.out.println();

        System.out.println("Let the battle begin!");
        System.out.println();

        catOne.fight(catTwo);
        catTwo.fight(catThree);
    }
}



