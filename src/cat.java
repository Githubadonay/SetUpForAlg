public class Cat extends Pet{
   static int numberOfCats;

    public Cat(String name, String color, int age, int numberOfCats){
        super(color, color, age);
        numberOfCats++;
    }
    public String toString(){
        return "Cat " + super.toString();
    }
    @Override
    public String speak() {
        return "mewo";
    }
    
}
