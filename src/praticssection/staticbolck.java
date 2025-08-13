package praticssection;

public class staticbolck {
    
    // Static block - executed once when class is loaded
    static {
        System.out.println("vicky patil");
    }

    // Non-static inner class
    public class StaticUse {
        
        // Constructor for StaticUse class
        public StaticUse() {
            System.out.println("rahul patil");
        }
    }

    public static void main(String[] args) {
        // Create an object of StaticBlock class
        staticbolck obj = new staticbolck();
        
        // Create an object of the inner class StaticUse
        StaticUse sc = obj.new StaticUse();
    }
}
