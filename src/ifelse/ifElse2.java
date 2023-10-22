package ifelse;

public class ifElse2 {
    
    public static void main(String[] args) {
        
        int numberOfClassHeld = 82;
        int numberOfClassAttended = 34;
        int percentageOfClassesAttended = (34 * 100)/82;
        
        if (percentageOfClassesAttended >= 75) 
        {
            System.out.println("You can sit for exam");
        } else 
        {
            System.out.println("You cannot sit for exam");
        }
    }
    
}
