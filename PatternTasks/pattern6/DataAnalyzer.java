package pattern6;

import java.util.ArrayList;
import java.util.List;

// Шаблонный метод для анализа данных
public abstract class DataAnalyzer {

    public void analyzeData(List<Double> data) {
        // Предобработка данных
        preProcessData(data);
        // Выполнить анализ
        analyze(data);
        // Пост обработка данных
        postProcessData(data);
        // Вывести результаты
        printResults(data);
    }

    // Методы, которые должны быть реализованы подклассами
    protected abstract void preProcessData(List<Double> data);

    protected abstract void analyze(List<Double> data);

    protected abstract void postProcessData(List<Double> data);

    // Метод для вывода результатов (может быть реализован в базовом классе)
    protected void printResults(List<Double> data) {
        System.out.println("Результаты анализа: " + data);
    }
}

