/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Member {

  // 社員情報を格納する配列を定義
  String[] member = new String[3];

  /**
   * Member <br />
   * 社員ID、社員姓名を配列へ格納する。 <br />
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
   * Memberの社員IDを返す。 <br />
   * 
   * @return
   */
  public String getId() {
    return member[0];
  }

  /**
   * getFirstName<br />
   * Memberの名前を返す。 <br />
   * 
   * @param i
   * @return
   */
  public String getFirstName() {
    return member[1];
  }

  /**
   * getSecondName <br />
   * Memberの苗字を返す。 <br />
   * 
   * @return
   */
  public String getSecondName() {
    return member[2];
  }

  /**
   * setId <br />
   * 渡された文字列を社員IDとして、新規に格納する。 <br />
   * 
   * @param id
   */
  public void setId( String id ) {
    member[0] = id;
  }

  /**
   * setFirstName <br />
   * 渡された文字列を名前として、新規に格納する。 <br />
   * 
   * @param firstName
   */
  public void setFirstName( String firstName ) {
    member[1] = firstName;
  }

  /**
   * setSecondName <br />
   * 渡された文字列を苗字として、新規に格納する。 <br />
   * 
   * @param secondName
   */
  public void setSecondName( String secondName ) {
    member[2] = secondName;
  }

  /**
   * showInfo <br />
   * 配列に格納された社員情報を表示する。 <br />
   */
  public void showInfo() {
    // 社員情報を表示
    System.out.println( "社員No:" + member[0] );
    System.out.println( "姓    :" + member[2] );
    System.out.println( "名    :" + member[1] );
    System.out.println( "姓名  :" + member[2] + "" + member[1] );
    System.out.println( "" );
  }

  /**
   * checkName <br />
   * 格納されている社員姓名と渡された社員姓名を比較して、同姓同名かどうかを判定する。 判定結果を表示する。<br />
   * 
   * @param member2
   */
  public void checkName( Member member2 ) {
    // 同姓同名チェック
    if ( member[2].equals( member2.getSecondName() )
        && member[1].equals( member2.getFirstName() ) ) {
      System.out.println( "社員No=[" + member[0] + "]と、社員No=[" + member2.getId() + "]は同姓同名です" );
    } else {
      System.out.println( "社員No=[" + member[0] + "]と、社員No=[" + member2.getId() + "]は同姓同名ではありません" );
    }
  }
}
