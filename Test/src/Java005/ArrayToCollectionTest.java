/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author （r-yaginuma） <br />
 *  （ArrayToCollectionTest） <br />
 *  （Java005の回答です。） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class ArrayToCollectionTest {

  /**
   * （main） <br />
   * （整数を５回入力する。入力した値の最大値、合計値、平均値を出力する。） <br />
   * @param 引数なし。
   */
  public static void main( String[] args ) {

    System.out.println( "整数を5回入力してください。" );
    
    ArrayList<String> list = new ArrayList<String>();//入力先のリストを宣言
    
    //整数の5回入力を受け付け
    for (int i = 0 ; i < 5 ; i++ ){
      
      // 文字列をインプット
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String input = "";
      try {
        input = br.readLine();
      } catch ( IOException e ) {
        // TODO 自動生成された catch ブロック
        e.printStackTrace();
      }
      
      //整数値の判定
      if ( Java004.ArrayTest.isInteger(input) == false ) {
        System.out.println( "整数ではありません。処理を終了します。" );
        return ;
      }
      
      list.add(input);//入力値をリストに追加
    }
    
    System.out.println("最大値は" + Collections.max( list));
    
    int sum = 0;
    for (String s : list) {
      sum = sum + Integer.parseInt( s );
    }
    System.out.println("合計値は" + sum);
    
    System.out.println("平均値は" + sum/5);

  }


}
