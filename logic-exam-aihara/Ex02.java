
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(11, 59, 59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH 時 mm 分 ss 秒");
        System.out.print(time.format(formatter)+ "の1秒後は");

        time = time.plusSeconds(1);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("H 時 m 分 s 秒");
        System.out.print(time.format(formatter1) + "です");

        System.out.println();

        LocalTime time2 = LocalTime.of(23, 59, 59);
        System.out.print(time2.format(formatter)+ "の1秒後は");
        time2 = time2.plusSeconds(1);
        System.out.print(time2.format(formatter1) + "です");

    }
}
