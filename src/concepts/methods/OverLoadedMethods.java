package concepts.methods;

public class OverLoadedMethods {
    public static void main(String[] args){

        // overloaded methods = methods that share the same name, but different parameters
        // (unique) signature = name + parameters
        // No two methods share the same signature

        String pizza = MakingPizza("Flat bread", "Mozzarella", "Chicken");
        System.out.println(pizza);

    }
    static String MakingPizza(String bread){
        return bread + " Pizza";
    }
    static String MakingPizza(String bread, String cheese){
        return cheese + " " + bread + " Pizza";
    }
    static String MakingPizza(String bread, String cheese, String toppings){
        return toppings + " " + cheese + " " + bread + " Pizza";
    }
}
