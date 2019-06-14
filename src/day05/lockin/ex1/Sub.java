package day05.lockin.ex1;

/**
 * @author XieKong
 * @date 2019/6/11 17:57
 */
public class Sub extends Main {
    synchronized public void operateSubMethod() {
        while (num > 0) {
            num--;
            System.out.println("sub num=" + num);
            this.operateMainMethod();
        }
    }
}
