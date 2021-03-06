package com.akaxin.site.boot.test;

import com.akaxin.site.business.utils.FilePathUtils;
import com.akaxin.site.business.utils.FileServerUtils;

public class TestFile {

	private static String getDefaultSiteAdminIcon() {
		try {
			byte[] iconBytes = FileServerUtils.fileToBinary("Test.jpg");
			String fileId = FileServerUtils.saveFile(iconBytes, FilePathUtils.getPicPath(), 4);
			return fileId;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public static void main(String args[]) {
		System.out.println(getDefaultSiteAdminIcon());
	}
}
