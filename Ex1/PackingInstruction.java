
public class PackingInstruction implements Visitor{
    private String instruction ;
    private String wrap;
    private String dimension;

@Override
public void VisitGlass(Glass s){
   wrap = "> this should be wrapped with bubble wraps ";
   dimension = "and packed in a box with dimension: "+Integer.toString(s.getWidth()+1) +"x"+  Integer.toString(s.getLenght()+1) 
   +"x"+  Integer.toString(s.getHeight()+1);
   instruction = wrap+ dimension;
   System.out.println(instruction);
}
@Override
public void VisitFurniture(Furniture f){
   wrap = "> this should be covered with waterproof covers ";
   dimension = "with area of: "+ Integer.toString(f.getWidth())+ "x"+ Integer.toString(f.getLenght());
 instruction =  wrap+ dimension;
  System.out.println(instruction);
}
@Override
public void VisitElectronic(Electronic e){
   wrap = ">this should be covered with Polyethylene foam film ";
dimension="and packed in a box with dimension: " +Integer.toString(e.getWidth()+1) +"x"+  Integer.toString(e.getLenght()+1) 
   +"x"+  Integer.toString(e.getHeight()+1);
    instruction = wrap+dimension;
     System.out.println(instruction);
}
public String getInstruction(HouseholdItem i){
    return instruction;
}
@Override
public void visitCompositeTeam(CompositeTeam CT) {
   // TODO Auto-generated method stub
   
}
@Override
public void visitLeafTeam(LeafTeam LT, int printInfo) {
   // TODO Auto-generated method stub
   
}
}