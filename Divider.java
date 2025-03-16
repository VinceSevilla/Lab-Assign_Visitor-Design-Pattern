class Divider implements Furniture{
    private double distance;
    public Divider(double distance){
        this.distance = distance;
    }

    public double getDistance(){
        return distance;
    }

    @Override
    public double accept(ShippingCostVisitor visitor){
        return visitor.calculateShipping(this);
    }
}
