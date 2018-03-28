package Task3_Vector3d;

public class Vector3d {
    private double x;
    private double y;
    private double z;

    public Vector3d() {
    }

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Метод сложения 2х векторов
    public Vector3d sum(Vector3d vector) {
        return new Vector3d(x + vector.x, y + vector.y, +z + vector.z);
    }

    //Метод скалярного произведения 2х векторов
    public double scalarMultiplication(Vector3d vector) {
        return (x * vector.x + y * vector.y + z * vector.z);
    }

    //Метод векторного произвидения 2х векторов
    public Vector3d vectorMultiplication(Vector3d vector) {
        return new Vector3d(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
