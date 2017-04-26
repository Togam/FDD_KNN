package csv_access;
import java.io.File;
import java.util.List;

/**
 * @author six descamps lalande
 *
 */
public interface CsvFileInterface {

	File getFile();

	List<String[]> getData();
}