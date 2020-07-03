import java.util.*;
import java.io.*;

public class Main {

    // make it false if Multiple test case is not in the question
    static boolean multipleTC = true;

    // for pre processing if needed
    void pre() throws Exception {
    }

    public static void main(String[] args) throws Exception {

        new Main().run();
    }

    // input output handled here
    private String solve(int tc) throws Exception {
        // take input here

        return "";

    }

    void run() throws Exception {
        // long start_time=System.nanoTime();

        in = new FastReader("in0.txt"); out = new PrintWriter("out0.txt");
        // in = new FastReader(); out = new PrintWriter(System.out);

        StringBuilder print = new StringBuilder("");
        pre();
        int T = (multipleTC) ? ni() : 1;
        for (int t = 1; t <= T; t++) {
            print.append(solve(t)).append("\n");
        }

        p(print);
        // long end_time=System.nanoTime();
        // System.out.println("Running Time in nano sec : "+(end_time-start_time));

        out.flush();
        out.close();
    }

    PrintWriter out;
    FastReader in;

    void p(Object o) {
        out.print(o);
    }

    void pln(Object o) {
        out.println(o);
    }

    void pnf(Object o) {
        out.println(o);
        out.flush();
    }

    String n() throws Exception {
        return in.next();
    }

    String nln() throws Exception {
        return in.nextLine();
    }

    int ni() throws Exception {
        return Integer.parseInt(in.next());
    }

    long nl() throws Exception {
        return Long.parseLong(in.next());
    }

    double nd() throws Exception {
        return Double.parseDouble(in.next());
    }

    class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws Exception {
            br = new BufferedReader(new FileReader(s));
        }

        String next() throws Exception {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new Exception(e.toString());
                }
            }
            return st.nextToken();
        }

        String nextLine() throws Exception {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new Exception(e.toString());
            }
            return str;
        }
    }
}