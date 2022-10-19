package eight;

/**
 * @author aday
 * @date 2022/9/21 10:25
 * description :
 */
public class GuessSize {

    static int bet = 10000;

    public static void main(String[] args) {
        int money = 1000000;
        int num = 0;
        int last = money;
        while (last > 0) {
            num ++ ;
            System.out.println("赌博次数：" + num);
            last = start(last);
        }
    }

    //赌博
    public static int start(int money) {
        Boolean b = guess();
        if (b) {
            money = money + bet;
            bet = 10000;
            System.out.println(" 结果 赢了，" + " 剩余本金：" + money + "下次赌注：" + bet);
        } else {
            money = money - bet;
            bet = bet * 2;
            System.out.println(" 结果 输了，" + " 剩余本金：" + money + "下次赌注：" + bet);
        }
        return money;
    }

    //猜大小
    public static Boolean guess() {
        double result = Math.random();
        if (result <= 0.5) {
            return false;
        } else {
            return true;
        }
    }
}
