package OO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main2() throws IOException {
        Input input = new Input();
        input.input("C:\\Users\\dad\\Desktop\\软件体系结构\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("C:\\Users\\dad\\Desktop\\软件体系结构\\output.txt");


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
