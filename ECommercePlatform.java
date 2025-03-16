public class ECommercePlatform{
    public static void main(String[] args){
        Furniture chair = new Chair();
        Furniture table = new Table(30);
        Furniture sofa = new Sofa(75);
        Furniture divider = new Divider(90);

        ShippingCostVisitor calculator = new FurnitureShippingCalculator();

        System.out.println("Chair Shipping Cost: P" + chair.accept(calculator));
        System.out.println("Table Shipping Cost: P" + table.accept(calculator));
        System.out.println("Sofa Shipping Cost: P" + sofa.accept(calculator));
        System.out.println("Divider Shipping Cost: P" + divider.accept(calculator));
    }
}