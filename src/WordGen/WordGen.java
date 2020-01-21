package wordGen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WordGen {

	public static void main(String[] args) throws IOException {
		
		String word = "word ";
		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		if (args.length > 0) {
			try {
				count = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.err.println("Parameternek int-nek kell lennie");
				System.exit(1);
			}
		}
		
		for (int i = 0; i < count; i++) {
			sb.append(word);
		}
		
		FileWriter writer = null;
		BufferedWriter bw = null;
		try {
			writer = new FileWriter(new File("output.txt"));
			bw = new BufferedWriter(writer);
			bw.write(sb.toString());
			bw.flush();
		} finally {
			try {
				if (null != writer) {
					writer.close();
				}
				if (null != bw) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
