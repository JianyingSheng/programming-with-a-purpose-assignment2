public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int totalSteps = 0;
        for (int t = 0; t < trials; t++) {
            int counter = 0;
            int x = 0, y = 0;
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
            }
            totalSteps += counter;

        }
        System.out.println("average number of steps = " + (double) totalSteps / trials);

    }
}
