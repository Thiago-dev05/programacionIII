package pilasColasEjer;

import java.util.ArrayDeque;

public class PanSimilar {
    ArrayDeque<String> pilaPan1;
    ArrayDeque<String> pilaPan2;

    public boolean esPanSimilar(String[] s1, String[] s2) {
        pilaPan1 = new ArrayDeque<>();
        pilaPan2 = new ArrayDeque<>();
        for (int i = 0; i < s1.length; i++) {
            pilaPan1.push(s1[i]);
        }
        for (int i = 0; i < s2.length; i++) {
            pilaPan2.push(s2[i]);
        }
        boolean es = true;
        if (pilaPan1.pollFirst().equals(pilaPan2.pollFirst()) && pilaPan1.pollLast().equals(pilaPan2.pollLast())) {
            es = true;
        } else
            es = false;
        

        return es;
    }
}
