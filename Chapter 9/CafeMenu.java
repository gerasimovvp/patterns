import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class CafeMenu implements Menu{
    HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public CafeMenu(){
        addItem("Veggie Burger and Air Fries", "Veggie Burger on a whole wheat but, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 3.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 4.29);        
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator(){
        return menuItems.values().iterator();
    }
}
