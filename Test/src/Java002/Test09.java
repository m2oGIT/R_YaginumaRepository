/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （r-yaginuma） <br />
 *         （Test09） <br />
 *         （問3の回答） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test09 {

  /**
   * （main） <br />
   * （1~渡された引数１までを加算して表示する。） <br />
   * 
   * @param args 正の整数を入力
   */
  public static void main( String[] args ) {
    int ans = 0;
    int input = Integer.parseInt( args[0] );
    for ( int i = 1; i <= input; i++ ) {
      ans = ans + i;
    }
    System.out.println( ans );
  }

}
