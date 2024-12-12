package pattern1;

import java.util.Scanner;

public class PetManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet pet = null;

        while (true) {
            System.out.println("Выберите животное:");
            System.out.println("1. Собака");
            System.out.println("2. Кошка");
            System.out.println("3. Попугай");
            System.out.println("4. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера ввода

            switch (choice) {
                case 1:
                    pet = createPet("собака");
                    break;
                case 2:
                    pet = createPet("кошка");
                    break;
                case 3:
                    pet = createPet("попугай");
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Некорректный ввод.");
            }

            if (pet != null) {
                System.out.println("Введите имя животного:");
                String name = scanner.nextLine();
                pet.setName(name);

                System.out.println("Введите возраст животного:");
                int age = scanner.nextInt();
                scanner.nextLine(); // Очистка буфера ввода

                pet.setAge(age);

                System.out.println("Вы выбрали " + pet.getType() + " по имени " + pet.getName() +
                        " в возрасте " + pet.getAge() + " лет.");

                pet.makeSound();
            }
        }
    }

    private static Pet createPet(String type) {
        switch (type) {
            case "собака":
                return new Dog();
            case "кошка":
                return new Cat();
            case "попугай":
                return new Parrot();
            default:
                return null;
        }
    }
}

