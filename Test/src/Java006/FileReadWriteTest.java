/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */

package Java006;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author （作成者） <br />
 *         （クラス論理名） <br />
 *         （説明） <br />
 *         更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class FileReadWriteTest {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * 
   * @param args
   */
  public static void main( String[] args ) {

    String filename = "./run/file/text.txt";
    write_file( args[0], filename );
    read_file( filename );

  }

  public static void write_file( String args, String filename ) {
    // ファイルの設定
    File file = new File( filename );
    FileWriter filewriter = null;
    try {
      filewriter = new FileWriter( file );
    } catch ( IOException e ) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }
    BufferedWriter bw = new BufferedWriter( filewriter );
    PrintWriter pw = new PrintWriter( bw );

    // 日付と実行時文字列をファイルへ出力
    Date date = new Date();
    SimpleDateFormat date2 = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
    pw.println( date2.format( date ) + args );

    // ファイルのクローズ
    pw.close();
  }

  public static void read_file( String filename ) {
    // ファイルの設定
    File file = new File( filename );
    FileReader filereader;
    try {
      filereader = new FileReader( file );
      int ch;
      while ( ( ch = filereader.read() ) != -1 ) {
        System.out.print( ( char ) ch );
      }
    } catch ( FileNotFoundException e1 ) {
      // TODO 自動生成された catch ブロック
      e1.printStackTrace();
    } catch ( IOException e ) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }
  }

}
