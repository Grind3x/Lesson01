package Task3_Vector3d;

public class Main {
    public static void main(String[] args) {

        Vector3d vectorOne = new Vector3d(1, 2, -5);
        Vector3d vectorTwo = new Vector3d(4, 8, 1);
        Vector3d vectorThree = new Vector3d(7, 12, -1);

        //Сложение 2х векторов
        System.out.println(vectorOne.sum(vectorThree));

        //Скалярное произведение 2х векторов
        System.out.println(vectorOne.scalarMultiplication(vectorTwo));

        //Векторное произведение 2х векторов
        System.out.println(vectorOne.vectorMultiplication(vectorTwo));
    }
}
