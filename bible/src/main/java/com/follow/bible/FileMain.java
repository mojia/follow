package com.follow.bible;

import com.follow.bible.domain.PartDo;
import sun.nio.cs.ext.GBK;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by wangxin on 15/11/19.
 */
public class FileMain {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(FileMain.class.getClassLoader().getResourceAsStream("hgb"), new GBK()));

        String line = "";

        int count = 0;
        while ((line = reader.readLine()) != null) {
            if (line.contains("Holy Bible")) {
                continue;
            }

            PartDo partDo = buildOnePart(line);
            if (partDo != null) {
                save(partDo);
                count++;
            }
        }

        System.out.println(count);

        reader.close();
    }

    private static void save(PartDo partDo) {


    }

    private static PartDo buildOnePart(String line) {
        String[] array = line.split(" ");

        if (array.length >= 3) {

            PartDo part = new PartDo();

            part.setVolumeEnglishShort(array[0]);

            String chapterAndPartStr = array[1];
            String[] chapterArray = chapterAndPartStr.split(":");

            if (chapterArray.length != 2) {
                System.out.println("ERR line:" + line);
                return null;
            }

            part.setChapterIndex(Integer.parseInt(chapterArray[0]));
            part.setPartIndex(Integer.parseInt(chapterArray[1]));

            part.setContent(array[2]);

            return part;
        }

        return null;
    }
}
