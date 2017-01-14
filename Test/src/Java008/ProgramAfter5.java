/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java008;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import Java007.Member;

/**
 * @author （作成者） <br />
 *  （クラス論理名） <br />
 *  （説明） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class ProgramAfter5 {

  /**
   * （メソッド論理名） <br />
   * （説明） <br />
   * @param args
   * @throws IOException 
   */
  public static void main( String[] args ) {
    // TODO 自動生成されたメソッド・スタブ
    
    // 入力ファイル名を宣言
    String inputFileName = "./run/file/input.txt";
    
    // 入力ファイルの読み込み準備
    File inputFile = new File(inputFileName);
    FileReader fileReader = null;
    try {
      fileReader = new FileReader(inputFile);
    } catch ( FileNotFoundException e) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }
    BufferedReader br = new BufferedReader(fileReader);
    
    // 入力ファイルのデータを格納するMemberのリストを宣言
    List<Member> listMember = new ArrayList<Member>();

    // 1レコードを格納する文字列を宣言
    String record ="";
    try {
      // 1レコードごとに読み込み、listMemberへ格納する。
      while((record = br.readLine())!=null){
        String[] recordArray = record.split(",");
        Member member = new Member(recordArray[0],recordArray[1],recordArray[2]);
        listMember.add( member );
      };
    } catch ( IOException e ) {
      // TODO 自動生成された catch ブロック
      e.printStackTrace();
    }
    
    /*
    for (Member member : listMember){
      member.showInfo();
    }
    */
    String outputFileName = "./run/file/output.txt";
    
    File outputFile = new File(outputFileName);
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter(outputFile);
    } catch ( IOException e1 ) {
      // TODO 自動生成された catch ブロック
      e1.printStackTrace();
    }
    BufferedWriter bw = new BufferedWriter( fileWriter );
    PrintWriter pw = new PrintWriter( bw );
    
    int wkCnt = 0;
    for (Member member: listMember){
      wkCnt++;
      pw.println( 
          "行数:[" + wkCnt + 
          "] 社員No.:[" + member.getId() + 
          "] 名前:[" + member.getSecondName() + member.getFirstName() + "]");
    }
    pw.close();
  }

}
