package by.it.mogonov.jd01_11;

import java.util.*;

public class ListB<T> implements List<T> {

    private T[] elements = (T[]) new Object[]{};
    private int size = 0;

    @Override
    public boolean add(T t) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, (size * 3) / 2 + 1);
        elements[size++] = t;
        return false;
    }

    @Override
    public void add(int index, T element) {
        if (size == elements.length)
            elements = Arrays.copyOf(elements, (size * 3) / 2 + 1);
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;


    }


    @Override
    public boolean remove(Object o) {
        int index = indexOf(o);
        if (index > -1) remove(index);
        return (index > -1);
    }


    @Override
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i]))
                    return i;
            }
            return -1;
        }
        return 0;
    }


    @Override
    public T remove(int index) {
        T del = elements[index];
        System.arraycopy(elements, index + 1, elements, index, size - 1 - index);
        size--;
        return del;

    }


    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {

        }
        return elements[index];
    }


    @Override
    public T set(int index, T e) {
        if (size > 0 && index <= size && index >= 0) {

        }
            T eElem = elements[index];
            elements[index] = (T) e;
            return eElem;
        }



        @Override
        public boolean addAll (Collection < ? extends T > collection){

            boolean modified = false;
            for (T e : collection) if (add(e)) modified = true;
            return modified;
        }


        @Override
        public String toString () {
            StringBuilder sb = new StringBuilder("[");
            String delimiter = "";
            for (int i = 0; i < size; i++) {
                sb.append(delimiter).append(elements[i]);
                delimiter = ", ";
            }
            sb.append("]");
            return sb.toString();
        }


        @Override
        public int size () {
            return 0;
        }

        @Override
        public boolean isEmpty () {
            return false;
        }

        @Override
        public boolean contains (Object o){
            return false;
        }

        @Override
        public Iterator<T> iterator () {
            return null;
        }

        @Override
        public Object[] toArray () {
            return new Object[0];
        }

        @Override
        public <T1 > T1[]toArray(T1[]t1s){
            return null;
        }

        @Override
        public boolean containsAll (Collection < ? > collection){
            return false;
        }


        @Override
        public boolean addAll ( int i, Collection<? extends T > collection){
            return false;
        }

        @Override
        public boolean removeAll (Collection < ? > collection){
            return false;
        }

        @Override
        public boolean retainAll (Collection < ? > collection){
            return false;
        }

        @Override
        public void clear () {

        }

        @Override
        public int lastIndexOf (Object o){
            return 0;
        }

        @Override
        public ListIterator<T> listIterator () {
            return null;
        }

        @Override
        public ListIterator<T> listIterator ( int i){
            return null;
        }

        @Override
        public List<T> subList ( int i, int i1){
            return null;
        }
    }
