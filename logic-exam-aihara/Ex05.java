import java.util.HashMap;
import java.util.Map;

public class Ex05 {
    public static void main(String[] args) {
        String[] sports = {"soccer", "baseball", "jogging", "jogging", "soccer", "surfing", "surfing", "soccer", "surfing", "baseball", "boxing", "surfing", "soccer", "surfing", "jogging", "boxing", "jogging", "baseball", "soccer", "soccer"};
        Map<String,Integer> map = new HashMap<>();

        for(String sport: sports){
            if(map.get(sport) == null){
                map.put(sport,1);
            } else {
                map.put(sport, map.get(sport) + 1);
            }
        }
        int max = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(max < entry.getValue()){
                max = entry.getValue();
            }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(max == entry.getValue()){
                System.out.println("最も出現回数の多いスポーツは" + entry.getKey() + "で、出現回数は" + entry.getValue() + "回です");
            }
        }

    }
}
