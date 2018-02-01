package com.my3devtools.apk_info;

import java.io.IOException;

import net.dongliu.apk.parser.ApkFile;
import net.dongliu.apk.parser.bean.ApkMeta;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length==0) {
        	System.out.println("ApkInfo.jar {apk file}");
        	return;
        }
        try {
			ApkFile apkFile = new ApkFile(args[0]);
			ApkMeta apkMeta = apkFile.getApkMeta();
			System.out.println(apkMeta.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
