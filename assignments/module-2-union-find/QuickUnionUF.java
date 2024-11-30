import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickUnionUF {
    int id[];

    public QuickUnionUF(int N) {
        id = new int[N];
        for (int i=0; i<N; i++) {
            id[i] = i;
        }
    }

    public int root(int o) {
        while (o != id[o]) o = id[o];
        return o;
    }

    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
    
    // client
    // How to run: run this Java file and enter input from 'tinyUF.txt' line
    // by line. Whenever there's new connection made, that pair is printed &
    // no output when the connection is already present.
    public static void main(String args[]) {
        int N = StdIn.readInt();
        QuickFindUF quf = new QuickFindUF(N);

        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (!quf.connected(p, q)) {
                quf.union(p, q);
                StdOut.println(p + "----" + q);
            }
        }
    }
}
