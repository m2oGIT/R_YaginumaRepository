/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java002;

/**
 * @author （r-yaginuma） <br />
 *         （Test07） <br />
 *         （問1の回答のmainおよび問10のためのmethod。） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test07 {

  /**
   * （main） <br />
   * （ans=0に1~100を加算して表示する。） <br />
   * 
   * @param args 引数なし
   */
  public static void main( String[] args ) {
    int ans = 0;
    for ( int i = 1; i <= 100; i++ ) {
      ans = ans + i;
    }
    System.out.println( ans );
  }

  /**
   * （method_sum） <br />
   * （ans=0に引数１~引数２を加算してansを戻り値として返す。） <br />
   * 
   * @param start 整数
   * @param end 整数
   * @return startからendまでを加算した答え
   */
  public static int methodsum( int start, int end ) {
    int ans = 0;
    for ( int i = start; i <= end; i++ ) {
      ans = ans + i;
    }

    return ans;
  }

}
