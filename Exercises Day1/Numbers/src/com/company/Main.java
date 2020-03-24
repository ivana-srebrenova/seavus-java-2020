package com.company;
import java.util.*;
class SLLNode<E> {
    protected E element;
    protected SLLNode<E> succ;

    public SLLNode(E elem, SLLNode<E> succ) {
        this.element = elem;
        this.succ = succ;
    }

    @Override
    public String toString() {
        return element.toString();
    }
}

class SLL<E> {
    private SLLNode<E> first;

    public SLL() {
        // Construct an empty SLL
        this.first = null;
    }



    @Override
    public String toString() {
        String ret = new String();
        if (first != null) {
            SLLNode<E> tmp = first;
            ret += tmp + "";
            while (tmp.succ != null) {
                tmp = tmp.succ;
                ret += tmp + "";
            }
        } else
            ret = "Prazna lista!!!";
        return ret;
    }

    public void insertFirst(E o) {
        SLLNode<E> ins = new SLLNode<E>(o, first);
        first = ins;
    }

    public void insertLast(E o) {
        if (first != null) {
            SLLNode<E> tmp = first;
            while (tmp.succ != null)
                tmp = tmp.succ;
            SLLNode<E> ins = new SLLNode<E>(o, null);
            tmp.succ = ins;
        } else {
            insertFirst(o);
        }
    }

}
public class Main {

    public static void main(String[] args) {
        // write your code here
        SLL<Integer> list=new SLL<Integer>();
        String str = new Scanner(System.in).nextLine();
        String[] words;
        words = str.substring(1, str.length() - 1).split(" ");

        for (int i = 0; i < words.length; i++) {

            if(words[i].equals("one")) {
                list.insertLast(Integer.parseInt("1"));
            }

            if(words[i].equals("two")) {
                list.insertLast(Integer.parseInt("2"));
            }
            if(words[i].equals("three")) {
                list.insertLast(Integer.parseInt("3"));
            }
            if(words[i].equals("four")) {
                list.insertLast(Integer.parseInt("4"));
            }

            if(words[i].equals("five") ){
                list.insertLast(Integer.parseInt("5"));
            }

            if(words[i].equals("six")) {
                list.insertLast(Integer.parseInt("6"));
            }
            if(words[i].equals("seven")) {
                list.insertLast(Integer.parseInt("7"));
            }
            if(words[i].equals("eight")) {
                list.insertLast(Integer.parseInt("8"));
            }
            if(words[i].equals("nine")) {
                list.insertLast(Integer.parseInt("9"));
            }
            if(words[i].equals("zero")){
                    list.insertLast(Integer.parseInt("0"));

                }
        }
        System.out.println(list);

        }
    }

