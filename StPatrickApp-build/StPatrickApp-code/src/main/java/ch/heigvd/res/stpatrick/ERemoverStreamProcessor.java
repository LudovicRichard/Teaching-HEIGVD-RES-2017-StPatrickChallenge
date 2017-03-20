package ch.heigvd.res.stpatrick;

import java.io.*;

/**
 * Created by Ludovic on 20.03.2017.
 */
public class ERemoverStreamProcessor implements IStreamProcessor{

    @Override
    public void process(Reader in, Writer out) throws IOException {
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);
        int c = 0;
        while (c != -1) {
            c = br.read();
            if (c != -1 && c != 'e' && c != 'E')
                bw.write(c);
        }
        bw.flush();
    }

}