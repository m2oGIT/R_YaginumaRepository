/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java004;

/**
 * @author （r-yaginuma） <br />
 *         （ArrayTest） <br />
 *         （問1,問2の回答） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class ArrayTest {

  /**
   * （main） <br />
   * （5回の整数入力を受け付け、そのうち最大の値を表示する。 途中に整数以外が入力された場合はエラーメッセージを表示して、処理を終了する。） <br />
   * 
   * @param args 引数入力なし
   */
  @SuppressWarnings("resource")
  public static void main( String[] args ) {
    int inputnum = 0; //入力が整数だった場合の移動先
    int max = 0;      //最大値
    int sum = 0;      //合計値
    int avg = 0;      //平均値
    String[] input;   //入力先
    
    input = new String[5]; //入力先の文字列配列の初期化
    
    //初回入力処理
    System.out.println( "整数を5回入力してください。" );
    input[0] = new java.util.Scanner( System.in ).nextLine();
    
    //入力値が整数値であるかの判定処理
    boolean t = isInteger( input[0] );
    if ( t == false ) {
      System.out.println( "整数ではありません。処理を終了します。" );
      return;
    }
    
    //入力値を整数に変換
    inputnum = Integer.parseInt( input[0] );
    
    max = inputnum; //最大値に入力値を代入
    sum = inputnum; //合計値に入力値を代入
    
    //4回目以降の入力処理
    for ( int i = 1; i <= 4; i++ ) {
      //i回目の入力
      input[i] = new java.util.Scanner( System.in ).nextLine();
      
      //入力値が整数値であるかの判定処理
      t = isInteger( input[i] );
      if ( t == false ) {
        System.out.println( "整数ではありません。処理を終了します。" );
        return;
      }
      
      //入力値を整数に変換
      inputnum = Integer.parseInt( input[i] );
      
      max = Math.max( max, inputnum ); //最大値と入力値の大きいほうを最大値へ代入
      sum = sum + inputnum;            //合計値の計算処理
    }
    
    avg = sum / 5; //平均値の計算処理

    //最大値、合計値、平均値の表示
    System.out.println( "最大値は" + max );
    System.out.println( "合計値は" + sum );
    System.out.println( "平均値は" + avg );

  }

  /**
   * （isInteger） <br />
   * （引数numが整数であるかどうかを判定する。） <br />
   * 
   * @param num
   * @return 引数numが整数の時はtrue,そうでないときはfalseを返す。
   */
  public static boolean isInteger( String num ) {
    try {
      Integer.parseInt( num );
      return true;
    } catch ( NumberFormatException e ) {
      return false;
    }
  }
}
