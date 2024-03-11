import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class LogFileSearch {
    public LogFileSearch() {
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java LogFileSearch <logFilePath> <regex>");
        } else {
            String logFilePath = args[0];
            String regex = args[1];

            try {
                BufferedReader reader = new BufferedReader(new FileReader(logFilePath));

                try {
                    Pattern pattern = Pattern.compile(regex);

                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (pattern.matcher(line).find()) {
                            System.out.println(line);
                        }
                    }
                } catch (Throwable var7) {
                    try {
                        reader.close();
                    } catch (Throwable var6) {
                        var7.addSuppressed(var6);
                    }

                    throw var7;
                }

                reader.close();
            } catch (IOException var8) {
                System.err.println("Error reading the log file: " + var8.getMessage());
            }

        }
    }
}
