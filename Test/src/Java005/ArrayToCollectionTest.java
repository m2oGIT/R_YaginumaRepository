/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java005;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author �i�쐬�ҁj <br />
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class ArrayToCollectionTest {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args
   */
  public static void main( String[] args ) {

    System.out.println( "������5����͂��Ă��������B" );
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0 ; i <= 4; i++){
      String input = new java.util.Scanner( System.in ).nextLine();
      if ( Java004.ArrayTest.isInteger(input) == false ) {
        System.out.println( "�����ł͂���܂���B�������I�����܂��B" );
        return ;
      }
      list.add(input);
    }
    
    System.out.println("�ő�l��" + Collections.max( list));
    
    int sum = 0;
    for (int i = 0; i <= 4;i++){
      sum = sum + Integer.parseInt(list.get( i ));
    }
    System.out.println("���v�l��" + sum);
    
    System.out.println("���ϒl��" + sum/5);

  }


}
