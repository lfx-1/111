package pipe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main3 {
    public static void main3() throws IOException {
        File inFile = new File("C:\\Users\\dad\\Desktop\\软件体系结构\\input.txt");
        File outFile = new File("C:\\Users\\dad\\Desktop\\软件体系结构\\output.txt");
        Pipe pipe1 = new Pipe();
        Pipe pipe2 = new Pipe();
        Pipe pipe3 = new Pipe();
        Input input = new Input(inFile, pipe1);
        Shift shift = new Shift(pipe1, pipe2);
        Alphabetizer alphabetizer  = new Alphabetizer(pipe2, pipe3);
        Output output = new Output(outFile,pipe3);
        input.transform();
        shift.transform();
        alphabetizer.transform();
        output.transform();


        System.out.println("input.txt内容：");
        String s,a;
        FileReader f1=new FileReader("C:\\Users\\dad\\Desktop\\软件体系结构\\input.txt");
        BufferedReader f2=new BufferedReader(f1);
        while ((s=f2.readLine())!=null){
            System.out.println(s);
        }

        f2.close();
        f1.close();

        System.out.println("output.txt内容：");
        FileReader f3=new FileReader("C:\\Users\\dad\\Desktop\\软件体系结构\\output.txt");
        BufferedReader f4=new BufferedReader(f3);
        while ((a=f4.readLine())!=null){
            System.out.println(a);
        }

        f4.close();
        f3.close();

    }
}
