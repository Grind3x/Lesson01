package Task2_Triangle;

public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    //Начальная инициализация треугольника. Проверяем существование
    public Triangle(double a, double b, double c) {
        if (isTriangle(a,b,c)) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else System.out.println("Невозможно создать треугольник. Введите правильную длинну сторон!" + '\n');
    }

    //Метод вычисления площади треугольника
    public double area() {
        double p;
        p = 0.5*(a + b + c);
        return Math.sqrt(p*(p - a)*(p - b)*(p - c));
    }

    //Метод проверки существования такого треугольника
    private boolean isTriangle(double a, double b, double c) {
        return (a + b) > c & (a + c) > b & (b + c) > a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
