/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

/**
 * @author （r-yaginuma） <br />
 *         （Test13） <br />
 *         （問3の回答） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test13 {

  /**
   * （main） <br />
   * （"*"を1~10個まで表示する。） <br />
   * 
   * @param args 引数なし
   */
  public static void main( String[] args ) {
    String msg = "";
    String wkmsg = "";
    for ( int i = 1; i <= 10; i++ ) {
      wkmsg = msg;
      msg = wkmsg + "*";
      System.out.println( msg );
    }
  }

}
