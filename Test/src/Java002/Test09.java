/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �ir-yaginuma�j <br />
 *         �iTest09�j <br />
 *         �i��3�̉񓚁j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test09 {

  /**
   * �imain�j <br />
   * �i1~�n���ꂽ�����P�܂ł����Z���ĕ\������B�j <br />
   * 
   * @param args ���̐��������
   */
  public static void main( String[] args ) {
    int ans = 0;
    int input = Integer.parseInt( args[0] );
    for ( int i = 1; i <= input; i++ ) {
      ans = ans + i;
    }
    System.out.println( ans );
  }

}
