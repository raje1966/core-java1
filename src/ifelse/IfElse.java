package ifelse;

public class IfElse {
    
    public static void main(String[] args) {
        
        int person1age = 40;
        int person2age = 60;
        int person3age = 90;
        
        if (person1age > person2age && person1age > person3age) 
        {
            System.out.println("Person1age is oldest");
        } else if (person2age > person1age && person2age > person3age) 
        {
            System.out.println("Person2age is oldest");
        } else 
        {
            System.out.println("Person3age is oldest");
        }
    }
    
}
