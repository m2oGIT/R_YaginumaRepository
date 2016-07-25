/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （r-yaginuma） <br />
 *         （Test08） <br />
 *         （問2の回答） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test08 {

  /**
   * （main） <br />
   * （1~100の奇数のみを加算する。） <br />
   * 
   * @param args 引数なし
   */
  public static void main( String[] args ) {
    int ans = 0;
    for ( int i = 1; i <= 100; i = i + 2 ) {
      ans = ans + i;
    }
    System.out.println( ans );

  }

}
