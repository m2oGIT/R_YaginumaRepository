/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import Java007.Member;

/**
 * @author �����@�� <br />
 *         ProgramAfter3 <br />
 *         Java008�̖�3�̉� <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class ProgramAfter3 {

  /**
   * <br />
   * �Ј����̖��O���Đݒ肷�鏈�� <br />
   * 
   * @param args
   */
  public static void main( String[] args ) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    // �Ј��N���X
    Member member1 = new Member( "00001", "��Y", "���" );

    // �Ј�����\��
    member1.showInfo();

    // ���O��\��
    System.out.println( "���O�A�ύX�O:" + member1.getFirstName() );
    // ���O��ύX
    member1.setFirstName( "�Ԏq" );
    // ���O��\��
    System.out.println( "���O�A�ύX��:" + member1.getFirstName() );
    System.out.println();

    // �Ј�����\��
    member1.showInfo();

  }

}
