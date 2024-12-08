package iifes;

public class Item {
    /**
     * Classe com as rotinas do item
     */

    private Produto p;
    private int qtd;

    /**
     * Contrutor da classe Item
     * @param p Produto escolhido para o carrinho
     * @param qtd Quantidade do produto no carrinho
     */
    public Item(Produto p, int qtd) {
        this.p = p;
        this.qtd = qtd;
    }

    /**
     * Define como um objeto de classe se comporta ao ser transformado em String
     * @return String com os dados da classe
     */
    public String toString() {
        return this.p + "(QTD: " + this.qtd + ")";
    }

    /**
     * Retorna o valor total do item (valor do produto * qtd dos itens)
     * @return O valor total do item
     */
    public double valorTotal() {
        return this.p.getValor() * this.qtd;
    }

    /**
     * Retorna o produto que o item se refere
     * @return O produto que o item se refere
     */
    public Produto getProduto() {
        return this.p;
    }

    /**
     * Retorna a quantidade desse item no carrinho
     * @return A quantidade desse item no carrinho
     */
    public int getQtd() {
        return this.qtd;
    }
}
