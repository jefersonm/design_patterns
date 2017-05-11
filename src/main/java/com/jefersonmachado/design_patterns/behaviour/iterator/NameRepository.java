package com.jefersonmachado.design_patterns.behaviour.iterator;

public class NameRepository implements Container {
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if(this.hasNext())
                return names[index++];

            return "No more values";
        }
    }

}