/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author �ir-yaginuma�j <br />
 *         �iTest11�j <br />
 *         �i��P�̉񓚁j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test11 {

  /**
   * �imain�j <br />
   * �i0.1��10����Z����10�{�����l��\������B�덷����菜�����߁A
   *   0.1�����Z���邽�тɏ����_�ȉ���2�ʂŎl�̌ܓ����Ă���B�j <br />
   * 
   * @param args �����Ȃ�
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
