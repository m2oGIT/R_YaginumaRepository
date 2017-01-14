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
 * @author �i�쐬�ҁj <br />
 *  �i�N���X�_�����j <br />
 *  �i�����j <br />
 *  �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class ProgramAfter5 {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * @param args
   * @throws IOException 
   */
  public static void main( String[] args ) {
    // TODO �����������ꂽ���\�b�h�E�X�^�u
    
    // ���̓t�@�C������錾
    String inputFileName = "./run/file/input.txt";
    
    // ���̓t�@�C���̓ǂݍ��ݏ���
    File inputFile = new File(inputFileName);
    FileReader fileReader = null;
    try {
      fileReader = new FileReader(inputFile);
    } catch ( FileNotFoundException e) {
      // TODO �����������ꂽ catch �u���b�N
      e.printStackTrace();
    }
    BufferedReader br = new BufferedReader(fileReader);
    
    // ���̓t�@�C���̃f�[�^���i�[����Member�̃��X�g��錾
    List<Member> listMember = new ArrayList<Member>();

    // 1���R�[�h���i�[���镶�����錾
    String record ="";
    try {
      // 1���R�[�h���Ƃɓǂݍ��݁AlistMember�֊i�[����B
      while((record = br.readLine())!=null){
        String[] recordArray = record.split(",");
        Member member = new Member(recordArray[0],recordArray[1],recordArray[2]);
        listMember.add( member );
      };
    } catch ( IOException e ) {
      // TODO �����������ꂽ catch �u���b�N
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
      // TODO �����������ꂽ catch �u���b�N
      e1.printStackTrace();
    }
    BufferedWriter bw = new BufferedWriter( fileWriter );
    PrintWriter pw = new PrintWriter( bw );
    
    int wkCnt = 0;
    for (Member member: listMember){
      wkCnt++;
      pw.println( 
          "�s��:[" + wkCnt + 
          "] �Ј�No.:[" + member.getId() + 
          "] ���O:[" + member.getSecondName() + member.getFirstName() + "]");
    }
    pw.close();
  }

}
