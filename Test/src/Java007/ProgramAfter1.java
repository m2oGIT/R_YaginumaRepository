/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java007;

/**
 * @author �����@�� <br />
 *  ProgramAfter1 <br />
 *  ProgramBefore�̊e�폈�������\�b�h�� <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class ProgramAfter1 {

  /**
   * main <br />
   * 3�l�̎Ј�����\�����āA�������r���ē�����������\������B <br />
   * @param args
   */
  public static void main( String[] args ) {
    
    // �Ј�No
    String id1 = "00001";
    // ��
    String firstName1 = "��Y";
    // ��
    String secondName1 = "���";

    // �Ј�No
    String id2 = "00002";
    // ��
    String firstName2 = "��Y";
    // ��
    String secondName2 = "���";

    // �Ј�No
    String id3 = "00003";
    // ��
    String firstName3 = "�O�Y";
    // ��
    String secondName3 = "���";
    
    //�Ј�����\��(��l��)
    showInfo(id1,firstName1,secondName1);
    //�Ј�����\��(��l��)
    showInfo(id2,firstName2,secondName2);
    //�Ј�����\��(�O�l��)
    showInfo(id3,firstName3,secondName3);


    //���������`�F�b�N(��l�ڂƓ�l��)
    checkName(id1,firstName1,secondName1,id2,firstName2,secondName2);
    //���������`�F�b�N(��l�ڂƎO�l��)
    checkName(id1,firstName1,secondName1,id3,firstName3,secondName3);
    //���������`�F�b�N(��l�ڂƎO�l��)
    checkName(id2,firstName2,secondName2,id3,firstName3,secondName3);


  }
  
  public static void showInfo(String id, String firstName, String secondName){
    // �Ј�����\��
    System.out.println( "�Ј�No:" + id );
    System.out.println( "��       :" + secondName );
    System.out.println( "��       :" + firstName );
    System.out.println( "����    :" + secondName + "" + firstName );
    System.out.println( "" );
  }
  
  public static void checkName(String id1,String firstName1, String secondName1, 
      String id2, String firstName2, String secondName2){
    // ���������`�F�b�N
    if ( secondName1.equals( secondName2 )
        && firstName1.equals( firstName2 ) ) {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA�Ј�No=[" + id2 + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + id1 + "]�ƁA�Ј�No=[" + id2 + "]�͓��������ł͂���܂���" );
    }
  }
}
