package pattern5;

import java.util.HashMap;
import java.util.Map;

public class HealthMonitoringSystem {

    private Map<String, Patient> patients = new HashMap<>();

    public static void main(String[] args) {
        HealthMonitoringSystem system = new HealthMonitoringSystem();

        // Создание пациентов
        Patient patient1 = new Patient("Иван Иванов", "иванов@mail.ru");
        Patient patient2 = new Patient("Мария Петрова", "мария@mail.ru");

        // Добавление пациентов в систему
        system.addPatient(patient1);
        system.addPatient(patient2);

        // Создание анализов
        Analysis bloodTest1 = new Analysis("Анализ крови", "Результат 1", patient1);
        Analysis bloodTest2 = new Analysis("Анализ крови", "Результат 2", patient2);
        Analysis urineTest = new Analysis("Анализ мочи", "Результат 3", patient1);

        // Добавление анализов в систему
        system.addAnalysis(bloodTest1);
        system.addAnalysis(bloodTest2);
        system.addAnalysis(urineTest);

        // Проверка уведомлений
        System.out.println("Уведомления для пациентов:");
        system.printNotifications();
    }

    // Добавление пациента в систему
    public void addPatient(Patient patient) {
        patients.put(patient.getEmail(), patient);
    }

    // Добавление анализа в систему
    public void addAnalysis(Analysis analysis) {
        Patient patient = patients.get(analysis.getPatientEmail());
        if (patient != null) {
            patient.addAnalysis(analysis);
        } else {
            System.out.println("Ошибка: Пациент с email " + analysis.getPatientEmail() + " не найден.");
        }
    }

    // Вывод уведомлений для пациентов
    public void printNotifications() {
        for (Patient patient : patients.values()) { // Извлекаем значения из HashMap (patients.values())
            System.out.println("Пациент: " + patient.getName());
            for (Analysis analysis : patient.getAnalyses().values()) { // Итерация по значениям в HashMap (getAnalyses().values())
                System.out.println("  " + analysis.getType() + ": " + analysis.getResult());
            }
            System.out.println();
        }
    }


    // Класс для пациентов
    static class Patient {
    private String name;
    private String email;
    private Map<String, Analysis> analyses = new HashMap<>();

    public Patient(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void addAnalysis(Analysis analysis) {
        analyses.put(analysis.getType(), analysis);
    }

    public Map<String, Analysis> getAnalyses() {
        return analyses;
    }
}

}
