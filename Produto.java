
public class Produto 
  {
    private String idProduto;
    private String nome;
    private double valor;

    public Produto(String idProduto, String nome ,  double valor) 
    {
        this.idProduto = idProduto;
        this.nome = nome;
        this.valor = valor;

    }

     public Produto() {


        this.idProduto = "";
        this.nome = "";
        this.valor = 0;
    }

    // Getters e setters

    public double getValor() 
    {
        return valor;
    }


    public void setValor( double valor)

    {
        this.valor = valor;
    }

        public String getidProduto() 
        {
            return idProduto;
        }

        public void setidProduto(String idProduto) 
        {
            this.idProduto = idProduto;
        }

        public String getnome() 
        {
            return nome;
        }

        public void setnome(String nome) 
        {
            this.nome = nome;
        }



    }

