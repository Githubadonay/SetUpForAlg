public class dog extends pet {
    static int numberOfDogs;

    public dog(String name, String color, int age, int numberOfDogs){
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
