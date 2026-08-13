import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        long budget = fs.nextLong();

        int[] scholarship = new int[n];

        for (int i = 0; i < n; i++) {
            scholarship[i] = fs.nextInt();
        }

        Arrays.sort(scholarship);

        long totalAmount = 0;
        int studentCount = 0;

        for (int amount : scholarship) {
            if (totalAmount + amount <= budget) {
                totalAmount += amount;
                studentCount++;
            } else {
                break;
            }
        }

        System.out.println(studentCount);
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

        long nextLong() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ' && c != -1);

            long value = 0;

            while (c > ' ') {
                value = value * 10 + (c - '0');
                c = read();
            }

            return value;
        }

        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
}