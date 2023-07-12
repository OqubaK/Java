public class NonMetalElement extends Element {
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    void describeElement() {
        System.out.println(
                getSymbol() + " (Atomic number: " + getAtomicNumber() + ", Atomic weight:" + getAtomicWeight()
                        + ") is a nonmetal. Nonmetals are not good at conducting electricity.");
    }
}
