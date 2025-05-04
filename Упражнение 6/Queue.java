/*
   Упражнение 6.1.
   Усовершенствованный класс очереди для символов,
   использующий private для инкапсуляции данных.
   Sorokoumov
*/
class Queue {
    private char[] q;
    private int putloc, getloc;

    public Queue(int size) {
        q = new char[size]; 
        putloc = getloc = 0;
    }

    public void put(char ch) {
        if (putloc == q.length) {
            System.out.println(" - Очередь переполнена.");
            return;
        }
        q[putloc++] = ch;
    }

    public char get() {
        if (getloc == putloc) {
            System.out.println(" - Очередь пуста.");
            return (char) 0;
        }
        return q[getloc++];
    }
}
