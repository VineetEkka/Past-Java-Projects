
public class KennelPetsTest {
    public static void main(String[] args) {
        Pet Sparky = new Dog("Sparky");
        Pet Shadow = new Dog("Shadow");
        Pet Thunder = new LoudDog("Thunder");
        Pet Rocky = new LoudDog("Rocky");
        Pet Bella = new Cat("Bella");
        Pet Tigger = new Cat("Tigger");
        Kennel PetPlatoon = new Kennel(Sparky,Shadow,Thunder,Rocky,Bella,Tigger);
        PetPlatoon.Speakall();

    }
}
