import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exam6 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(1543, 02, 10, 05, 12,  00);

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH時mm分");

        System.err.println("徳川家康の誕生日は" + dateTime + "です");

        dateTime = dateTime.plusYears(1);
        dateTime = dateTime.plusMonths(2);
        dateTime = dateTime.plusDays(3);
        dateTime = dateTime.plusHours(4);
        dateTime = dateTime.plusMinutes(5);
        

        System.out.println("1年2ヶ月3日4時間5分後は" + dateTime + "です");
    }
    
}
