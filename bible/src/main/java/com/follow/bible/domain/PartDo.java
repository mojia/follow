package com.follow.bible.domain;

/**
 * 一节经文
 * Created by wangxin on 15/11/20.
 */
public class PartDo {
    //一卷书英文缩写
    private String volumeEnglishShort;
    //章
    private int chapterIndex;
    //节
    private int partIndex;
    //内容
    private String content;


    public String getVolumeEnglishShort() {
        return volumeEnglishShort;
    }

    public void setVolumeEnglishShort(String volumeEnglishShort) {
        this.volumeEnglishShort = volumeEnglishShort;
    }

    public int getChapterIndex() {
        return chapterIndex;
    }

    public void setChapterIndex(int chapterIndex) {
        this.chapterIndex = chapterIndex;
    }

    public int getPartIndex() {
        return partIndex;
    }

    public void setPartIndex(int partIndex) {
        this.partIndex = partIndex;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
