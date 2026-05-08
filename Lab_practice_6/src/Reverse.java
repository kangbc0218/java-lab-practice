import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Reverse {

	public static void main(String[] args) throws IOException {
		ArrayList<String> data = new ArrayList<>();
		
		FileInputStream fis = new FileInputStream("input.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String line;
		while((line = br.readLine()) != null) {
			data.add(line);
		}
		
		br.close();
		isr.close();
		fis.close();

		FileOutputStream fos = new FileOutputStream("output.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);

		for(int i=data.size()-1; i>=0; i--) {
			bw.write(data.get(i));
			bw.newLine();
		}
		bw.flush();
		bw.close();
		osw.close();
		fos.close();

	}

}
