package pattern2;

// Абстрактный класс для фабрики мебели
abstract class FurnitureFactory {
    public abstract Chair createChair();

    public abstract Table createTable();

    public abstract Sofa createSofa();
}