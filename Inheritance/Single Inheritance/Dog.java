public class Dog extends Animal {
    String breed;
    String color;
    String size;

    public void bark() {
        System.out.println("The dog is barking.");
    }

    public void printDetails(){
        System.out.println("Name = "+name);
        System.out.println("age = "+age);
        System.out.println("type = "+type);
        System.out.println("breed = "+breed);
        System.out.println("color = "+color);
        System.out.println("size = "+size);
    }
}