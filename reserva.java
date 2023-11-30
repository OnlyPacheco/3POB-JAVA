import java.util.Date;

public class reserva {
    private String id;
    private String idQuarto;
    private String idCama;
    private String idCliente;
    private String dataEntrada;
    private String dataSaida;

    public reserva(String id, String idQuarto, String idCama, String idCliente, String dataEntrada, String dataSaida) 
  {
        this.id = id;
        this.idQuarto = idQuarto;
        this.idCama = idCama;
        this.idCliente = idCliente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public reserva() {


        this.id = "";
        this.idQuarto = "";
        this.idCama = "";
        this.idCliente = "";
        this.dataEntrada = "";
        this.dataSaida = "";
       
    }

    // Getters e setters

    public String id() 
    {
        return id;
    }


    public void setId( String id)

    {
        this.id = id;
    }

   public String idQuarto() 
   {
       return idQuarto;
   }


   public void setIdQuarto( String idQuarto)

   {
       this.idQuarto = idQuarto;
   }

    public String idCama() 
    {
        return idCama;
    }


    public void setIdCama( String idCama)

    {
        this.idCama = idCama;
    }

    public String idCliente() 
    {
        return idCliente;
    }


    public void setIdCliente( String idCliente)

    {
        this.idCliente = idCliente;
    }

    public String dataEntrada() 
    {
        return dataEntrada;
    }


    public void setDataEntrada( String dataEntrada)

    {
        this.dataEntrada = dataEntrada;
    }

  public String dataSaida() 
  {
      return dataSaida;
  }


  public void setDataSaida( String dataSaida)

  {
      this.dataSaida = dataSaida;
  }


   




  
}