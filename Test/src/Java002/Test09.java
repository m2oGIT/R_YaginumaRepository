/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �i�쐬�ҁj <br />
 *         �i�N���X�_�����j <br />
 *         �i�����j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test09 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * 
   * @param args
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
