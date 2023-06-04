
import java.util.Scanner;

public class FoundIt {
    
    public static void main(String[] args) {
                
        System.out.println("\t\tWelcome to Found it system!\n"
                + "\t_______________________________________________\n");
        
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        String anotherservice = "";
        
        while(!anotherservice.equalsIgnoreCase("no")){
            
            printMassageChoice();
            choice = input.nextInt();
            
            if (choice == 1){
                
                Student.addMissingItem();
                
            } else if (choice == 2){
                
                Student.addFoundItem();
                
            } else if (choice == 3){
                
//                Item.compareDescription();
            
            } else if (choice == 4){
                
                break;
            
            } else if (choice == 5){
                
                System.exit(0);
                
            } else {
                
                System.out.println("please Enter a correct number");
                printMassageChoice();
                
            }
            
            System.out.println("_______________________________________________"
                    + "\n\nWould you like to use another services? (yes/no)");
            anotherservice = input.next();
        }
    }
    
    private static void printMassageChoice(){
        System.out.print("press 1: if you lost an item\n" +
                           "press 2: if you found an item\n" +
                           "press 3: to search for a missing item by description\n" +
                           "press 4: to search for a missing item by photo\n" +
                           "press 5: to exit from the system\n" +
                           "_______________________________________________\n" +
                           "\nyour choice is: ");
    }
    
}
