/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import Java007.Member;

/**
 * @author 柳沼　諒 <br />
 *         ProgramAfter3 <br />
 *         Java008の問3の回答 <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class ProgramAfter3 {

  /**
   * <br />
   * 社員情報の名前を再設定する処理 <br />
   * 
   * @param args
   */
  public static void main( String[] args ) {
    // TODO 自動生成されたメソッド・スタブ
    // 社員クラス
    Member member1 = new Member( "00001", "一郎", "鈴木" );

    // 社員情報を表示
    member1.showInfo();

    // 名前を表示
    System.out.println( "名前、変更前:" + member1.getFirstName() );
    // 名前を変更
    member1.setFirstName( "花子" );
    // 名前を表示
    System.out.println( "名前、変更後:" + member1.getFirstName() );
    System.out.println();

    // 社員情報を表示
    member1.showInfo();

  }

}
