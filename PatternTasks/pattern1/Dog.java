package pattern1;

class Dog extends Pet {
    @Override
    public String getType() {
        return "собака";
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}
