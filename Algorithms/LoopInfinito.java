public class LoopInfinito {

    public static void main(String[] args) {
        // Loop infinito
        int counter = 0;
        while (true) {
            System.out.println("Loop infinito");
            counter++;
            if (counter >= 100000) {
                break;
            }
        }
    }
}