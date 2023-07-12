public class ElementArray {
    public static void main(String[] args){
        MetalElement lithium = new MetalElement("Li", 3, 6.94);
        MetalElement platinum = new MetalElement("Pt", 78, 195.08);
        NonMetalElement oxygen = new NonMetalElement("O", 8, 16.00);
        NonMetalElement chlorine = new NonMetalElement("Cl", 17, 35.45);

        lithium.describeElement();
        platinum.describeElement();
        oxygen.describeElement();
        chlorine.describeElement();
    }
}
