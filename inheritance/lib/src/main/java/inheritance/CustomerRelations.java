package inheritance;

public interface CustomerRelations {
    private void collectMoney(){
        System.out.println("More money!");
    }

    void dealWithPissedOfCustomers();
    static void interfaceSays(){
        System.out.println("Hello from static meth of das interface");
    }//abstract
}
