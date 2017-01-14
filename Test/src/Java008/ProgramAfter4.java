/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.util.ArrayList;
import java.util.List;

import Java007.Member;

/**
 * @author �����@�� <br />
 *         ProgramAfter4 <br />
 *         Java008�̖�4�̉� <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class ProgramAfter4 {

  /**
   * main <br />
   * �Ј����̔z������X�g�Ɋi�[���āA���X�g�̊emember�̏���\������B <br />
   * 
   * @param args
   */
  public static void main( String[] args ) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    // �Ј����
    String[][] array = {
        {
            "001", "��Y", "���"
        },
        {
            "002", "��Y", "���"
        },
        {
            "003", "�O�Y", "���"
        }
    };

    // �Ј���񃊃X�g
    List<Member> list = new ArrayList<Member>();

    // ���X�g�ɒǉ�
    for ( int i = 0; i < 3; i++ ) {
      Member member = new Member( array[i][0], array[i][1], array[i][2] );
      list.add( member );
    }

    // ���X�g�ɐݒ肵������\��
    for ( Member member : list ) {
      member.showInfo();
    }

  }

}
