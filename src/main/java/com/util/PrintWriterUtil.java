package com.util;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterUtil {

    //已流的形式输出
    public static void print(HttpServletResponse response,String str){
        PrintWriter out = null;
        response.setCharacterEncoding("utf-8");
        try {
            out = response.getWriter();
            out.print(str);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if (null != out) {
                out.flush();
                out.close();
            }
        }
    }
}
