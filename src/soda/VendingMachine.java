package soda;

// Stephen Koch

public class VendingMachine {
    private int numCans;
    private int tokens;
    
    VendingMachine(){
        numCans = 10;
        tokens = 0;
    }
    
    public void insertToken(){
        if (numCans > 0) {
            numCans = numCans - 1;
            tokens = tokens + 1;
        }
    }
    
    public void fillUp(int newCans) {
        numCans = numCans + newCans;
    }
    
    public int getCanCount(){
        return numCans;
    }
    
    public int getTokenCount(){
        return tokens;
    }
}
