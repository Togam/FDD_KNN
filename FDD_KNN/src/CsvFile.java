import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvFile implements CsvFileInterface {

	public final static char SEPARATOR = ',';

	private File file;
	private List<String> lines;
	private List<String[]> data;

	public CsvFile(File file) throws IOException {
		this.file = file;
		// Init
		init();
	}

	private void init() throws IOException {
		lines = CsvFileHelper.readFile(file);

		data = new ArrayList<String[]>(lines.size());
		String sep = new Character(SEPARATOR).toString();
		for (String line : lines) {
			String[] oneData = line.split(sep);
			data.add(oneData);
		}
	}

	public List<String[]> getData() {
		return data;
	}

	public File getFile() {
		return file;
	}

}