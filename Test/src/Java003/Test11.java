/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.math.BigDecimal;

/**
 * @author �i�쐬�ҁj <br />
 *         �i�N���X�_�����j <br />
 *         �i�����j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test11 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
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
