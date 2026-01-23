import java.time.LocalDate;

public class Exam5 {   
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2001, 9,30);
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        System.err.println("私の誕生日は" + year + "年" + month + "月" + day + "日です");
    }
}
