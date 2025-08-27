public abstract class pet{
    private String name;
    private String color;
    private int age;

    pet(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        if(name.equals(""))
        throw new IllegalArgumentException("invalid name");
        this.name = name;
    }
    public void setColor(String color){
        if(color.equals(""))
        throw new IllegalArgumentException("invalid color");
        this.color = color;
    }
    public void setColor(int age){
        if(age < 0)
        throw new IllegalArgumentException("invalid color");
        this.age = age;
    }
    public abstract String speak();

    public String toString(){
        return "Name " + this.getName()+ "\n"
        + "color " + this.getColor()+ "\n"
        + "age " + this.getAge();
    }
}

