1. Utilizar o spring initializr para criar os pacotes necessários
2. DEPENDENCIAS: LOMBOK | SPRING WEB | SPRING BOOT DEVTOOLS | JPA | Postegres SQL

@SpringBootApplication >> indica que o spring deve ter o start nesse documento
=

3. Criar um controller com as seguintes condições:

   @RestController //Essa classe é um controller da aplicação

   @RequestMapping("food") // mapear os requests que vierem para esse controller


   @GetMapping //O spring precisa entender quando o metodo for chamado pelo request mapping (food)
  

Após adicionar todas as de dependencias >> application.properties
=
Nesse passo deve adicionar a url do banco de dados, username e senha
spring.datasource.url=jdbc:postgressql://localhost:5432/food
spring.datasource.username=eduardo
spring.datasource.password=marin

Criando a classe repositorio
=
Para acessar o banco de dados e manipular os dados

classe repositorio é uma interface que fornece um conjunto de metodos abstratos para manipular e gerar dados
1. São esses metodos que definem o CRUD

A classe entidade vai representar a tabela no banco de dados e mapear todas as colunas

@Table(name = "foods")
@Entity (name = "foods")
(Utilizam do JPA )

Criando o bando de dados
=


    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) //Determinando a PK
    private Long id;
    private String title;
    private String image;
    private Integer price;


Criar uma interface
=
public interface FoodRepository extends JpaRepository<Food, Long> { //Tera todos os acessos e herda o repositorio
}


Após criar a interface, dentro do controller, adicione os dados

public class FoodController {

    @Autowired //indicar para o spring para injetar a instancia na lista
    private FoodRepository repository; //instancia para a lista
    @GetMapping //O spring precisa entender quando o metodo for chamado pelo request mapping (food)
    public List<Food> getAll() {

        List<Food> foodList = repository.findAll();
        return foodList;
    }
}

Nessa situação, estamos adicionando uma lista que vamos injetar todos os itens dentro de foodList.

Enviando requisição atraves do Insommia



Records são uma nova forma de declarar classes no Java. Eles são imutáveis por padrão, o que significa que não podemos alterar seus valores após a criação do objeto

Nessa parte do Codigo, é importante ressaltar a criação do record, pois vamos criar dados estáticos, sem criação de metodos para ter manuseios no codigo
>>Dentro do record, deve se criar um constructor