package com.pp.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {

	public static String getInstance(String plainText) throws NoSuchAlgorithmException {
		// 生成一个MD5加密计算摘要
		MessageDigest md = MessageDigest.getInstance("MD5");
		// 计算md5函数
		md.update(plainText.getBytes());
		return new BigInteger(1, md.digest()).toString(16);
	}

}
