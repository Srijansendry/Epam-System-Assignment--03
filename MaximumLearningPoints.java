import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();

        long previousTwo = 0;
        long previousOne = 0;

        for (int i = 0; i < n; i++) {
            int points = fs.nextInt();

            long selectCurrent = previousTwo + points;
            long skipCurrent = previousOne;
            long current = Math.max(selectCurrent, skipCurrent);

            previousTwo = previousOne;
            previousOne = current;
        }

        System.out.println(previousOne);
    }

    static class FastScanner {
        private final InputStream input;
        private final byte[] buffer = new byte[1 << 16];
        private int pointer = 0;
        private int length = 0;

        FastScanner(InputStream input) {
            this.input = input;
        }

        private int read() throws IOException {
            if (pointer >= length) {
                length = input.read(buffer);
                pointer = 0;

                if (length == -1) {
                    return -1;
                }
            }

            return buffer[pointer++];
        }

        int nextInt() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ' && c != -1);

            int value = 0;

            while (c > ' ') {
                value = value * 10 + (c - '0');
                c = read();
            }

            return value;
        }
    }
}