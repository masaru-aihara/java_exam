package exam1;

public class EcoCar extends Car{
    EcoCar(String name){
        super(name);
        setName(name);
    }
    @Override
    public void putOnGas(){
        super.putOnGas();
        System.out.println("シーン！" + getName() + "が走ります");
    }

}
