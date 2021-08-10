package com.company;

import java.io.*;

public abstract class FileStreamer {
//    private String filename;
//    private File file;
//    public FileStreamer(String filename)
//    {
//        this.filename=filename;
//        this.file=new File(filename);
//    }

//    FileStreamer(File f) {
//        this.file=f;
//    }

    public static String input(File file)
    {
        try {
            InputStreamReader read= new InputStreamReader(new FileInputStream(file));
            BufferedReader reader=new BufferedReader(read);
            // String FileLocation = null;
            StringBuilder data = new StringBuilder();
            String s;
            while ((s=reader.readLine())!=null)
                data.append(s);//.append("\\n~").append("+\n").append("~");
            reader.close();
            return data.toString();
        } catch (Exception e) {
            return null;
        }
    }
    //    public ArrayList<String> inputArray()
//    {
//        ArrayList<String> ls=new ArrayList<>();
//        try {
//            InputStreamReader read= new InputStreamReader(new FileInputStream(file));
//            BufferedReader reader=new BufferedReader(read);
//            String s;
//            while ((s=reader.readLine())!=null)
//                ls.add(s);
//            reader.close();
//            return ls;
//        } catch (Exception e) {
//            return null;
//        }
//    }
    public static boolean output(File filename, String input, boolean append)
    {
        try {
            Writer writer=new OutputStreamWriter(new FileOutputStream(filename,append));
            writer.write(input);
            writer.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
