package pattern1;

class Cat extends Pet {
    @Override
    public String getType() {
        return "кошка";
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }
}
