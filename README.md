1. Utilizar o spring initializr para criar os pacotes necessários
2. DEPENDENCIAS: LOMBOK | SPRING WEB | SPRING BOOT DEVTOOLS

@SpringBootApplication >> indica que o spring deve ter o start nesse documento
=

3. Criar um controller com as seguintes condições:

   @RestController //Essa classe é um controller da aplicação

   @RequestMapping("food") // mapear os requests que vierem para esse controller


   @GetMapping //O spring precisa entender quando o metodo for chamado pelo request mapping (food)
  
