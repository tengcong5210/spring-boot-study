package com.tcc.boot.annotation.chapter_3_4;

/**
 * Linux系统下的bean类
 * Created by ibm on 2017/3/4.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
