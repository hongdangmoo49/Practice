public class Homework1 {
    public static void main(String[] args) {
//        int var1 = 5;
//        int var2 = 2;
//        double var3 = var1 / var2;
//        int var4 = (int) (var3 * var2);
//        System.out.println(var4);
        int var1 = 5;
        int var2 = 2;
        double var3 = (double) var1 /  var2;
        double var4 =  (var3 * var2);
        System.out.println(var4);
    }
}
//    다음 코드를 실행하면 출력 결과로 5를 기대했는데 4가 출력되었습니다. 어디에서 잘못 작성된 것일까요?
// line 5의 연산 결과가 2.5가 되어야한다. 그러기 위해선 변수 var1, var2가 둘다 Int타입일 경우 소수점 자리 이하는 버리는 값이 되기 때문에
// line 5에 var1, var2 둘 중 하나 이상에 타입변환을 해주어야한다.
// 그리고 line 6 에 변수 var4 또한 int가 아닌 double이 와야한다.