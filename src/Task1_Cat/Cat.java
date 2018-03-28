package Task1_Cat;

public class Cat {
    private String name;
    private int age;
    private boolean male;
    private String color;
    private int strength;

    public Cat() {

    }

    public Cat(String name, int age, boolean sex, String color, int strength) {
        this.name = name;
        this.age = age;
        this.male = sex;
        this.color = color;
        this.strength = strength;
    }

    public void sayMew() {
        System.out.println(name + " say mew!");
    }

    public void fight(Cat cat) {
        System.out.println((cat.strength > this.strength)?"Cat " + cat.name + " win!":("Cat " + this.name + " win!"));


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Hello, my name is " + name + " and I'm " + age + " years old." + '\n' +
                "My coat is " + color +
                " and my strength is " + strength + '\n';
    }
}
