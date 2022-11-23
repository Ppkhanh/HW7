
public class MovingCostCalculator implements Visitor1{
private double Cost= 0;

@Override
public void VisitGlass(Glass s){
    double unitCost;
if(s.tickness ==1){
    unitCost = 2;
} else if(s.getTickness()==2){
    unitCost = 1.2;
} else{
    unitCost = 0.7;
}
Cost = unitCost*s.getLenght();
 System.out.println("Total cost for "+s.getName()+" is: "+ Double.toString(Cost)+" Euros");
}
@Override
public void VisitFurniture(Furniture f){
    double unitCost = (double) 1/4;
Cost = unitCost*f.getWeight();
 System.out.println("Total cost for "+f.getName()+" is: "+ Double.toString(Cost)+" Euros");
}
@Override
public void VisitElectronic(Electronic e){
    double unitCost;
    if(e.getFragile()){
unitCost = 0.5;
} else{
    unitCost = (double)5/15;
}
Cost = unitCost*e.getWeight();
 System.out.println("Total cost for "+e.getName()+" is: "+ Double.toString(Cost)+" Euros");
}

public double get_movingCost(HouseholdItem i){
    return Cost;
}
}