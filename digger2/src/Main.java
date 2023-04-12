public class Main {
    public static String bug = "🐛";
    public static String robot = "🤖";
    public static String land = "🌍";
    public static String death = "💀";
    public static String hole = " ";

    public static void main(String[] args) {
        int height_and_width = 10;
        for (int h = 1; h <= height_and_width; h++) {
            for (int w = 1; w <=height_and_width; w++) {
                if (w == 4 && h == 1)
                    System.out.print(robot);
                else if (h==10)
                    System.out.print(bug);
                else
                    System.out.print(land);
            }System.out.println();
        }
    }
}






