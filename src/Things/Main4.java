package Things;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main4 {
    public static void main4() throws IOException {
        //创建主题
        KWICSubject kwicSubject = new KWICSubject();
        //创建观察者
        Input input = new Input("C:\\Users\\dad\\Desktop\\软件体系结构\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        Output output = new Output(alphabetizer.getKwicList(), "C:\\Users\\dad\\Desktop\\软件体系结构\\output.txt");

        // 将观察者加入主题
        kwicSubject.addObserver(input);
        kwicSubject.addObserver(shift);
        kwicSubject.addObserver(alphabetizer);
        kwicSubject.addObserver(output);
        // 逐步调用各个观察者
        kwicSubject.startKWIC();


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
