
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;


public class RWFile {
	public static void main(String[] args) {
		try {
			
			URL url = new URL("http://www.madore.org/~david/math/padics.pdf");
			URLConnection uc = url.openConnection();
			
			InputStream is = uc.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			
			FileOutputStream fos = new FileOutputStream("new_padics.pdf");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			byte b[] = new byte[100];
			int count = 0;
			while(bis.read(b) != -1){
				bos.write(b);
				count++;
			}
			System.out.println("һ��������"+count+"��");
			bis.close();
			bos.close();
			is.close();
			fos.close();
			System.out.println("�Ѿ�����ˣ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
