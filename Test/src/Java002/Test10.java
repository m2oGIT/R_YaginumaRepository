/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （r-yaginuma） <br />
 *         （Test10） <br />
 *         （Test07.method_sumに引数１、引数２を渡して、戻り値を表示する。） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test10 {

  /**
   * （main） <br />
   * （引数１=1,引数２=100を渡して戻り値を表示する。） <br />
   * 
   * @param args 引数なし
   */
  public static void main( String[] args ) {
    int ans = 0;

    ans = Test07.method_sum( 1, 100 );

    System.out.println( ans );

  }

}
