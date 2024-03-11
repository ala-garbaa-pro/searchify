# Searchify

Searchify is a Java application packaged into a JAR file designed to search lines in a log file based on a given pattern using regular expressions.

## Usage

To utilize Searchify, follow these steps:

1. Ensure you have Java installed on your system.
2. Download the `searchify.jar` file.
3. Open your terminal or command prompt.
4. Navigate to the directory containing `searchify.jar` and your log file.
5. Execute the following command:

```shell
java -jar searchify.jar <path_to_log_file> <search_pattern>
```

Replace `<path_to_log_file>` with the path to your log file and `<search_pattern>` with the pattern you want to search for in the log file.

### Example:

```shell
java -jar searchify.jar ./example.log classes
```

This command will search for lines containing the pattern "classes" in the `example.log` file and display the matching lines along with their line numbers.

## Output

Searchify outputs the lines from the log file that match the provided pattern along with their corresponding line numbers.

### Example Output:

```plaintext
8327702: [lworld] Update java.lang.Object mention of value classes
9c21d4c: 8326990: [lworld] make value classes a preview feature
```

## Note

- If no matches are found, Searchify will not produce any output.

## Feedback

If you encounter any issues or have suggestions for improvement, please feel free to open an issue on the [GitHub repository](https://github.com/yourusername/searchify).

---
*This project is licensed under the MIT License. See the LICENSE file for details.*