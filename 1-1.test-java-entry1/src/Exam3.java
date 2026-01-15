public class Exam3 {
    public static void main(String[] args) {
        int item1Price = 200;
        int item2Price = 250;
        double taxRate = 0.1;
        double subTotal = item1Price * 3 + item2Price * 4;
        double tax = subTotal * taxRate;
        double total = subTotal + tax;
        int subTotal2 = (int)subTotal;
        int tax2 = (int)tax;
        int total2 = (int)total;
        System.out.println("小計");
        System.out.println(subTotal2 + "円");
        System.out.println("消費税");
        System.out.println(tax2 + "円");
        System.out.println("合計金額");
        System.out.println(total2 + "円");
    }
}
