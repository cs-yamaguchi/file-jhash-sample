
package jp.co.comster.sample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

public class HashTester {


	/**
	 * [xxx@xxx ~]$ md5sum /tmp/tmp.zip
	 * 328294fa41db29cb45f1d1f5a8ba87bd  /tmp/tmp.zip
	 *
	 * [xxx@xxx ~]$ md5sum /tmp/im4java-1.4.0-bin.tar.bz2
	 * de51060e748e506b8e99e75e539eb79c  /tmp/im4java-1.4.0-bin.tar.bz2
	 *
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

        MessageDigest md = MessageDigest.getInstance("MD5");
        DigestInputStream inStream = new DigestInputStream(
            new BufferedInputStream(new FileInputStream(System.getProperty("user.dir") + "/im4java-1.4.0-bin.tar.bz2")), md
        );

        while (inStream.read() != -1) {
        }
        byte[] digest = md.digest();
        inStream.close();

        for (int i=0; i<digest.length; i++) {
            System.out.printf("%02x", digest[i]);
        }
	}

}
