import java.io.BufferedWriter;
import java.io.IOException; 
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{ //throws IOException -> 입출력 예외 처리
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Hello World!");
        bw.close(); //bw.write()의 내용 실제 출력
    }
}