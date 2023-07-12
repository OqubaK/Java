public class MetalElement extends Element {
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    void describeElement() {
        System.out.println(
                getSymbol() + " (Atomic number: " + getAtomicNumber() + ", Atomic weight:" + getAtomicWeight()
                        + ") is a metal. Metals are good at conducting electricity.");
    }
}
