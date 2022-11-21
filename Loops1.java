public class Loops1 {
    public static void main(String[] args) {
        int population = 10000000;
        int born = 14;
        int death = 8;
        int difference = born - death;
        for(int i = 1; i <= 10; i++){
            population += population * difference / 1000;
        }
        System.out.println(population);
    }
}