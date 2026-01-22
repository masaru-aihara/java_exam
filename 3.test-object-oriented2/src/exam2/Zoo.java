package exam2;

public class Zoo {
    public static void main(String[] args) {
        Animal[] animals = {new Sheep(), new Horse(), new Goat()};
        for(Animal a : animals){
            a.cry();
        }
    }
}
