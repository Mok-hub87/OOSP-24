package pattern12;

public class RestaurantMenu {
    private MenuItem root;

    public RestaurantMenu() {
        root = new Category("Меню");
    }

    public void addCategory(String categoryName) {
        Category category = new Category(categoryName);
        ((Category) root).addItem(category);
    }

    public void addDish(String categoryName, String dishName, double price) {
        MenuItem category = findCategory(categoryName);
        if (category != null) {
            ((Category) category).addItem(new Dish(dishName, price));
        }
    }

    private MenuItem findCategory(String categoryName) {
        if (root.getName().equals(categoryName)) {
            return root;
        }
        for (MenuItem item : ((Category) root).items) {
            if (item.getName().equals(categoryName)) {
                return item;
            }
        }
        return null;
    }

    public void printMenu() {
        root.print(0);
    }

    public static void main(String[] args) {
        RestaurantMenu menu = new RestaurantMenu();

        menu.addCategory("Супы");
        menu.addDish("Супы", "Борщ", 250);
        menu.addDish("Супы", "Щи", 200);

        menu.addCategory("Вторые блюда");
        menu.addDish("Вторые блюда", "Плов", 300);
        menu.addDish("Вторые блюда", "Куриный суп", 180);

        menu.printMenu();
    }
}
