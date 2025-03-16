class Chair implements Furniture{ 
    @Override
    public double accept(ShippingCostVisitor visitor){
        return visitor.calculateShipping(this);
    }
}