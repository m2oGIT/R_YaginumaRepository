/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author �ir-yaginuma�j <br />
 *         �iTest07�j <br />
 *         �i��1�̉񓚂�main����і�10�̂��߂�method�B�j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test07 {

  /**
   * �imain�j <br />
   * �ians=0��1~100�����Z���ĕ\������B�j <br />
   * 
   * @param args �����Ȃ�
   */
  public static void main( String[] args ) {
    int ans = 0;
    for ( int i = 1; i <= 100; i++ ) {
      ans = ans + i;
    }
    System.out.println( ans );
  }

  /**
   * �imethod_sum�j <br />
   * �ians=0�Ɉ����P~�����Q�����Z����ans��߂�l�Ƃ��ĕԂ��B�j <br />
   * 
   * @param start ����
   * @param end ����
   * @return start����end�܂ł����Z��������
   */
  public static int methodsum( int start, int end ) {
    int ans = 0;
    for ( int i = start; i <= end; i++ ) {
      ans = ans + i;
    }

    return ans;
  }

}
