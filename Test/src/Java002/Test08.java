/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �ir-yaginuma�j <br />
 *         �iTest08�j <br />
 *         �i��2�̉񓚁j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test08 {

  /**
   * �imain�j <br />
   * �i1~100�̊�݂̂����Z����B�j <br />
   * 
   * @param args �����Ȃ�
   */
  public static void main( String[] args ) {
    int ans = 0;
    for ( int i = 1; i <= 100; i = i + 2 ) {
      ans = ans + i;
    }
    System.out.println( ans );

  }

}
