package org.ib.commons.io;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: ibrencsics
 * Date: 5/8/12
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class IOUtils {

    public static String getBaseDir() {
        return System.getProperty("user.dir").replaceAll("\\\\", "/");
    }


    public static InputStream getInputStreamFromResources(String fileName) {
        InputStream is = IOUtils.class.getClassLoader().getResourceAsStream(fileName);
        return is;
    }

    public static InputStream getInputStreamAbsolute(String filePath) throws FileNotFoundException {
        InputStream is = new FileInputStream(filePath);
        return is;
    }

    public static InputStream getInputStreamRelative(String relativePath) throws FileNotFoundException {
        InputStream is = new FileInputStream(getBaseDir() + relativePath);
        return is;
    }


    public static File[] getFilesInDirectory(String absoluteDirPath) {
        File folder = new File(absoluteDirPath);
        return folder.listFiles();
    }

    public static File[] getFilesInDirectoryRelative(String relativeDirPath) {
        File folder = new File(getBaseDir() + relativeDirPath);
        return folder.listFiles();
    }


    public static File getFileRelative(String relativePath) {
        return new File(getBaseDir() + relativePath);
    }


    public static void storeFile(String absolutePath, byte[] data) throws IOException {
        FileOutputStream fos = new FileOutputStream(absolutePath);
        fos.write(data);
        fos.close();
    }
}
