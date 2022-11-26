package algorithm;

public class test2 {
    public void solution(int star) {
        char c = '*';
        if(star >=0 && 100>=star) {
            for (int i = 0; i < star; i++) {
                for (int j = 0; j < star - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(c);
                }
                for (int j = 1; j < i; j++) {
                    System.out.print(c);
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test2 method = new test2();
        int star = 9;
        method.solution(star);
    }
}

// 첫째 줄에 정수 n이 주어진다. (0≤n≤100)
//다음 예제와 같이 삼각형 모양으로 ‘*’을 출력하세요.
//(공백의 개수와 별의 개수를 정확하게 확인해주시길 바랍니다. 🙆🏻‍♂️)