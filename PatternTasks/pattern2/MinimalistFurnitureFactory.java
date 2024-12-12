package pattern2;

class MinimalistFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new MinimalistChair();
    }

    @Override
    public Table createTable() {
        return new MinimalistTable();
    }

    @Override
    public Sofa createSofa() {
        return new MinimalistSofa();
    }
}