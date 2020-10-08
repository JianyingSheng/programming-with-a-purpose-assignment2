public class BandMatrix {
    public static void main(String[] args) {
        int nMatrix = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        String a = "";
        for (int i = 0; i < nMatrix; i++) {
            for (int j = 0; j < nMatrix; j++) {
                if (Math.abs(i - j) == 0) {
                    a = "*  ";

                }
                if (Math.abs(i - j) != 0) {
                    if (Math.abs(i - j) <= width) {
                        a = "*  ";
                    } else a = "0  ";
                }
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
