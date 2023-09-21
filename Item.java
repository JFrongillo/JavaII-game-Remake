public class Item{
    private String name, itemCode;
    private int quanity;
    private double price;

    Item(String name, double price, int quanity, String itemCode){
        this.name = name;
        this.price = price;
        this.quanity = quanity;
        this.itemCode = itemCode;
    }

    public String getName(){
        return name;
    }

    public String getItemCode(){
        return itemCode;
    }

    public double getPrice(){
        return price;
    }

    public int getQuanity(){
        return quanity;
    }

    public void setQuanity(int quanity){
        this.quanity = quanity;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setItemCode(String itemCode){
        this.itemCode = itemCode;
    }
}