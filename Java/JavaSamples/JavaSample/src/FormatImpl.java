

/*
 * FormatImpl.java
 *
 * Created on 2007년 4월 3일 (화), 오후 12:46
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormatSymbols;
import java.util.Currency;
import java.text.ParsePosition;

public class FormatImpl {

    /** Creates a new instance of FormatImpl */
    public FormatImpl() {
    }
    public static void main(String []  args) {
        System.out.println("**************************달러를 $로 표기******************************");
        DecimalFormatSymbols symbol = new DecimalFormatSymbols();
        symbol.setCurrencySymbol("$");
        DecimalFormat df = new DecimalFormat("###,##0.##",symbol);
        System.out.println(symbol.getCurrencySymbol() + df.format(123456789123.77));
        System.out.println("**************************달러를 $로 표기끝****************************");

        System.out.println("**************************달러를 USD로 표기****************************");
        DecimalFormatSymbols symbol1 = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df1 = new DecimalFormat("###,##0.##",symbol1);
        System.out.println(symbol1.getCurrency() + df1.format(123456789123.77));
        System.out.println("**************************달러를 USD로 표기끝**************************");

        System.out.println("**************************원화를 KRW로 표기****************************");
        //내컴퓨터는 default로 Locale이 KOREA로 되어있기때문에...
        //우리나라에서 쓰면 대부분의 Locale이 KOREA일꺼임..
        DecimalFormatSymbols symbol2 = new DecimalFormatSymbols();
        DecimalFormat df2 = new DecimalFormat("###,##0.##",symbol2);
        // 앞에서 11자리 건너뛰고 표기
        Number num = df2.parse("123456789123.77", new ParsePosition(11));
        System.out.println(symbol2.getCurrency() + df2.format(num.doubleValue()));
        System.out.println("**************************원화를 KRW로 표기끝**************************");

        System.out.println("**************************소수점 이하 자리수 정하기*********************");
        DecimalFormatSymbols symbol3 = new DecimalFormatSymbols();
        DecimalFormat df3 = new DecimalFormat("###,##0.##",symbol3);
        //df3.setMaximumFractionDigits(5);
        df3.setMinimumFractionDigits(3);
        System.out.println(symbol3.getCurrency() + df3.format(123456789123.00000));
        System.out.println("**************************소수점 이하 자리수 정하기끝*******************");

        System.out.println("**************************정수만 가져오되 0자리수 부터 정해진만큼 가져오기*********************");
        DecimalFormatSymbols symbol4 = new DecimalFormatSymbols();
        DecimalFormat df4 = new DecimalFormat("###,##0.##",symbol4);
        df4.setMaximumIntegerDigits(10);
        //df4.setMaximumIntegerDigits(7);
        System.out.println(symbol4.getCurrency() + df4.format(123456789123.00000));
        System.out.println("**************************정수만 가져오되 0자리수 부터 정해진만큼 가져오기*********************");
    }


}



