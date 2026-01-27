import java.util.List;
import java.util.ArrayList;
public class ShoppingCart {
    
List<Item> list = new ArrayList<>();
public int getTotalPrice(Item item){
    int total = 0;
    total = total + item.getPrice();
    return total;
}
public int getAveragePrice(Item item){
    int total = 0;
    total = total + item.getPrice();
    int average = total / list.size();
    return average;
}    
}
