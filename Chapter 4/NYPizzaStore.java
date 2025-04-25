public class NYPizzaStore extends PizzaStore{
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        // } else if(item.equals("veggie")){
        //     return new ChicagoStyleVeggiePizza();
        // } else if(item.equals("clam")){
        //     return new ChicagoStyleClamPizza();
        // } else if(item.equals("pepperoni")){
        //     return new ChicagoStylePepperoniPizza();
        } 
        return pizza;
    }
}
