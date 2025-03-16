class FurnitureShippingCalculator implements ShippingCostVisitor{
    @Override
    public double calculateShipping(Chair chair){
        return 50.0;
    }

    @Override 
    public double calculateShipping(Table table){
        return table.getWeight() * 2.0;
    }

    @Override
    public double calculateShipping(Sofa sofa){
        return sofa.getDistance() * 2.5;
    }

    @Override
    public double calculateShipping(Divider divider){
        return divider.getDistance() * 2.75;
    }
}