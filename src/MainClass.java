import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("오징어 게임에 오신것을 환영합니다.");
        System.out.println("이번 게임은 구슬 게임입니다.");
        System.out.println("당신과 나는 각각 10개의 구슬을 가지고 있습니다.");
        System.out.println("10개의 구슬을 다 잃으면 죽습니다.");
        System.out.println("시작합니다.");
        System.out.println("배팅 하세요");
        String name = "이름";

        //유저가 가진 구슬 갯수
        int userGu = 10;  // 초기값은 10개
        //배팅 숫자를 입력 받기
        Scanner sc = new Scanner(System.in);  //입력 받기 위한 준비
        //여기서 부터 반복 배팅 조건이 안맞으면 계속 반복
        int bet = 0;
        while (true) {
            System.out.print("입력: ");
            bet = sc.nextInt();  //숫자를 입력 받아서 bet 변수에 저장
            System.out.println("당신은 " + bet + "의 구슬을 배팅했습니다");
            //만약에 내가 가진 갯수 보다 많이 배팅을 하면
            //안된다 다시 배팅해라
            if (bet > userGu) {
                System.out.println("안된다 다시 배팅해라");
            } else {
                break;  //무한 반복 종료
            }
        }
        //내가 가진 갯수 보다 적게 배팅하면 홀짝 게임 진행
        System.out.println("맞춰라");
        //컴퓨터가 구슬 10개의 구슬중에 랜덤으로 문제를 낸다
        Random random = new Random();  //랜덤을 사용하기 위한 준비
        int rNum = random.nextInt(10) +1;  //1~10부터까지 숫자가 랜덤으로 나오게
        System.out.println("컴퓨터가 낸 문제(구슬갯수): " + rNum);
        String dab = "짝";  //컴퓨터의 답
        if (rNum % 2 == 1) {
            dab = "홀";
            System.out.println("홀");
        }else {
            System.out.println("짝");
        }
        //유저가 이제 답을 맞춰야 된다.
        //답을 입력 하고 (홀, 짝)
        String uDab = sc.next();  //문자열 입력받기
        //답을 입력 하고 홀인지 짝인지
        //만약에 맞으면 맞다 틀리면 틀렸다.
        //맞으면 내가 이긴거 내가 가진 구슬과 배팅한 구슬의 갯수를 더한다.
        //틀리면 뺀다.
        userGu = userGu - bet;  //userGu -= bet;
        //내가 가진 구슬의 갯수가 0이 되면 빵!! 으악
        //내가 가진 구슬이 갯수가 20이 되면 승리
    }
}
