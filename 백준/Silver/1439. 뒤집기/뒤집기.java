import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int count0 = 0;  // 0이 연속되는 그룹 수
        int count1 = 0;  // 1이 연속되는 그룹 수

        if (s.charAt(0) == '0') { //문자열의 첫번째 숫자 판별
            count0++;
        } else {
            count1++;
        }
        for (int i = 1; i < s.length(); i++) { // 문자열의 2번째 숫자부터 이전의 숫자와 비교하면서 만약에 숫자가 같으면 count되지 않고 숫자가 달라지면 그룹 수 추가
            if (s.charAt(i) != s.charAt(i - 1)) { //이전의 숫자와 다를 경우 현재 문자열의 숫자가 무엇인지 확인
                if (s.charAt(i) == '0')
                    count0++;
                else
                    count1++;
            }
        }
        int leastcount = (count0 < count1) ? count0 : count1; //최소 횟수를 구해야되기 떄문에 0과 1중에 바꿀 떄 더 횟수가 적은 걸 고름
        System.out.println(leastcount);
    }
}