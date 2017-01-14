/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author （r-yaginuma） <br />
 *         （ConsoleInTest） <br />
 *         （Java006の問１の回答） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class ConsolelnTest {

  /**
   * （main） <br />
   * （コンソールから入力された複数行の文字列を溜め込み、
   *   予め定義された終了文字(end)が入力された場合に、一括で出力する処理を作成する。） <br />
   * 
   * @param args
   */
  public static void main( String[] args ) {
    // TODO 自動生成されたメソッド・スタブ

    System.out.println("文字列を入力してください。");
    System.out.println("endの入力で終了します。");
    
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
    
    String msg = "";

    // endが入力されるまで、入力文字をリストへ追加
    while ( !("end".equals(input)) ) {
      msg = msg + input; // 入力された文字列を追加
      // 文字列をインプット
      isr = new InputStreamReader(System.in);
      br = new BufferedReader(isr);
      try {
        input = br.readLine();
      } catch ( IOException e ) {
        // TODO 自動生成された catch ブロック
        e.printStackTrace();
      }
    }
    
    
    System.out.println("貯めた文字列を出力します。" + msg);

  }

}
