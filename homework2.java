public class homework2 {
    public static void main(String[] args){
        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}
//    다음 코드를 실행했을 때 출력 결과는 무엇입니까? (증감연산자에 대해 알아보세요!)
//      line5의 '++x'의 증감 연산자의 경우 연산이 시작되기전 +1이 더해지는 것이고
//      'y--'의 경우 연산이 시작 된 후에 -1이 연산되기 때문에 line 5의 연산에서
//      int z = 11 + 20 으로 연산된다.