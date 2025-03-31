public class CaliforniaPizzaStore extends PizzaStore{
    Pizza createPizza(String item){
        if(item.equals("cheese")){
            return null;
        //     return new CaliforniaStyleCheesePizza();
        // } else if(item.equals("veggie")){
        //     return new CaliforniaStyleVeggiePizza();
        // } else if(item.equals("clam")){
        //     return new CaliforniaStypleClamPizza();
        // } else if(item.equals("pepperoni")){
        //     return new CaliforniaStylePepperoniPizza();
        } else return null;   
    }
}
