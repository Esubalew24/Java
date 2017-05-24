import java.util.ArrayList;

/**
 * Created by Esubalew on 06/05/17.
 */
public class GroceryList {

   private ArrayList<String> groceryList = new ArrayList<String>();

   public void addGoceryItems(String item) {
       groceryList.add(item);

    }
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + "Items in your grocery list.");
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println((i+1) + "." + groceryList.get(i));
        }
    }
    public void  modifygroceryItem(int position, String newitem){
        groceryList.set(position, newitem);
        System.out.println("Grocery item "+ (position + 1) + "has been modified");
    }
    public void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
}
