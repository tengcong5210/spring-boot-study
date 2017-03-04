package com.tcc.boot.annotation.chapter_3_4;

/**
 *Windows系统的bean类
 * Created by ibm on 2017/3/4.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
