

import java.io.*;

public class ReadAndWrite {
    public static void main(String[] args) {
        //低层流写
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream=new FileOutputStream("src"+ File.separator+"1.txt");
            fileOutputStream.write("我是你爸爸".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //低层流读
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src"+File.separator+"1.txt");
            byte [] bytes = new byte[100];
            int hasRead = -1;
            while ((hasRead=fileInputStream.read(bytes))!=-1){
                System.out.println(new String(bytes,0,hasRead));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //高层流写
        FileOutputStream fileOutputStream1=null;
        PrintWriter printWriter = null;
        OutputStreamWriter outputStreamWriter = null;
        try {
            fileOutputStream1=new FileOutputStream("src"+File.separator+"2.txt");
            outputStreamWriter=new OutputStreamWriter(fileOutputStream1);
            printWriter = new PrintWriter(outputStreamWriter,true);
            printWriter.println("第一行");
            printWriter.println("222");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (fileOutputStream1!=null){
                try {
                    fileOutputStream1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStreamWriter!=null){
                try {
                    outputStreamWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (printWriter!=null){
                printWriter.close();
            }
        }
        //高级流读
        FileInputStream fileInputStream1=null;
        InputStreamReader inputStreamReader = null;
        BufferedReader bufferedReader=null;
        try {
            fileInputStream1 = new FileInputStream("src"+File.separator+"2.txt");
            inputStreamReader = new InputStreamReader(fileInputStream1);
            bufferedReader = new BufferedReader(inputStreamReader);
            String line = null;
            while ((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream1!=null){
                try {
                    fileInputStream1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStreamReader!=null){
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
