public class overloading_constructor {
    
    public static void main(String[] args) {
        
        Pizza pizza = new Pizza("thick crust","tomato","mozzerella","pepper");

        System.out.println("Here are the ingredients of your pizza");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sause);
        System.out.println(pizza.topping);
    }
}
