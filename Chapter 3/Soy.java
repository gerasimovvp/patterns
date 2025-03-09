public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage){    
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Soy";
    }

    public double cost(){
        double result = 0;
        if(beverage.getSize() == Size.VENTI)
        {
            result = .10 + beverage.cost();
        }
        else if(beverage.getSize() == Size.TALL)
        {
            result = .15 + beverage.cost();
        }
        else if(beverage.getSize() == Size.GRANDE)
        {
            result = .20 + beverage.cost();
        }       
        return result; 
    }
}
