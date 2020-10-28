import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

public class QRcode
{

	public static void main(String a[]) throws Exception
	{
      String str="Sandeep Mahadik Is PowerFull Man In World";
	  ByteArrayOutputStream out =QRCode.from(str).to(ImageType.JPG).stream();
	  File f=new File("C:\\Users\\dude\\Desktop\\image\\sandeep.jpg");
	  FileOutputStream fos = new FileOutputStream(f);
	  fos.write(out.toByteArray());
	  fos.flush();
	  
	}
}
























