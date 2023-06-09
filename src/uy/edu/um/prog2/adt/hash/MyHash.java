package uy.edu.um.prog2.adt.hash;


import uy.edu.um.prog2.adt.hash.exceptions.ErrorControlado;

public interface MyHash<K, V> {
    public void put(K key, V value) throws ErrorControlado;
    public boolean contains(K key);
    public void remove(K clave) throws ErrorControlado;
}