package com.sbibits.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4_CopyPicture {
/*
 * IO流(字符流是否可以拷贝非纯文本的文件)
* 不可以拷贝非纯文本的文件,图片音频之类的都不行（图片的音频是由字节流组成的）。
* 因为在读的时候会将字节转换为字符,在转换过程中,可能找不到对应的字符,就会用?代替,写出的时候会将字符转换成字节写出去
* 如果是?,直接写出,这样写出之后的文件就乱了,图片就会被破坏看不了了  
 */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("look.jpg");
        FileWriter fw = new FileWriter("copy.jpg");
        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        fr.close();
        fw.close();
    }

}
