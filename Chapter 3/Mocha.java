public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage){    
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        double result = 0;
        if(beverage.getSize() == Size.VENTI)
        {
            result = .15 + beverage.cost();
        }
        else if(beverage.getSize() == Size.TALL)
        {
            result = .20 + beverage.cost();
        }
        else if(beverage.getSize() == Size.GRANDE)
        {
            result = .25 + beverage.cost();
        }       
        return result; 
    }
}
