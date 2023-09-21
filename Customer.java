import java.util.HashSet; 
public class Customer {
    /*
    * Code for a customer, they have a name and a set of items that they wish to return.
    * They also have a boolean to determine if they have bad intentions or not, so that one or more items may be counterfit. 
    */

    //Customer's name
    private String name;
    //Customer's bad intentions
    private boolean badIntentions = false;
    //Customer's items
    private HashSet<Item> items = new HashSet<Item>();

    private GameUtilities gameUtilities = new GameUtilities();

    //initialize a customer with a name and bad intentions
    Customer(String name, boolean badIntentions){
        this.name = name;
        this.badIntentions = badIntentions;
    }

    //add an item to the customer's set of items
    public void addItem(Item item){
        items.add(item);
    }

    public String getName(){
        return name;
    }

    public boolean getBadIntentions(){
        return badIntentions;
    }

    //returns the hashset of items
    public HashSet<Item> getItems(){
        return items;
    }

    //returns the number of items in the hashset
    public int getNumItems(){
        return items.size();
    }

    //select a random item in the set and change it's item code to a random 4 character string 
    public void changeItemCode(){
        int rand = (int)(Math.random() * items.size());
        int i = 0;
        for(Item item : items){
            if(i == rand){
                item.setItemCode(gameUtilities.randomString(4));
                break;
            }
            i++;
        }
    }
}
