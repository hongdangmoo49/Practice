package algorithm;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calender {
    public String solution(int month, int day) throws ParseException {
        String answer = "";
        String A =String.valueOf(month)+String.valueOf(day);
        String today;
        if(A.substring(0,1)!="0") {
            today = 0 + A;
        } else {
            today = A;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMDD");
        Date date = dateFormat.parse(today);


        Calendar Cal = Calendar.getInstance();
        Cal.setTime(date);
        Cal.add(Calendar.DATE, 98);
        System.out.println("항해시작 날짜:" + date);
        System.out.println("항해종료 날짜:" + new Date(Cal.getTimeInMillis()));
        return answer;
    }

    public static void main(String[] args) throws ParseException {
        Calender method = new Calender();
        System.out.println(method.solution(1, 18));

    }
}


//기원이는 오늘 항해99를 시작했다. 성격이 급한 기원이는 항해 1일 차부터 언제 수료를 하게될 지 궁금하다.
//
//항해 1일 차 날짜를 입력하면 98일 이후 항해를 수료하게 되는 날짜를 계산해주는 알고리즘을 만들어보자.
// 1 ≤ month ≤ 12
// 1 ≤ day ≤ 31 (2월은 28일로 고정합니다, 즉 윤일은 고려하지 않습니다.)
