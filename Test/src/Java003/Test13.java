/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * @author �ir-yaginuma�j <br />
 *         �iTest13�j <br />
 *         �i��3�̉񓚁j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test13 {

  /**
   * �imain�j <br />
   * �i"*"��1~10�܂ŕ\������B�j <br />
   * 
   * @param args �����Ȃ�
   */
  public static void main( String[] args ) {
    String msg = "";
    String wkmsg = "";
    for ( int i = 1; i <= 10; i++ ) {
      wkmsg = msg;
      msg = wkmsg + "*";
      System.out.println( msg );
    }
  }

}
