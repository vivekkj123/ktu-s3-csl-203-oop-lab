import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;


class ReadWriteFile{
	public static void main (String [] args) throws IOException{
		int ch;
		FileReader fr = new FileReader("sample.txt");
		FileWriter fw = new FileWriter("WritedSample.txt");
		while((ch = fr.read()) != -1){
			fw.write((char) ch);
			System.out.print((char) ch);
		}
		fr.close();
		fw.close();

	}

}
