/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test11 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * 
   * @param args
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
