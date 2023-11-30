import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
  
public class Cliente 
  {
    private String id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String postalCode;
    private String pais;
    private String Passaporte;
    private String email;
    
    

    public Cliente(String id, String nome ,  String cpf , LocalDate dataNascimento, String postalCode , String pais , String Passaporte , String email ) 
    {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.postalCode = postalCode;
        this.pais = pais;
        this.Passaporte = Passaporte;
        this.email = email;

    }

     public Cliente() {


        this.id = "";
        this.nome = "";
        this.cpf = "";
        this.dataNascimento = LocalDate.of(2000, 1, 1);
        this.postalCode = "";
        this.pais = "";
        this.Passaporte = "";
        this.email = "";
    }
    
    

    // Getters e setters

    public String cpf() 
    {
        return cpf;
    }


    public void setCpf( String cpf)

    {
        this.cpf = cpf;
    }

    public String postalCode() 
      {
          return postalCode;
      }


      public void setpostalCode( String postalCode)

      {
          this.postalCode = postalCode;
      }

    public String pais() 
    {
        return pais;
    }


    public void setPais( String pais)

    {
        this.pais = pais;
    }


    public String Passaporte() 
    {
        return Passaporte;
    }


    public void setPassaporte( String Passaporte)

    {
        this.Passaporte = Passaporte;
    }

    public String email() 
    {
        return email;
    }


    public void setEmail( String email)

    {
        this.email = email;
    }

    
    
    public LocalDate dataNascimento() 
    {
        return dataNascimento;
    }


    public void setdataNascimento( LocalDate dataNascimento)

    {
        this.dataNascimento = dataNascimento ;
    }

        public String getid() 
        {
            return id;
        }

        public void setid(String id) 
        {
            this.id = id;
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

