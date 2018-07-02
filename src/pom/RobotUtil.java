package pom;
import java.io.File;


public class RobotUtil  {
	public String getLatestFileName(String dirPath) {
		File lastModified = null;
		File dir = new File(dirPath);
		File[] files = dir.listFiles();
		if (files != null && files.length > 0) {
			lastModified = files[0];
			for (int i = 1; i < files.length; i++) {
				if (lastModified.lastModified() < files[i].lastModified()) {
					lastModified = files[i];
				}
			}
		}
		return lastModified.getName();
	}
	
}
