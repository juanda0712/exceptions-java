package finallyAndPercolate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
* when file is not found on specified path (C:/PruebaLeerArchivoExcepcion)
* the exception can also be raised when file is inaccessible
* */
public class ReadFileException {
    public static void main(String[] args) {
        File fileExample = new File("C:/path/PruebaLeerArchivoExcepcion.txt");
        FileInputStream reader = null;
        //Uso del try-catch
        try{
            reader = new FileInputStream(fileExample);

            /*
            * reads the next byte of the data from the the input stream
            * and returns int in the range of 0 to 255. If no byte is available
            *  because the end of the stream has been reached, the returned value is -1.
            * */
            while (reader.read() != -1){
                System.out.println(reader.read());
            }
            //exception when the file is not found
        }catch (FileNotFoundException fileEx){
            /*printStackTrace()
            * prints the throwable with details like the line number and class
            * name where the exception occurred.*/
            fileEx.printStackTrace();

            /*this exception occurs when trying to read a file that does not exist,
            is corrupt or does not have read permission
             */
        }catch (IOException IOEx){
            IOEx.printStackTrace();
        }finally { // clean up code
            try{
                reader.close();
            }catch (IOException IOEx){
                IOEx.printStackTrace();
            }
        }
    }
}
