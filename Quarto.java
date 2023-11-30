
public class Quarto {
private String id;
private String nomeQuarto;
private int qtdeCamas;
private boolean temBanheiro;
private String descricao;

public Quarto(String id, String nomeQuarto, int qtdeCamas, boolean temBanheiro, String descricao) {
    this.id = id;
    this.nomeQuarto = nomeQuarto;
    this.qtdeCamas = qtdeCamas;
    this.temBanheiro = temBanheiro;
    this.descricao = descricao;
}

    public Quarto() {


        this.id = "";
        this.nomeQuarto = "";
        this.qtdeCamas = 0;
        this.temBanheiro = false;
        this.descricao = "";
        

    }


  
  
  // Getters e Setters

   public String id() 
   {
       return id;
   }


   public void setId( String id)

   {
       this.id = id;
   }

   public String nomeQuarto() 
   {
       return nomeQuarto;
   }


   public void setnomeQuarto( String nomeQuarto)

   {
       this.nomeQuarto = nomeQuarto;
   }

   public int qtdeCamas() 
    {
        return qtdeCamas;
    }


    public void setqtdeCamas( int qtdeCamas)

    {
        this.qtdeCamas = qtdeCamas;
    }

   public Boolean temBanheiro() 
    {
        return temBanheiro;
    }


    public void settemBanheiro( Boolean temBanheiro)

    {
        this.temBanheiro = temBanheiro;
    }

   public String descricao() 
    {
        return descricao;
    }


    public void setdescricao( String descricao)

    {
        this.descricao = descricao;
    }



  
}