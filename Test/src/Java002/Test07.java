/**
 * Copyright 2016 EIS Co., Ltd. All rights reserved.
 */
package Java002;

/**
 * @author （r-yaginuma） <br />
 *  （Test07） <br />
 *  （1~100までの数値をループで回して、加算するコードを作成する。） <br />
 *  更新履歴 yyyy/mm/dd （更新者）：（説明） <br />
 */
public class Test07 {

  /**
   * （main） <br />
   * （ans=0に1~100を加算する。） <br />
   * @param args
   */
  public static void main( String[] args ) {
    int ans=0;
    for(int i = 0; i <= 100; i++){
      ans=ans+i;
    }
    System.out.println(ans);
  }

}
