package group_4_Project.Other;

import java.util.HashMap;
import java.util.Map;

public class uniqID {


        //not sure about private
        private static int itemsIdCount =0;
        private String itemName = "";
        private int itemQuantity = 0;
        private double itemPrice = 0;
        private int itemID = 0;
        private Map<Integer, Integer> itemsQuantityMap = new HashMap<>();      //item ID, item Quantity
        private Map<Integer, Double> itemsPricesMap = new HashMap<>();         //Item ID, item Price
        private Map<Integer, String > itemsListMap = new HashMap<>();          // Item ID, item Name


        public void addingNewItem (String itemName1, int itemQuantity1, double itemPrice1) {
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

}
