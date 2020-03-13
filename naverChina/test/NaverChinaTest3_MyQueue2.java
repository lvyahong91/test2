package naverChina.test;

import java.util.LinkedList;

public class NaverChinaTest3_MyQueue2<E> {
    private LinkedList<E> list=new LinkedList<E>();
    private int size=0;
    public synchronized void push(E e){
        list.addLast(e);
        size++;
    }

    public synchronized E pop(){
        size--;
        return list.removeFirst();
    }

    public synchronized boolean empty(){
        return size==0;
    }

    public synchronized int size(){
        return  size;
    }

    public static void main(String[] args) {
        NaverChinaTest3_MyQueue2 q=new NaverChinaTest3_MyQueue2<Integer>();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println("队列长度为："+q.size());
        System.out.println("队列首元素为："+q.pop());
        System.out.println("队列首元素为："+q.pop());
    }
}
