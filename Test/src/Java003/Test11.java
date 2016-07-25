/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author （r-yaginuma） <br />
 *         （Test11） <br />
 *         （問１の回答） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test11 {

  /**
   * （main） <br />
   * （0.1を10回加算して10倍した値を表示する。誤差を取り除くため、
   *   0.1を加算するたびに小数点以下第2位で四捨五入している。） <br />
   * 
   * @param args 引数なし
   */
  public static void main( String[] args ) {
    double ans = 0;
    for ( int i = 1; i <= 10; i++ ) {
      ans = ans + 0.1;
      BigDecimal x = new BigDecimal( ans );
      x = x.setScale( 1, BigDecimal.ROUND_HALF_UP );
      ans = x.doubleValue();
    }
    ans = ans * 10;
    System.out.println( ans );
  }

}
