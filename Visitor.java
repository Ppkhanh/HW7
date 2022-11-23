public interface Visitor {
    public void visitCompositeTeam(CompositeTeam CT);
    public void visitLeafTeam(LeafTeam LT, int printInfo);
}
