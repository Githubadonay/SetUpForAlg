public class Dog extends Pet {
    static int numberOfDogs;

    public Dog(String name, String color, int age, int numberOfDogs){
        super(name, color, age);
        numberOfDogs++;
    }
    public String toString(){
        return "Cat " + super.toString();
    }
    @Override
    public String speak() {
        return "mewo";
    }
}
