package com.feri.test;

import org.apache.commons.io.FileUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *@Author feri
 *@Date Created in 2018/7/11 22:06
 */
public class MyTest {
    public static void main(String[] args) throws Exception {
        HttpURLConnection huc= (HttpURLConnection) new URL("http://ip.chinaz.com/getip.aspx").openConnection();
        huc.connect();
        if(huc.getResponseCode()==200){
            BufferedReader reader=new BufferedReader(new InputStreamReader(huc.getInputStream()));
            StringBuffer buffer=new StringBuffer();
            String msg;
            while ((msg=reader.readLine())!=null){
                buffer.append(msg);
            }
            System.out.println(buffer.toString());
        }
    }
}
