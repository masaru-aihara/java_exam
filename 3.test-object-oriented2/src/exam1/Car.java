package exam1;

public class Car {
    private String name;
    Car(String name){
        this.name = name;
    }

    void putOnGas(){
        System.out.println(name + "に給油します");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
