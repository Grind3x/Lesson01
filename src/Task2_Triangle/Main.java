package Task2_Triangle;

public class Main {
    public static void main(String[] args) {

        Triangle triangleOne = new Triangle(4,5,6);
        Triangle triangleTwo = new Triangle(5,5,5);

        //Попытка создать несуществующий треугольник
        Triangle triangleThree = new Triangle(9,5,15);

        System.out.printf("Площать первого треугольника %.2f%n", triangleOne.area());
        System.out.printf("Площать втрого треугольника %.2f%n", triangleTwo.area());


    }
}
