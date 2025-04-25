public class ChicagoPizzaStore extends PizzaStore{
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
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
