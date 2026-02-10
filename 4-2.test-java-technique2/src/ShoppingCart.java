import java.util.List;
import java.util.ArrayList;
public class ShoppingCart {
    
List<Item> list = new ArrayList<>();
public int getTotalPrice() {
        int total = 0;
        for (Item item : list) {
            total += item.getPrice();
        }
        return total;
    }

public int getAveragePrice(){
    if (list.isEmpty()) {  
        return 0;
    }
    int average = getTotalPrice() / list.size();
    return average;
}
public void add(Item item) {
    list.add(item);
}    
}
