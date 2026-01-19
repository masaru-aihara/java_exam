public class Exam6 {
    public static void main(String[] args) {
        calc(2, 3, '+');
        calc(8, 2, '-');
        calc(5, 4, '*');
        calc(7, 2, '/');
        calc(3, 8, '@');
    }

    static void calc(int num1, int num2, char operator) {
       if(operator == '+'){
            System.out.println(num1 + num2);
       } else if (operator == '-') {
            System.out.println(num1 - num2);
       } else if (operator == '*') {
            System.out.println(num1 * num2);
       } else if (operator == '/') {
            System.out.println(num1 / num2);
       } else {
            System.out.println("-1");
       }

        
    }
}
