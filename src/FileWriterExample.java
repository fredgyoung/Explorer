/*
    Using https://docs.oracle.com/javase/7/docs/api/

    Java FileWriter class is a part of java.io package.
    FileWriter is a subclass of java.io.OutputStreamWriter class.
    FileWriter is meant for writing streams of characters.
    FileWriter is used to write to character files. Its write() methods allow you to write character(s)
    or strings to a file.
    FileWriters are usually wrapped by higher-level Writer objects, such as BufferedWriter or PrintWriter,
    which provide better performance and higher-level, more flexible methods to write data.

    Convenience class for writing character files. The constructors of this class assume that the default
    character encoding and the default byte-buffer size are acceptable. To specify these values yourself,
    construct an OutputStreamWriter on a FileOutputStream.
    Whether a file is available or may be created depends upon the underlying platform. Some platforms,
    in particular, allow a file to be opened for writing by only one FileWriter (or other file-writing object)
    at a time. In such situations the constructors in this class will fail if the file involved is already open.
    FileWriter is meant for writing streams of characters. For writing streams of raw bytes, consider using
    a FileOutputStream.
 */

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

    public static void main(String [] args) {

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("./txt/file.txt");
            //inherited method from java.io.OutputStreamWriter

            // public void write(String str) throws IOException
            fileWriter.write("Hello, FileWriter!\n");

            // public void write(String str, int off, int len) throws IOException
            fileWriter.write("abcdefghijklmnopqrstuvwxyz", 5, 12);

            // public void write(int c) throws IOException
            fileWriter.write(66);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.flush();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
