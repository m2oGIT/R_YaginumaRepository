/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author �����@�� <br />
 *         ProgramAfter2 <br />
 *         ����(ProgramBefore,ProgramAfter1)�����ɁA �Ј����N���X(Member)�����삵�A������₷���C�����ĉ������B <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class ProgramAfter2 {

  /**
   * main <br />
   * �N���Xmember�𗘗p���āA�Ј�������������B <br />
   * 
   * @param args
   */
  public static void main( String[] args ) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    // ��l��
    Member member1 = new Member( "00001", "��Y", "���" );
    // ��l��
    Member member2 = new Member( "00002", "��Y", "���" );
    // �O�l��
    Member member3 = new Member( "00003", "�O�Y", "���" );

    // �Ј�����\��(��l��)
    member1.showInfo();

    // �Ј�����\��(��l��)
    member2.showInfo();

    // �Ј�����\��(�O�l��)
    member3.showInfo();

    // ���������`�F�b�N(��l�ڂƓ�l��)
    member1.checkName( member2 );

    // ���������`�F�b�N(��l�ڂƎO�l��)
    member1.checkName( member3 );

    // ���������`�F�b�N(��l�ڂƎO�l��)
    member2.checkName( member3 );

  }

}
