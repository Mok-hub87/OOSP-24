package pattern1;

class Parrot extends Pet {
    @Override
    public String getType() {
        return "попугай";
    }

    @Override
    public void makeSound() {
        System.out.println("Говорит попугай!");
    }
}