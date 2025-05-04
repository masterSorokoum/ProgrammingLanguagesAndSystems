/*
    Упражнение 5.2.
    Класс очереди для символов.
    Sorokoumov
*/
class Queue {
    private char[] q; 
    private int putloc, getloc; 

    Queue(int size) {
        q = new char[size]; 
        putloc = getloc = 0;
    }

    void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь переполнена.");
            return;
        }
        q[putloc++] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0; 
        }
        return q[getloc++];
    }
}
