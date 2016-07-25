/**
 /**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java003;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author （r-yaginuma） <br />
 *         （Test12） <br />
 *         （問2の回答） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test12 {

  /**
   * （main） <br />
   * （実行した日時をyyyy/MM/dd HH:mm:ssの形式で表示する。） <br />
   * 
   * @param args 引数なし
   */
  public static void main( String[] args ) {
    Date date = new Date();
    SimpleDateFormat date2 = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
    System.out.println( date2.format( date ) );
  }

}
