package algorithm;


import java.util.ArrayList;
import java.util.Arrays;

public class test1 {
    public String solution(int[] arr1) {
        String answer = "";
        int value = 0;
        int cnt = 0;
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if(value == arr1[i]){
                cnt++;
            }
        }
        switch (cnt){
            case 0: return  "윷";
            case 1: return  "도";
            case 2: return  "개";
            case 3: return  "걸";
            case 4: return  "모";
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        test1 method = new test1();
        int[] arr1 = {0,1,0,0};
        System.out.println(method.solution(arr1));
    }
}




//우리나라 고유의 윷놀이는 네 개의 윷짝을 던져서 배(0)와 등(1)이 나오는 숫자를 세어 도, 개, 걸, 윷, 모를 결정합니다.
// 네 개 윷짝을 던져서 나온 각 윷짝의 배 혹은 등 정보가 주어질 때
// 도(배 1개, 등 3개), 개(배 2개, 등 2개), 걸(배 3개, 등 1개), 윷(배 4개), 모(등 4개) 중 어떤 것인지를 결정하는 프로그램을 작성하세요.