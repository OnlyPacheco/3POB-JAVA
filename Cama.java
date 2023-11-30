
public class Cama {
private String id;
private String codigoCama;
private boolean ehBeliche;
private String posicao;
private String descricao;

public Cama(String id, String codigoCama, boolean ehBeliche, String posicao, String descricao) 
  {
    this.id = id;
    this.codigoCama = codigoCama;
    this.ehBeliche = ehBeliche;
    this.posicao = posicao;
    this.descricao = descricao;
}

   public Cama() {


       this.id = "";
       this.codigoCama = "";
       this.ehBeliche = false;
       this.posicao = "";
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

   public String codigoCama() 
   {
       return codigoCama;
   }


   public void setCodigoCama( String codigoCama)

   {
       this.codigoCama = codigoCama;
   }

   public Boolean ehBeliche() 
    {
        return ehBeliche;
    }


    public void setEhBeliche( Boolean ehBeliche)

    {
        this.ehBeliche = ehBeliche;
    }

   public String posicao() 
    {
        return posicao;
    }


    public void setPosicao( String posicao)

    {
        this.posicao = posicao;
    }

  public String descricao() 
  {
      return descricao;
  }


  public void setDescricao( String descricao)

  {
      this.descricao = descricao;
  }
  

  
}