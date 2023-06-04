
import java.util.ArrayList;

public class Item {

    private String Description;
    private boolean itemLostStatus;

    static ArrayList<LostItem> lostitem = new ArrayList<LostItem>();
    static ArrayList<FoundItem> founditem = new ArrayList<FoundItem>();

    // Constructor
    public Item(String Description, boolean itemLostStatus) {
        this.Description = Description;
        this.itemLostStatus = itemLostStatus;
    }

    // Getters and setters
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public boolean getStatus() {
        return itemLostStatus;
    }

    public void setStatus(boolean itemLostStatus) {
        this.itemLostStatus = itemLostStatus;
    }

//    @compareDescription
//    This method tells whether or not this string matches the given Description
public static void compareDescription(ArrayList<FoundItem> founditem) {
        for (int i = 0; i < founditem.size(); i++) {
            FoundItem foundItem = founditem.get(i);
            if (MatchingFoundItemInfo(Student.searchByDescription(), foundItem) != null) {
                displayMatchingFoundItemInfo(foundItem);
            } else {
                System.out.println("No matching found item found.");
            }
        }
    }
    
   public static FoundItem MatchingFoundItemInfo(String word, FoundItem founditem) {
        if (word.toLowerCase().contains(founditem.getDescription().toLowerCase()) && founditem.isReceived() == false) {
            return founditem;
    }
    return null;
   }
    
   static void displayMatchingFoundItemInfo(FoundItem foundItem){
       System.out.println("\tMatching Found Item!");
       System.out.println("_______________________________________________\n");
       System.out.println("Description: " + foundItem.getDescription());
       System.out.println("Drop Security Security Center: " + foundItem.getDropSecuritySecurityCenter().toString());
   }
   
    public void comparePhoto() {
        // No implementation
    }
}
//    @Override
//    public String toString() {
//        return "Item{" + "Description=" + Description + ", Status=" + itemLostStatus + '}';
//    }


