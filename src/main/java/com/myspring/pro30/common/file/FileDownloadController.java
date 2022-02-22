package com.myspring.pro30.common.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//import net.coobird.thumbnailator.Thumbnails;

@Controller
public class FileDownloadController {
	private static final String ARTICLE_IMAGE_REPO = "C:\\board\\article_image";
//	썸네일 이미지파일 저장하는 메서드
//	@RequestMapping("/download")
//	protected void download(@RequestParam("imageFileName") String imageFileName,
//						HttpServletResponse response) throws Exception{
//		OutputStream out = response.getOutputStream();
//		String filePath = CURR_IMAGE_REPO_PATH + "\\" + imageFileName;
//		File image = new File(filePath);
//		int lastIndex = imageFileName.lastIndexOf(".");
//		String fileName = imageFileName.substring(0, lastIndex);
//		
//		File thumbnail = new File(CURR_IMAGE_REPO_PATH + "\\" + "thumbnail"+"\\"+fileName+".png");
//		if(image.exists()) {
//			thumbnail.getParentFile().mkdirs();
//			Thumbnails.of(image).size(50,50).outputFormat("png").toFile(thumbnail);
//		}
//		
//		FileInputStream in = new FileInputStream(thumbnail);
//		byte[] buffer = new byte[1024*8];
//		while(true) {
//			int count = in.read(buffer);
//			if(count == -1)
//				break;
//			out.write(buffer, 0, count);
//		}
//		in.close();
//		out.close();
//	}
	
//	썸네일 이미지 파일 저장 없이 하는 메서드
	@RequestMapping("/download.do")
	protected void download(@RequestParam("imageFileName") String imageFileName,
							@RequestParam("articleNO") String articleNO,
						HttpServletResponse response) throws Exception{
		OutputStream out = response.getOutputStream();
		String downFile = ARTICLE_IMAGE_REPO + "\\" + articleNO + "\\" + imageFileName;
		File file = new File(downFile);
		
		response.setHeader("Cache-Control", "no-cache");
		response.addHeader("Content-disposition", "attachment; fileName=" + imageFileName);
		FileInputStream in = new FileInputStream(file);
		byte[] buffer = new byte[1024*8];
		while(true) {
			int count = in.read(buffer);
			if(count == -1)
				break;
			out.write(buffer, 0, count);
		}
		in.close();
		out.close();
	}
}
