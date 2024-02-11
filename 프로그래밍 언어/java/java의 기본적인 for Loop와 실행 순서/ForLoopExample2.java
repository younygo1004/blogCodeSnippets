public class ForLoopExample2 {

    public static void main(String[] args) {

        int test = 1;
        for (int i = initStatementForLoop(); conditionalStatement(i, 5); i = lastStatement(i)) {
            System.out.printf("i값 = %d, 내부 출력문 실행%n", i);
            System.out.println();
        }

    }

    /**
     * for Loop의 초기식 실행 여부를 출력하기 위한 껍데기 method
     * @return 0
     */
    public static int initStatementForLoop() {
        System.out.println("초기식 실행");
        return 0;
    }

    /**
     * for Loop의 두 번째 구문인 조건식 실행 여부를 출력하기 위한 껍데기 method
     * @param first 조건식의 초기식에서 선언한 변수를 전달
     * @param second 조건식을 반복할 횟수를 전달
     * @return 조건식을 만족하는지 여부에 대해 true, false값을 반환
     */
    public static boolean conditionalStatement(int first, int second) {
        System.out.println("조건식 실행");
        return first < second;
    }

    /**
     * for Loop의 세 번째 구문인 실행문 실행 여부를 출력하기 위한 껍데기 method
     * @param first 조건식의 초기식에서 선언한 변수를 전달
     * @return first+1
     */
    public static int lastStatement(int first) {
        System.out.println("세번째 실행문 실행");
        return first + 1;
    }

}


