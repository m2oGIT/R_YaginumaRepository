/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java002;

/**
 * @author �ir-yaginuma�j <br />
 *  �iTest07�j <br />
 *  �i1~100�܂ł̐��l�����[�v�ŉ񂵂āA���Z����R�[�h���쐬����B�j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Test07 {

  /**
   * �imain�j <br />
   * �ians=0��1~100�����Z����B�j <br />
   * @param args
   */
  public static void main( String[] args ) {
    int ans=0;
    for(int i = 0; i <= 100; i++){
      ans=ans+i;
    }
    System.out.println(ans);
  }

}
