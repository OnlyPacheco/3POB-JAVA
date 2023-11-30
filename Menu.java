import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Menu {

   
    private ArrayList<Cliente> clientes;
    private ArrayList<Quarto> quartos;
    private ArrayList<Cama> camas;
    private ArrayList<reserva> reservas;

    public Menu() {
        // Inicializar listas anteriores
        clientes = new ArrayList<>();
        quartos = new ArrayList<>();
        camas = new ArrayList<>();
        reservas = new ArrayList<>();
    }

    public void exibirMenuPrincipal() {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("------ Menu Principal ------");
            System.out.println("1. Menu Cliente");
            System.out.println("2. Menu Quarto");
            System.out.println("3. Menu Cama");
            System.out.println("4. Menu Reserva");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    menuCliente( scanner);
                    break;
                case 2:
                    menuQuarto(scanner );
                    break;
                case 3:
                    menuCama(scanner);
                    break;
                case 4:
                    menuReserva(scanner);
                    break;
                case 5:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (escolha != 5);
    }

    public  void menuCliente( Scanner scanner ) {
       
        int escolha;
        
  
      

        do {
            System.out.println("------ Menu Cliente ------");
            System.out.println("1. Incluir Cliente");
            System.out.println("2. Alterar Cliente");
            System.out.println("3. Excluir Cliente");
            System.out.println("4. Listar Cliente");
            System.out.println("5. Voltar");

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                
                case 1:
                    
                    incluirCliente(clientes , scanner);
                
                  break;
                case 2:                
                    System.out.print("Informe o ID do cliente a ser alterado: ");
                    scanner.nextLine();
                    String idalterar = scanner.nextLine();
                    alterarCliente(clientes , idalterar , scanner);
                    break;
                case 3:
                    
                    System.out.print("Informe o ID do cliente a ser excluido: ");
                    scanner.nextLine();
                
                    String idexcluir = scanner.nextLine();
                    excluirCliente(clientes , idexcluir);
                    break;
                case 4:
                    
                    System.out.print("Informe o ID do cliente a ser listado: ");
                    scanner.nextLine();
                
                    String idlistar = scanner.nextLine();
                    listarCliente(clientes , idlistar);
                    break;
                
                case 5:
                    System.out.println("Voltando ao Menu Principal");
                    break;
                
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (escolha != 5);
    }

   public static void incluirCliente(ArrayList<Cliente> clientes , Scanner scanner) 
  {

        
        System.out.print("ID do Cliente : ");
        scanner.nextLine();
        String id = scanner.nextLine();

        // Verificando se o ID já existe na lista de clientes
        for (Cliente c : clientes) {
            if (c.getid().equals(id)) {
                System.out.println("O ID já está em uso, escolha um ID diferente.");
                return; 
            }
        }

       // Validando o id inserido
       if (!id.matches("\\d+")) {
           System.out.println("O id deve conter apenas números.");
           return;
       }

         System.out.print("Nome do Cliente : ");
         String nome = scanner.nextLine();

         // Validando o nome inserido
         if (nome.split(" ").length < 2 || !nome.matches("^[A-Za-z ]+$")) {
             System.out.println("O nome do cliente deve conter pelo menos Nome e Sobrenome e consistir apenas em letras e espaços.");
             return;
         }


         System.out.print("CPF do Cliente eh: ");
         String cpf = scanner.nextLine();

           // Validando o CPF inserido
           if (cpf.length() != 11 || !cpf.matches("\\d+")) 
           {
               System.out.println("O CPF deve conter 11 números.");
                   return;
           }
     
           System.out.print("Insira a Data de nascimento do Cliente no formato (DD/MM/YYYY): ");
           String dataNascimentoStr = scanner.nextLine();
           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
           LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);
      
           // Calculando a idade atualizada do Cliente
           LocalDate hoje = LocalDate.now();
           int idade = hoje.getYear() - dataNascimento.getYear();
           if (dataNascimento.plusYears(idade).isAfter(hoje)) {
               idade--;
           }
      
           // Verificando se o cliente tem pelo menos a idade mínima de 18 anos
           if (idade < 18) {
               System.out.println("O cliente deve ter no mínimo 18 anos.");
               return;
           }
      
           

         System.out.print("Codigo postal do cliente eh: ");
         String postalCode = scanner.nextLine();

        // Validando o postalCode inserido
         if (postalCode.length() != 8 || !postalCode.matches("\\d+")) {
             System.out.println("O postalCode deve conter 8 números.");
             return;
         }
     
         
         System.out.print("Pais do cliente eh: ");
         String pais = scanner.nextLine();

         // Validando o Pais inserido
         if (!nome.matches("^[A-Za-z ]+$"))
         {
             System.out.println("O pais inserido deve consistir apenas em letras e espaços.");
             return;
         }

         System.out.print("Passaporte do cliente eh: ");
         String Passaporte = scanner.nextLine();

         // Validando o Passaporte inserido
          if (Passaporte.length() != 8 ) 
          {
              System.out.println("O Passaporte deve conter 8 digitos.");
                  return;
          }


         System.out.print("Email do cliente eh: ");
         String email = scanner.nextLine();

     
         // Adicionando o cliente ao array de lista
         Cliente cliente= new Cliente(id,nome,cpf,dataNascimento,postalCode,pais,Passaporte,email);
         clientes.add(cliente);
         System.out.println("Cliente incluído com sucesso!");
     }


    public static void alterarCliente(ArrayList<Cliente> clientes , String id , Scanner scanner) 
     {

       

       excluirCliente(clientes,id);
       incluirCliente(clientes ,scanner);
       
   }


      public static void excluirCliente(ArrayList<Cliente> clientes, String id) 
  {

          for (int i = 0; i < clientes.size(); i++) 
          {
              if (clientes.get(i).getid().equals(id)) 
              {
                  clientes.remove(i);
                  System.out.println("Cliente excluído com sucesso!");
                  return;
              }
          }
          System.out.println("Cliente não foi encontrado.");
      }
     
 

      public static void listarCliente(ArrayList<Cliente> clientes, String id) {

          for (Cliente cliente : clientes) 
          {
              if (cliente.getid().equals(id)) 
              {
                  System.out.println("Cliente encontrado:");
                  System.out.println("Id: " + cliente.getid());
                  System.out.println("Nome: " + cliente.getnome());
                  System.out.println("CPF: " + cliente.cpf());
                  System.out.println("Data de Nascimento: " + cliente.dataNascimento());
                  System.out.println("Postal Code: " + cliente.postalCode());
                  System.out.println("Pais: " + cliente.pais());
                  System.out.println("Passaporte: " + cliente.Passaporte());
                  System.out.println("Email: " + cliente.email());
                  System.out.println();
                  return;
                 
             
              }
          }
          System.out.println("Cliente não foi encontrado.");
      }
      
   



    public void menuQuarto(Scanner scanner) {
      
        int escolha;

        do {
            System.out.println("------ Menu Quarto ------");
            System.out.println("1. Incluir Quarto");
            System.out.println("2. Alterar Quarto");
            System.out.println("3. Excluir Quarto");
            System.out.println("4. Listar Quarto");
            System.out.println("5. Voltar");

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    incluirQuarto(quartos, scanner);
                    break;
                case 2:
                    alterarQuarto(quartos, scanner);
                    break;
                case 3:
                    excluirQuarto(quartos, scanner);
                    break;
                case 4:
                    System.out.print("Informe o ID do Quarto a ser listado: ");
                    scanner.nextLine();
                     String idlistar = scanner.nextLine();
                    listarQuarto(quartos, idlistar);
                    break;
                case 5:
                    System.out.println("Voltando ao Menu Principal");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (escolha != 5);
    }

  private void incluirQuarto(ArrayList<Quarto> quartos, Scanner scanner) 
  {
      System.out.println("------ Incluir Quarto ------");
      System.out.print("ID do quarto: ");
      String id = scanner.next();

      // Verificando se o ID já existe na lista de Quartos
      for (Quarto q : quartos) 
      {
          if (q.id().equals(id)) 
          {
              System.out.println("O ID já está em uso, escolha um ID diferente.");
              return; 
          }
      }

      // Validando o id inserido
       if (!id.matches("\\d+")) 
       {
           System.out.println("O id deve conter apenas números.");
           return;
       }

      System.out.print("Nome do quarto: ");
      String nomeQuarto = scanner.next();

    
      System.out.print("Quantidade de camas: ");
      int qtdeCamas = scanner.nextInt();
    
      System.out.print("Tem banheiro (true/false): ");
      boolean temBanheiro = scanner.nextBoolean();
    
      System.out.print("Descrição do quarto: ");
      String descricao = scanner.next();
    
      Quarto novoQuarto = new Quarto(id, nomeQuarto, qtdeCamas, temBanheiro, descricao);
      quartos.add(novoQuarto);
    
      System.out.println("Quarto incluído com sucesso!");
  }
  
  private void alterarQuarto(ArrayList<Quarto> quartos, Scanner scanner) 
  
  {
      System.out.println("------ Alterar Quarto ------");
      System.out.print("ID do quarto a ser alterado: ");
    
      String id = scanner.next();
      for (Quarto quarto : quartos) 
      {
          if (quarto.id().equals(id)) 
          {
               
            System.out.print("Novo nome do quarto: ");
            String novoNome = scanner.next();
            quarto.setnomeQuarto(novoNome);
            
            System.out.print("Nova quantidade de camas: ");
            int novaQtdeCamas = scanner.nextInt();
            quarto.setqtdeCamas(novaQtdeCamas);
            
            System.out.print("Tem banheiro (true/false): ");
            boolean temBanheiro = scanner.nextBoolean();
            quarto.settemBanheiro(temBanheiro);
            
            System.out.print("Nova descrição do quarto: ");
            String novaDescricao = scanner.next();
            quarto.setdescricao(novaDescricao);
            
            System.out.println("Quarto alterado com sucesso!");
            return;
          }
      }
      System.out.println("Quarto não encontrado.");
  }
  
  private void excluirQuarto(ArrayList<Quarto> quartos, Scanner scanner) 
  {
      System.out.println("------ Excluir Quarto ------");
      System.out.print("ID do quarto a ser excluído: ");
      String id = scanner.next();
      for (Quarto quarto : quartos) {
          if (quarto.id().equals(id)) {
              quartos.remove(quarto);
              System.out.println("Quarto excluído com sucesso!");
              return;
          }
      }
      System.out.println("Quarto não encontrado.");
  }
  
  private void listarQuarto(ArrayList<Quarto> quartos, String id) 
  {
      System.out.println("------ Listar Quarto ------");
      for (Quarto quarto : quartos) {
      if (quarto.id().equals(id))     {
          System.out.println("Quarto encontrado:");
          System.out.println("ID: " + quarto.id());
          System.out.println("Nome: " + quarto.nomeQuarto());
          System.out.println("Quantidade de camas: " + quarto.qtdeCamas());
          System.out.println("Tem banheiro: " + quarto.temBanheiro());
          System.out.println("Descrição: " + quarto.descricao());
          return;
      }

       
  }
       System.out.println("Quarto não foi encontrado.");
    
  }


   private void menuCama(Scanner scanner) {
     //Scanner scanner = new Scanner(System.in);
     int escolha;

     do {
         System.out.println("------ Menu Cama ------");
         System.out.println("1. Incluir Cama");
         System.out.println("2. Alterar Cama");
         System.out.println("3. Excluir Cama");
         System.out.println("4. Listar Cama");
         System.out.println("5. Voltar");

         System.out.print("Escolha uma opção: ");
         escolha = scanner.nextInt();

         switch (escolha) 
         {
             case 1:
                 incluirCama( camas , scanner);
                 break;
             case 2:
                 alterarCama( camas , scanner);
                 break;
             case 3:
                 excluirCama(camas , scanner);
                 break;
             case 4:
                 System.out.print("Informe o ID da cama a ser listada: ");
                 scanner.nextLine();
                 String idlistar = scanner.nextLine();
                 listarCama(camas , idlistar);
                 break;
             case 5:
                 System.out.println("Voltando ao Menu Principal");
                 break;
             default:
                 System.out.println("Opção inválida, tente novamente.");
         }
       
     } while (escolha != 5);
   }

  private void incluirCama(ArrayList<Cama> camas, Scanner scanner) 
  {
      System.out.println("------ Incluir Cama ------");
      System.out.print("ID da cama: ");
      String id = scanner.next();

      // Verificando se o ID já existe na lista de Camas
      for (Cama c : camas) {
          if (c.id().equals(id)) 
          {
              System.out.println("O ID já está em uso, escolha um ID diferente.");
              return; 
          }
      }

      // Validando o id inserido
       if (!id.matches("\\d+")) 
       {
           System.out.println("O id deve conter apenas números.");
           return;
       }

      System.out.print("Código da cama: ");
      String codigoCama = scanner.next();

      // Validando o codigo
       if (!codigoCama.matches("\\d+")) 
       {
           System.out.println("O codigo deve conter apenas números.");
           return;
       }

    
      System.out.print("É beliche (true/false): ");
      boolean ehBeliche = scanner.nextBoolean();
    
      System.out.print("Posição da cama: ");
      String posicao = scanner.next();

      // Validando o nome inserido
       if (!posicao.matches("^[A-Za-z ]+$")) 
       {
           System.out.println("A posicao deve  consistir apenas em letras e espaços.");
           return;
       }
      
    
      System.out.print("Descrição da cama: ");
      String descricao = scanner.next();
    
      Cama novaCama = new Cama(id, codigoCama, ehBeliche, posicao, descricao);
      camas.add(novaCama);
    
      System.out.println("Cama incluída com sucesso!");
  }
  
  private void alterarCama(ArrayList<Cama> camas, Scanner scanner) 
  {
      System.out.println("------ Alterar Cama ------");
      System.out.print("ID da cama a ser alterada: ");
      String id = scanner.next();
    
      for (Cama cama : camas) 
      {
          if (cama.id().equals(id))
          {
              System.out.print("Novo código da cama: ");
              String novoCodigoCama = scanner.next();
              cama.setCodigoCama(novoCodigoCama);

              System.out.print("É beliche (true/false): ");
              boolean ehBeliche = scanner.nextBoolean();
              cama.setEhBeliche(ehBeliche);

              System.out.print("Descrição da cama: ");
              String descricao = scanner.next();
              cama.setDescricao(descricao);
            
              System.out.print("Nova posição da cama: ");
              String novaPosicao = scanner.next();
              cama.setPosicao(novaPosicao);
            
              System.out.println("Cama alterada com sucesso!");
              return;
          }
      }
      System.out.println("Cama não encontrada.");
  }
  
  private void excluirCama(ArrayList<Cama> camas, Scanner scanner) 
  {
      System.out.println("------ Excluir Cama ------");
      System.out.print("ID da cama a ser excluída: ");
      String id = scanner.next();
    
      for (Cama cama : camas) 
      {
        
          if (cama.id().equals(id)) 
          {
              camas.remove(cama);
              System.out.println("Cama excluída com sucesso!");
              return;
          }
      }
    
      System.out.println("Cama não encontrada.");
  }
  private void listarCama(ArrayList<Cama> camas , String id) {
    
      System.out.println("------ Listar Camas ------");
    
      for (Cama cama : camas)  
      {
        if (cama.id().equals(id)) 
        {
          System.out.println("Cama encontrada:");
          System.out.println("ID: " + cama.id());
          System.out.println("Código da cama: " + cama.codigoCama());
          System.out.println("É beliche: " + cama.ehBeliche());
          System.out.println("Posição: " + cama.posicao());
          System.out.println("Descrição: " + cama.descricao());
          return;
        }
        
      }
       System.out.println("Cama não foi encontrada:");
  }


   public void menuReserva(Scanner scanner) 
  {
     //Scanner scanner = new Scanner(System.in);
     int escolha;

     do {
         System.out.println("------ Menu Reserva ------");
         System.out.println("1. Incluir Reserva");
         System.out.println("2. Alterar Reserva");
         System.out.println("3. Excluir Reserva");
         System.out.println("4. Listar Reserva");
         System.out.println("5. Voltar");

         System.out.print("Escolha uma opção: ");
         escolha = scanner.nextInt();

         switch (escolha) {
             case 1:
                 incluirReserva(clientes , quartos , camas , scanner);
                 break;
             case 2:
                 alterarReserva(reservas, clientes , quartos , camas , scanner);
                 break;
             case 3:
                 excluirReserva(reservas, scanner);
                 break;
             case 4:

                 System.out.print("Informe o ID da Reserva a ser listada:");
                 scanner.nextLine();
                 String idlistar = scanner.nextLine();
                 listarReserva(clientes , quartos , camas , scanner);
                break;
             case 5:
                 System.out.println("Voltando ao Menu Principal");
                 break;
             default:
                 System.out.println("Opção inválida, tente novamente.");
         }
       
     } while (escolha != 5);
    
   }

  private void incluirReserva(ArrayList<Cliente> clientes, ArrayList<Quarto> quartos, ArrayList<Cama> camas, Scanner scanner) 
  {

      System.out.print("Informe o ID do cliente: ");
      String clienteId = scanner.next();
      Cliente cliente = null;
    
        for (Cliente c : clientes) 
        {
            if (c.getid().equals(clienteId)) 
            {
                cliente = c;
                break;
            }
        }
        if (cliente == null) {
            System.out.println("Cliente não encontrado.");
            return;
        }

      
          System.out.print("Informe o ID do quarto: ");
            String quartoId = scanner.next();  
           Quarto quarto = null;
          for (Quarto q : quartos) 
          {
            
              if (q.id().equals(quartoId))
              {
                  quarto = q;
                  break;
              }
          }
          if (quarto == null) {
              System.out.println("Quarto não encontrado.");
              return;
          }
      
          System.out.print("Informe o ID da Cama: ");
            String camaId = scanner.next();
          Cama cama = null;
          
          for (Cama c : camas) 
          {
              if (c.id().equals(camaId)) 
              {
                  cama = c;
                  break;
              }
          }
          
          if (cama == null) {
              System.out.println("Cama não encontrada.");
              return;
          }
      
          System.out.print("Informe o ID da Reserva: ");
          String idReserva = scanner.next();
      
          System.out.print("Informe a data de entrada: ");
          String dataEntrada = scanner.next();
      
          System.out.print("Informe a data de saída: ");
          String dataSaida = scanner.next();
      
          reserva novaReserva = new reserva(cliente.getid(), quarto.id(), cama.id(), idReserva, dataEntrada, dataSaida);
            
  }

  private void alterarReserva(ArrayList<reserva> reservas, ArrayList<Cliente> clientes, ArrayList<Quarto> quartos, ArrayList<Cama> camas, Scanner scanner) 
  {

      System.out.println("------ Alterar Reserva ------");
      System.out.print("ID da reserva a ser alterada: ");

      String reservaId = scanner.next();
      reserva reserva = null;

      for (reserva r : reservas) 
      {
          if (r.id().equals(reservaId)) 
          {
            reserva = r;
            System.out.print("Nova data de entrada: ");
            String novaDataEntrada = scanner.next();
            reserva.setDataEntrada(novaDataEntrada);
            System.out.print("Nova data de saída: ");
            String novaDataSaida = scanner.next();
            reserva.setDataSaida(novaDataSaida);

            System.out.println("Reserva alterada com sucesso!");

            return;
          }
      }
      System.out.println("Reserva não encontrada.");
  }
  private void excluirReserva(ArrayList<reserva> reservas, Scanner scanner) {

    {
        System.out.println("------ Excluir Reserva ------");
        System.out.print("ID da reserva a ser excluída: ");
        String id = scanner.next();
      
        for (reserva reserva : reservas) 
        {
            if (reserva.id().equals(id)) 
            {
                reservas.remove(reserva);
                System.out.println("Reserva excluída com sucesso!");
                return;
            }
        }
        System.out.println("Quarto não encontrado.");
    }
    
  }

  private void listarReserva(ArrayList<Cliente> clientes, ArrayList<Quarto> quartos, ArrayList<Cama> camas, Scanner scanner) {
    
      System.out.println("------ Listar Reserva ------");
   
      for (reserva r : reservas) {
          System.out.println("ID: " + r.id());
          System.out.println("Quarto: " + r.idQuarto());
          System.out.println("Cama: " + r.idCama());
          System.out.println("Cliente: " + r.idCliente());
          System.out.println("Data de entrada: " + r.dataEntrada());
          System.out.println("Data de saída: " + r.dataSaida());
          System.out.println("------------------");
      }
  }

   
  
    
}
