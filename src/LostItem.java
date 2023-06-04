
public class LostItem extends Item {
    
    private String LostLocation;
    private String RecipientID;
    private String RecipientName;

    public LostItem(String LostLocation, String Description, boolean Status, String RecipientID, String RecipientName) {
        super(Description, Status);
        this.LostLocation = LostLocation;
    }

    public String getRecipientID() {
        return RecipientID;
    }

    public void setRecipientID(String RecipientID) {
        this.RecipientID = RecipientID;
    }

    public String getRecipientName() {
        return RecipientName;
    }

    public void setRecipientName(String RecipientName) {
        this.RecipientName = RecipientName;
    }

    public String getLostLocation() {
        return LostLocation;
    }

    public void setLostLocation(String LostLocation) {
        this.LostLocation = LostLocation;
    }
    
}
