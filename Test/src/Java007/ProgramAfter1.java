/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java007;

/**
 * @author 柳沼　諒 <br />
 *  ProgramAfter1 <br />
 *  ProgramBeforeの各種処理をメソッド化 <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class ProgramAfter1 {

  /**
   * main <br />
   * 3人の社員情報を表示して、姓名を比較して同姓同名かを表示する。 <br />
   * @param args
   */
  public static void main( String[] args ) {
    
    // 社員No
    String id1 = "00001";
    // 名
    String firstName1 = "一郎";
    // 姓
    String secondName1 = "鈴木";

    // 社員No
    String id2 = "00002";
    // 名
    String firstName2 = "一郎";
    // 姓
    String secondName2 = "鈴木";

    // 社員No
    String id3 = "00003";
    // 名
    String firstName3 = "三郎";
    // 姓
    String secondName3 = "鈴木";
    
    //社員情報を表示(一人目)
    showInfo(id1,firstName1,secondName1);
    //社員情報を表示(二人目)
    showInfo(id2,firstName2,secondName2);
    //社員情報を表示(三人目)
    showInfo(id3,firstName3,secondName3);


    //同姓同名チェック(一人目と二人目)
    checkName(id1,firstName1,secondName1,id2,firstName2,secondName2);
    //同姓同名チェック(一人目と三人目)
    checkName(id1,firstName1,secondName1,id3,firstName3,secondName3);
    //同姓同名チェック(二人目と三人目)
    checkName(id2,firstName2,secondName2,id3,firstName3,secondName3);


  }
  
  public static void showInfo(String id, String firstName, String secondName){
    // 社員情報を表示
    System.out.println( "社員No:" + id );
    System.out.println( "姓       :" + secondName );
    System.out.println( "名       :" + firstName );
    System.out.println( "姓名    :" + secondName + "" + firstName );
    System.out.println( "" );
  }
  
  public static void checkName(String id1,String firstName1, String secondName1, 
      String id2, String firstName2, String secondName2){
    // 同姓同名チェック
    if ( secondName1.equals( secondName2 )
        && firstName1.equals( firstName2 ) ) {
      System.out.println( "社員No=[" + id1 + "]と、社員No=[" + id2 + "]は同姓同名です" );
    } else {
      System.out.println( "社員No=[" + id1 + "]と、社員No=[" + id2 + "]は同姓同名ではありません" );
    }
  }
}
