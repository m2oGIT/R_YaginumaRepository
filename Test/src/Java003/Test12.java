/**
 /**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author �ir-yaginuma�j <br />
 *         �iTest12�j <br />
 *         �i��2�̉񓚁j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test12 {

  /**
   * �imain�j <br />
   * �i���s����������yyyy/MM/dd HH:mm:ss�̌`���ŕ\������B�j <br />
   * 
   * @param args �����Ȃ�
   */
  public static void main( String[] args ) {
    Date date = new Date();
    SimpleDateFormat date2 = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
    System.out.println( date2.format( date ) );
  }

}
