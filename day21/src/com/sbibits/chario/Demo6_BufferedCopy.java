package com.sbibits.chario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo6_BufferedCopy {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("ttt.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));
        int len;
        while ((len = br.read())!=-1) {
            bw.write(len);
        }
        br.close();
        bw.close();
    }

}
