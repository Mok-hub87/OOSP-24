package pattern2;

// Фабрика для классического стиля
class ClassicFurnitureFactory extends FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ClassicChair();
    }

    @Override
    public Table createTable() {
        return new ClassicTable();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicSofa();
    }
}
