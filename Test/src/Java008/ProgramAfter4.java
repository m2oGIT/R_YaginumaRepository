/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java008;

import java.util.ArrayList;
import java.util.List;

import Java007.Member;

/**
 * @author 柳沼　諒 <br />
 *         ProgramAfter4 <br />
 *         Java008の問4の回答 <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class ProgramAfter4 {

  /**
   * main <br />
   * 社員情報の配列をリストに格納して、リストの各memberの情報を表示する。 <br />
   * 
   * @param args
   */
  public static void main( String[] args ) {
    // TODO 自動生成されたメソッド・スタブ
    // 社員情報
    String[][] array = {
        {
            "001", "一郎", "鈴木"
        },
        {
            "002", "一郎", "鈴木"
        },
        {
            "003", "三郎", "鈴木"
        }
    };

    // 社員情報リスト
    List<Member> list = new ArrayList<Member>();

    // リストに追加
    for ( int i = 0; i < 3; i++ ) {
      Member member = new Member( array[i][0], array[i][1], array[i][2] );
      list.add( member );
    }

    // リストに設定した情報を表示
    for ( Member member : list ) {
      member.showInfo();
    }

  }

}
