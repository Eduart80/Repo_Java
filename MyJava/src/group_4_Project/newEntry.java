package group_4_Project;

import java.util.HashMap;
import java.util.Map;

public class newEntry {

    public static Map<Integer, Integer> itemsQuantityMap = new HashMap<>();      //item ID, item Quantity
    public static Map<Integer, Double> itemsPricesMap = new HashMap<>();         //Item ID, item Price
    public static Map<Integer, String > itemsListMap = new HashMap<>();          // Item ID, item Name

    public static Map <String, Map<Integer,String>> itemsListWithStoreID = new HashMap<>();
    public static String Name ="Seiko";
   public static String itemName = null;
   public static int itemQuantity=0;
   public static double itemPrice = 0;
   public static int itemsIdCount=300;
   public static int  itemID = 300;

    public static void addingNewItem (String itemName1, int itemQuantity1, double itemPrice1) {
        itemName = itemName1;
        itemQuantity=itemQuantity1;
        itemPrice = itemPrice1;
        itemsIdCount++;
        itemID = itemsIdCount;
        //may be do it with scan, to make sure that there is no invalid input
        itemsQuantityMap.put(itemID,itemQuantity);
        itemsPricesMap.put(itemID, itemPrice);
        itemsListMap.put(itemID, itemName);
        System.out.println("You successfully added " + itemID + ". " + itemName + " to your store.");
    }
//    Remove items:
//    From these maps the owner should be allowed to remove only if the itemID
//    he's trying to remove belongs to his store (Item ID stored with his Store ID in  itemsListWithStoreID Map:

//    public Map<Integer, Integer> itemsQuantityMap = new HashMap<>();      //item ID, item Quantity
//    public Map<Integer, Double> itemsPricesMap = new HashMap<>();         //Item ID, item Price
//    public Map<Integer, String > itemsListMap = new HashMap<>();          // Item ID, item Name
//    public Map <Integer (Item ID), Integer (Store ID)> itemsListWithStoreID = new HashMap<>();

    public static void main(String[] args) {
        addingNewItem("Stock", 22,120);
        Map<Integer, Integer> itemsQuantityMap = new HashMap<>();      //item ID, item Quantity
         Map<Integer, Double> itemsPricesMap = new HashMap<>();         //Item ID, item Price
         Map<Integer, String > itemsListMap = new HashMap<>();          // Item ID, item Name
         Map<String, Map<Integer, String>> itemsListWithStoreID = new HashMap<>();





            itemsQuantityMap.put(330, 50);
            itemsPricesMap.put(330, 120.00);
            itemsListMap.put(330, "Sneakers");
        System.out.println(itemsListMap);
        System.out.println(itemsPricesMap+" dollars");
        System.out.println(itemsQuantityMap);

        itemsListWithStoreID.put(Name,itemsListMap);
        System.out.println(itemsListWithStoreID);
        }
}
