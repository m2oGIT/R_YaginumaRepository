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
 * @author �i�쐬�ҁj <br />
 *         �i�N���X�_�����j <br />
 *         �i�����j <br />
 *         �X�V���� yyyy/mm/dd �i�X�V�ҁj�F�i�����j <br />
 */
public class FileReadWriteTest {

  /**
   * �i���\�b�h�_�����j <br />
   * �i�����j <br />
   * 
   * @param args
   */
  public static void main( String[] args ) {

    String filename = "./run/file/text.txt";
    write_file( args[0], filename );
    read_file( filename );

  }

  public static void write_file( String args, String filename ) {
    // �t�@�C���̐ݒ�
    File file = new File( filename );
    FileWriter filewriter = null;
    try {
      filewriter = new FileWriter( file );
    } catch ( IOException e ) {
      // TODO �����������ꂽ catch �u���b�N
      e.printStackTrace();
    }
    BufferedWriter bw = new BufferedWriter( filewriter );
    PrintWriter pw = new PrintWriter( bw );

    // ���t�Ǝ��s����������t�@�C���֏o��
    Date date = new Date();
    SimpleDateFormat date2 = new SimpleDateFormat( "yyyy/MM/dd HH:mm:ss" );
    pw.println( date2.format( date ) + args );

    // �t�@�C���̃N���[�Y
    pw.close();
  }

  public static void read_file( String filename ) {
    // �t�@�C���̐ݒ�
    File file = new File( filename );
    FileReader filereader;
    try {
      filereader = new FileReader( file );
      int ch;
      while ( ( ch = filereader.read() ) != -1 ) {
        System.out.print( ( char ) ch );
      }
    } catch ( FileNotFoundException e1 ) {
      // TODO �����������ꂽ catch �u���b�N
      e1.printStackTrace();
    } catch ( IOException e ) {
      // TODO �����������ꂽ catch �u���b�N
      e.printStackTrace();
    }
  }

}
