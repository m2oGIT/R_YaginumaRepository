/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author �ir-yaginuma�j <br />
 *  �iArrayToCollectionTest�j <br />
 *  �iJava005�̉񓚂ł��B�j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class ArrayToCollectionTest {

  /**
   * �imain�j <br />
   * �i�������T����͂���B���͂����l�̍ő�l�A���v�l�A���ϒl���o�͂���B�j <br />
   * @param �����Ȃ��B
   */
  public static void main( String[] args ) {

    System.out.println( "������5����͂��Ă��������B" );
    
    ArrayList<String> list = new ArrayList<String>();//���͐�̃��X�g��錾
    
    //������5����͂��󂯕t��
    for (int i = 0 ; i < 5 ; i++ ){
      
      // ��������C���v�b�g
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String input = "";
      try {
        input = br.readLine();
      } catch ( IOException e ) {
        // TODO �����������ꂽ catch �u���b�N
        e.printStackTrace();
      }
      
      //�����l�̔���
      if ( Java004.ArrayTest.isInteger(input) == false ) {
        System.out.println( "�����ł͂���܂���B�������I�����܂��B" );
        return ;
      }
      
      list.add(input);//���͒l�����X�g�ɒǉ�
    }
    
    System.out.println("�ő�l��" + Collections.max( list));
    
    int sum = 0;
    for (String s : list) {
      sum = sum + Integer.parseInt( s );
    }
    System.out.println("���v�l��" + sum);
    
    System.out.println("���ϒl��" + sum/5);

  }


}
