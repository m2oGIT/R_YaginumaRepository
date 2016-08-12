/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java004;

/**
 * @author �ir-yaginuma�j <br />
 *         �iArrayTest�j <br />
 *         �i��1,��2�̉񓚁j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class ArrayTest {

  /**
   * �imain�j <br />
   * �i5��̐������͂��󂯕t���A���̂����ő�̒l��\������B �r���ɐ����ȊO�����͂��ꂽ�ꍇ�̓G���[���b�Z�[�W��\�����āA�������I������B�j <br />
   * 
   * @param args �������͂Ȃ�
   */
  @SuppressWarnings("resource")
  public static void main( String[] args ) {
    int inputnum = 0; //���͂������������ꍇ�̈ړ���
    int max = 0;      //�ő�l
    int sum = 0;      //���v�l
    int avg = 0;      //���ϒl
    String[] input;   //���͐�
    
    input = new String[5]; //���͐�̕�����z��̏�����
    
    //������͏���
    System.out.println( "������5����͂��Ă��������B" );
    input[0] = new java.util.Scanner( System.in ).nextLine();
    
    //���͒l�������l�ł��邩�̔��菈��
    boolean t = isInteger( input[0] );
    if ( t == false ) {
      System.out.println( "�����ł͂���܂���B�������I�����܂��B" );
      return;
    }
    
    //���͒l�𐮐��ɕϊ�
    inputnum = Integer.parseInt( input[0] );
    
    max = inputnum; //�ő�l�ɓ��͒l����
    sum = inputnum; //���v�l�ɓ��͒l����
    
    //4��ڈȍ~�̓��͏���
    for ( int i = 1; i <= 4; i++ ) {
      //i��ڂ̓���
      input[i] = new java.util.Scanner( System.in ).nextLine();
      
      //���͒l�������l�ł��邩�̔��菈��
      t = isInteger( input[i] );
      if ( t == false ) {
        System.out.println( "�����ł͂���܂���B�������I�����܂��B" );
        return;
      }
      
      //���͒l�𐮐��ɕϊ�
      inputnum = Integer.parseInt( input[i] );
      
      max = Math.max( max, inputnum ); //�ő�l�Ɠ��͒l�̑傫���ق����ő�l�֑��
      sum = sum + inputnum;            //���v�l�̌v�Z����
    }
    
    avg = sum / 5; //���ϒl�̌v�Z����

    //�ő�l�A���v�l�A���ϒl�̕\��
    System.out.println( "�ő�l��" + max );
    System.out.println( "���v�l��" + sum );
    System.out.println( "���ϒl��" + avg );

  }

  /**
   * �iisInteger�j <br />
   * �i����num�������ł��邩�ǂ����𔻒肷��B�j <br />
   * 
   * @param num
   * @return ����num�������̎���true,�����łȂ��Ƃ���false��Ԃ��B
   */
  public static boolean isInteger( String num ) {
    try {
      Integer.parseInt( num );
      return true;
    } catch ( NumberFormatException e ) {
      return false;
    }
  }
}
