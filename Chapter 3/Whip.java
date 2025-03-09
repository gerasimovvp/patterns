public class Whip extends CondimentDecorator{
    Beverage beverage;

    public Whip(Beverage beverage){    
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Whip";
    }

    public double cost(){
        double result = 0;
        if(beverage.getSize() == Size.VENTI)
        {
            result = .5 + beverage.cost();
        }
        else if(beverage.getSize() == Size.TALL)
        {
            result = .10 + beverage.cost();
        }
        else if(beverage.getSize() == Size.GRANDE)
        {
            result = .15 + beverage.cost();
        }       
        return result; 
    }
}
