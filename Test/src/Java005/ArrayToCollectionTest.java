/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java005;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author （作成者） <br />
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class ArrayToCollectionTest {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args
   */
  public static void main( String[] args ) {

    System.out.println( "整数を5回入力してください。" );
    ArrayList<String> list = new ArrayList<String>();
    for (int i = 0 ; i <= 4; i++){
      String input = new java.util.Scanner( System.in ).nextLine();
      if ( Java004.ArrayTest.isInteger(input) == false ) {
        System.out.println( "整数ではありません。処理を終了します。" );
        return ;
      }
      list.add(input);
    }
    
    System.out.println("最大値は" + Collections.max( list));
    
    int sum = 0;
    for (int i = 0; i <= 4;i++){
      sum = sum + Integer.parseInt(list.get( i ));
    }
    System.out.println("合計値は" + sum);
    
    System.out.println("平均値は" + sum/5);

  }


}
