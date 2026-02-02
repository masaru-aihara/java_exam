public class Ex04 {
    public static void main(String[] args) {
        Ex04Method method = new Ex04Method();
        method.setYear(2000);
        if (method.date(method.getYear())) {
            System.out.println(method.getYear() + "年はうるう年です");
        } else {
            System.out.println(method.getYear() + "年はうるう年ではありません");
        }
        method.setYear(2100);
        if (method.date(method.getYear())) {
            System.out.println(method.getYear() + "年はうるう年です");
        } else {
            System.out.println(method.getYear() + "年はうるう年ではありません");
        }
    }
    }
