package pattern2;

import java.util.ArrayList;
import java.util.List;

public class FurnitureFactoryDemo {

    public static void main(String[] args) {
        // Создаем фабрики для разных стилей
        FurnitureFactory classicFactory = new ClassicFurnitureFactory();
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureFactory minimalistFactory = new MinimalistFurnitureFactory();

        // Заказываем мебель
        List<Furniture> classicFurniture = createFurniture(classicFactory);
        List<Furniture> modernFurniture = createFurniture(modernFactory);
        List<Furniture> minimalistFurniture = createFurniture(minimalistFactory);

        // Выводим информацию о мебели
        System.out.println("Классическая мебель:");
        printFurniture(classicFurniture);

        System.out.println("\nСовременная мебель:");
        printFurniture(modernFurniture);

        System.out.println("\nМинималистичная мебель:");
        printFurniture(minimalistFurniture);
    }

    // Создает набор мебели с помощью заданной фабрики
    private static List<Furniture> createFurniture(FurnitureFactory factory) {
        List<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(factory.createChair());
        furnitureList.add(factory.createTable());
        furnitureList.add(factory.createSofa());
        return furnitureList;
    }

    // Выводит информацию о мебели
    private static void printFurniture(List<Furniture> furnitureList) {
        for (Furniture furniture : furnitureList) {
            System.out.println(furniture.getDescription());
        }
    }
}
