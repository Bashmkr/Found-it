
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    
    static Scanner input = new Scanner(System.in);
    static ArrayList<LostItem> lostitem = new ArrayList<LostItem>();
    static ArrayList<FoundItem> founditem = new ArrayList<FoundItem>();
    
    private String ID;
    private String name;

    public Student() {
        
    }

    public Student(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static void addMissingItem() {
        System.out.println("Enter Missing Item Description: ");
        String missingItemDescription = input.nextLine();
        
        System.out.println("Where did you lose your item? ");
        String missingItemLocation = input.nextLine();
        
        lostitem.add(new LostItem(missingItemLocation, missingItemDescription, true, null, null));
        
        System.out.println("Your missing item was successfully added to the system.");
    }
    
    public static void addFoundItem() {
        System.out.println("Enter Found Item Description: ");
        String foundItemDescription = input.nextLine();
        
        System.out.println("Where did you found the item? ");
        String foundItemLocation = input.nextLine();
        
        System.out.println("In which security center you drop the item?");
        String foundItemDropLocation = input.nextLine();
        
//        founditem.add(new FoundItem)
        
        System.out.println("the found item was successfully added to the system.");
    }
    
    public static String searchByDescription() {
        System.out.println("Enter a word/description to search for item: ");
        String word = input.next();
        return word;
    }
    
    public static void searchByPhoto() {
        System.out.println("Upload a photo to search for item: ");
    }

    @Override
    public String toString() {
        return "Student{" + "ID=" + ID + ", name=" + name + '}';
    }
    
}
