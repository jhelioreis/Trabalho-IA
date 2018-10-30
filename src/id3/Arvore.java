package id3;

import java.util.Vector;

public class Arvore {

	public double entropy;

    public Vector data; //vetor de intancias de dados
    public int atributoDecomposicao;
    public int valorDecomposicao; 
    public Arvore []filho; //nos filhos
    public Arvore pai; //no pai
    
    public Arvore() {
        data = new Vector();
    }
}
