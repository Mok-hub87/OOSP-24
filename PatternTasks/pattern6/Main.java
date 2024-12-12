package pattern6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список данных
        List<Double> data = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            data.add((double) i);
        }
        ;

        // Создаем экземпляры аналитических классов
        DataAnalyzer statisticalAnalyzer = new StatisticalAnalyzer();
        DataAnalyzer machineLearningAnalyzer = new MachineLearningAnalyzer();
        DataAnalyzer geneticAlgorithmAnalyzer = new GeneticAlgorithmAnalyzer();

        // Анализируем данные с помощью разных методов
        statisticalAnalyzer.analyzeData(data);
        machineLearningAnalyzer.analyzeData(data);
        geneticAlgorithmAnalyzer.analyzeData(data);
    }
}
