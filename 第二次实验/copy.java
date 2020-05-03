package good;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class copy {
	public static void main(String[] args) {
		String src = "D:\\了不起的盖茨比英文.txt"; //原文件目录
		String dest = "D:\\java";  //目标目录
		
		try {
			copyAllFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}	
	
	//拷贝源到某个目录下
	public static void copyAllFile(String src,String dest) throws IOException {
		File srcFile = new File(src);
		if (!srcFile.exists()) {
			System.out.println("源文件不存在...程序终止");
			return;
		}
		File destFile = new File(dest);		
		if(srcFile.isFile()) {
			copyFile(srcFile,destFile);
		}
		if(srcFile.isDirectory()) {		
			copyDirtory(srcFile,destFile);
		}	
	}
	
	//拷贝源文件夹所有文件到指定目录下，并返回拷贝信息
	public static void copyDirtory(File srcDir, File destDir) throws IOException {
		//在目标目录下创建同源目录名的目录
		File dir = new File(destDir.getPath() + File.separator + srcDir.getName());
		dir.mkdirs();
		destDir = dir;
		long t1 = System.currentTimeMillis();
		int fileNums = copyDirContent(srcDir, destDir);
		long t2 = System.currentTimeMillis();
		System.out.println("耗时："+(t2-t1)+" 毫秒，共拷贝"+fileNums+"个文件，拷贝文件夹["+srcDir.getAbsolutePath()+"] 到 ["+destDir.getAbsolutePath()+"]已完成...");
	}
	
	//遍历源目录并拷贝文件到目标目录相应位置下
	public static int copyDirContent(File srcDir, File destDir) throws IOException {
		int fileNums = 0;
		if(srcDir.isDirectory()) {
			File[] files = srcDir.listFiles();			
			for (File file : files) {
				File destFile = new File(destDir.getPath() + File.separator + file.getName());
				if (file.isDirectory()) {
					copyDirContent(new File(file.getPath()), destFile);
				}
				if(file.isFile()) {			
					fileNums++;
					copyFile(new File(file.getPath()),destDir);
				}
			}
		}		
		return fileNums;
	}
	
	//拷贝源文件到指定目录下，并返回拷贝信息
	public static void copyFile(File srcFile,File destFile) throws IOException {
		destFile = checkFile(srcFile, destFile);
		long t1 = System.currentTimeMillis();
		copyFileContent(srcFile,destFile);
		long t2 = System.currentTimeMillis();
		System.out.println("耗时："+(t2-t1)+" 毫秒，拷贝文件["+srcFile.getAbsolutePath()+"] 到 ["+destFile.getAbsolutePath()+"]已完成...");
	}
	
	//将源文件内容拷贝到目标文件内容里
	public static void copyFileContent(File src, File dest) {
 
		InputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			//执行拷贝操作（读一次，放一次）
			byte[] bytes = new byte[1024*(src.length()>>10 > 1024 ? 1024 : 1)];
			int length = -1;
			while ((length = is.read(bytes)) != -1) {
				os.write(bytes, 0, length);
			}
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//分别关闭，先打开的后关闭，后打开的先关闭
			try {
				if (os != null) {
					os.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (os != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//创建目标目录，并在该目标目录下创建与源文件名的相同文件

	public static File checkFile(File srcFile ,File destFile) throws IOException {
		//创建目录
		if (!destFile.exists()) {
			destFile.mkdirs();			
		}
		//创建目标文件
		File newFile = new File(destFile.getPath()+File.separator+srcFile.getName());
		newFile.createNewFile();
		return newFile;
	}

}
