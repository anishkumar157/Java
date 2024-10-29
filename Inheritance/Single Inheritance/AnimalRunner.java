public class AnimalRunner {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.age = 5;
        myDog.type = "Mammal";
        myDog.breed = "Labrador";
        myDog.color = "Yellow";
        myDog.size = "Medium";

        myDog.printDetails();
    }
}