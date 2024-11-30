import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickFindUF {
    // Choice of data structure, to hold N objects
    private int id[];

    public QuickFindUF(int N) {
        id = new int[N];
        // Objects are numbers here. 
        for(int i=0; i<N; i++){
            id[i] = i;
        }
    }

    // Finding whether 2 objects are connected or what by
    // checking whether p & q are in same component
    // 2 array accesses
    public boolean connected(int p, int q) {
        return (id[p] == id[q]);
    }

    // Method that connects 2 objects
    // Interpretation: p & q are connected iff they have the same id
    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i=0; i<id.length; i++) {
            if (id[i] == pid) id[i] = qid;
        }
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
