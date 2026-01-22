package exam1;

public class SurperCar extends Car{
SurperCar(String name){
    super(name);
    setName(name);
}
    
    @Override
    public void putOnGas(){
        super.putOnGas();
        System.out.println("ブオーン！" + getName() + "が走ります");
    }
}
