/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java007;

/**
 * @author 柳沼　諒 <br />
 *         ProgramAfter2 <br />
 *         処理(ProgramBefore,ProgramAfter1)を元に、 社員情報クラス(Member)を自作し、分かりやすく修正して下さい。 <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class ProgramAfter2 {

  /**
   * main <br />
   * クラスmemberを利用して、社員情報を処理する。 <br />
   * 
   * @param args
   */
  public static void main( String[] args ) {
    // TODO 自動生成されたメソッド・スタブ
    // 一人目
    Member member1 = new Member( "00001", "一郎", "鈴木" );
    // 二人目
    Member member2 = new Member( "00002", "一郎", "鈴木" );
    // 三人目
    Member member3 = new Member( "00003", "三郎", "鈴木" );

    // 社員情報を表示(一人目)
    member1.showInfo();

    // 社員情報を表示(二人目)
    member2.showInfo();

    // 社員情報を表示(三人目)
    member3.showInfo();

    // 同姓同名チェック(一人目と二人目)
    member1.checkName( member2 );

    // 同姓同名チェック(一人目と三人目)
    member1.checkName( member3 );

    // 同姓同名チェック(二人目と三人目)
    member2.checkName( member3 );

  }

}
