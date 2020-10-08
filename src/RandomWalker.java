public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0, y = 0;
        int counter = 0;
        System.out.println("(" + x + ", " + y + ")");
        while (Math.abs(x) + Math.abs(y) != r) {
            double randomNum = Math.random();
            if (randomNum < 0.25) {
                x++;
            } else if (randomNum < 0.5) {
                y++;
            } else if (randomNum < 0.75) {
                x--;
            } else if (randomNum < 1) {
                y--;
            }
            counter++;
            System.out.println("(" + x + ", " + y + ")");
        }
        System.out.println("steps = " + counter);

    }
}
