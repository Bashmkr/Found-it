
public class FoundItem extends Item {
     private SecurityCenter DropSecuritySecurityCenter;
    private Student student;
    private boolean isReceived;

    public FoundItem(SecurityCenter DropSecuritySecurityCenter, Student student, boolean isReceived, String Description, boolean itemLostStatus) {
        super(Description, itemLostStatus);
        this.DropSecuritySecurityCenter = DropSecuritySecurityCenter;
        this.student = student;
        this.isReceived = isReceived;
    }

 
    
    public SecurityCenter getDropSecuritySecurityCenter() {
        return DropSecuritySecurityCenter;
    }

    public void setDropSecuritySecurityCenter(SecurityCenter DropSecuritySecurityCenter) {
        this.DropSecuritySecurityCenter = DropSecuritySecurityCenter;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public boolean isReceived() {
        return isReceived;
    }

    public void setisReceived(boolean isReceived) {
        this.isReceived = isReceived;
    }

    @Override
    public String toString() {
        return ("Description: " + super.getDescription()
                + "\nDrop Security Security Center: " + this.DropSecuritySecurityCenter
                + "\nReceived by: " + student.toString());
    }
    
    
    
}
