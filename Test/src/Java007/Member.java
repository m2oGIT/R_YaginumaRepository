/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author �i�쐬�ҁj <br />
 *         �i�N���X�_�����j <br />
 *         �i�����j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class Member {

  // �Ј������i�[����z����`
  String[] member = new String[3];

  /**
   * Member <br />
   * �Ј�ID�A�Ј�������z��֊i�[����B <br />
   * 
   * @param id
   * @param firstName
   * @param secondName
   */
  public Member( String id, String firstName, String secondName ) {
    member[0] = id;
    member[1] = firstName;
    member[2] = secondName;
  }

  /**
   * getId <br />
   * Member�̎Ј�ID��Ԃ��B <br />
   * 
   * @return
   */
  public String getId() {
    return member[0];
  }

  /**
   * getFirstName<br />
   * Member�̖��O��Ԃ��B <br />
   * 
   * @param i
   * @return
   */
  public String getFirstName() {
    return member[1];
  }

  /**
   * getSecondName <br />
   * Member�̕c����Ԃ��B <br />
   * 
   * @return
   */
  public String getSecondName() {
    return member[2];
  }

  /**
   * setId <br />
   * �n���ꂽ��������Ј�ID�Ƃ��āA�V�K�Ɋi�[����B <br />
   * 
   * @param id
   */
  public void setId( String id ) {
    member[0] = id;
  }

  /**
   * setFirstName <br />
   * �n���ꂽ������𖼑O�Ƃ��āA�V�K�Ɋi�[����B <br />
   * 
   * @param firstName
   */
  public void setFirstName( String firstName ) {
    member[1] = firstName;
  }

  /**
   * setSecondName <br />
   * �n���ꂽ�������c���Ƃ��āA�V�K�Ɋi�[����B <br />
   * 
   * @param secondName
   */
  public void setSecondName( String secondName ) {
    member[2] = secondName;
  }

  /**
   * showInfo <br />
   * �z��Ɋi�[���ꂽ�Ј�����\������B <br />
   */
  public void showInfo() {
    // �Ј�����\��
    System.out.println( "�Ј�No:" + member[0] );
    System.out.println( "��    :" + member[2] );
    System.out.println( "��    :" + member[1] );
    System.out.println( "����  :" + member[2] + "" + member[1] );
    System.out.println( "" );
  }

  /**
   * checkName <br />
   * �i�[����Ă���Ј������Ɠn���ꂽ�Ј��������r���āA�����������ǂ����𔻒肷��B ���茋�ʂ�\������B<br />
   * 
   * @param member2
   */
  public void checkName( Member member2 ) {
    // ���������`�F�b�N
    if ( member[2].equals( member2.getSecondName() )
        && member[1].equals( member2.getFirstName() ) ) {
      System.out.println( "�Ј�No=[" + member[0] + "]�ƁA�Ј�No=[" + member2.getId() + "]�͓��������ł�" );
    } else {
      System.out.println( "�Ј�No=[" + member[0] + "]�ƁA�Ј�No=[" + member2.getId() + "]�͓��������ł͂���܂���" );
    }
  }
}
