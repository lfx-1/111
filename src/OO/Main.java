package OO;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        input.input("C:\\Users\\dad\\Desktop\\软件体系结构\\input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("C:\\Users\\dad\\Desktop\\软件体系结构\\output.txt");

    }
}
