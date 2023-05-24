package chapter02;

public class ex14a {
    public static void main(String[] args) {
        int A[][] = defineMatrix(3, 3);
    }

    static int[][] defineMatrix(int rowNum, int columnNum) {
//        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("So hang cua Ma tran: ");
//            rowNum = sc.nextInt();
//            System.out.println("So cot cua Ma tran: ");
//            columnNum = sc.nextInt();
//        } while (rowNum < 1 || columnNum < 1);

        int A[][] = new int[rowNum][columnNum];

        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < columnNum; j++)
                System.out.print(A[i][j] + "\t");
        }
        return A;
    }
}
