package exam3;

public class Delorean implements TimeMachine, Car , Airplane{
    public void run() {
        System.out.println("デロリアンが走る！");
    }

    public void fly() {
        System.out.println("デロリアンが飛ぶ！");
    }

    public void timeTravel() {
        System.out.println("デロリアンがタイムテレポート！");
    }

    public void engineStart() {
        run();
        fly();
        timeTravel();
    }

}
