/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author �ir-yaginuma�j <br />
 *         �iConsoleInTest�j <br />
 *         �iJava006�̖�P�̉񓚁j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class ConsolelnTest {

  /**
   * �imain�j <br />
   * �i�R���\�[��������͂��ꂽ�����s�̕�����𗭂ߍ��݁A
   *   �\�ߒ�`���ꂽ�I������(end)�����͂��ꂽ�ꍇ�ɁA�ꊇ�ŏo�͂��鏈�����쐬����B�j <br />
   * 
   * @param args
   */
  public static void main( String[] args ) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u

    System.out.println("���������͂��Ă��������B");
    System.out.println("end�̓��͂ŏI�����܂��B");
    
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
    
    String msg = "";

    // end�����͂����܂ŁA���͕��������X�g�֒ǉ�
    while ( !("end".equals(input)) ) {
      msg = msg + input; // ���͂��ꂽ�������ǉ�
      // ��������C���v�b�g
      isr = new InputStreamReader(System.in);
      br = new BufferedReader(isr);
      try {
        input = br.readLine();
      } catch ( IOException e ) {
        // TODO �����������ꂽ catch �u���b�N
        e.printStackTrace();
      }
    }
    
    
    System.out.println("���߂���������o�͂��܂��B" + msg);

  }

}
