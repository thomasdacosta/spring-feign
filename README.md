# Spring Cloud + Feign Client: efetuando integrações com API Rest

O principal objetivo do Feign Client é criar clientes HTTP de forma simples, sem precisar escrever muito código fonte. Normalmente um cliente HTTP é usado em chamadas para outros microsserviços quando trabalhamos com orquestração ou quando chamamos API’s, endereços externos ou integração com outros sistemas que usam o protocolo HTTP.
No nosso exemplo, vamos mostrar como utilizar o Feign Client para chamar a API Oficial da Marvel.

[![](https://img.youtube.com/vi/12KKwA_Y_Ak/0.jpg)](https://www.youtube.com/watch?v=12KKwA_Y_Ak)

# Video do YouTube:

[Vídeo do YouTube](https://youtu.be/12KKwA_Y_Ak)

## Capítulos do Video:

Capítulos:
00:00 Introdução<br/>
00:07 O que é o Feign Client?<br/>
01:19 Swagger Codegen<br/>
02:24 Artigo do Site<br/>
03:16 Declarative REST Client: Feign<br/>
04:20 Criando o projeto<br/>
06:30 Compilando o Projeto<br/>
07:27 Projeto no Intellij<br/>
08:10 Baixando o Swagger Codegen e o Swagger da Marvel<br/>
09:13 Criando o arquivo config.json para o Swagger Codegen<br/>
10:50 Gerando as classes do FeignClient através do Swagger Codegen<br/>
13:08 Projeto criado pelo Swagger Codegen<br/>
14:21 Como funciona o FeignClient?<br/>
17:12 Copiando as classes geradas para o projeto<br/>
18:10 Incluindo a anotação @EnableFeignClients<br/>
19:20 Dependências do pom.xml<br/>
22:28 Criando o RestController<br/>
25:06 Incluíndo autenticação<br/>
28:49 Testando a aplicação

## Passo a passo para criar e configurar o projeto

- Baixar o arquivo swagger-codegen-cli-3.0.41.jar do site 
 
```
https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.41/
```
- Baixar o swagger da API da Marvel do site 
```
https://speca.io/speca/marvel-public-api-v1
```
- Criar o arquivo config.json para modificar o nome dos pacotes na geração
```
{
   "modelPackage": "br.com.thomasdacosta.model",
   "apiPackage": "br.com.thomasdacosta.api",
   "configPackage": "br.com.thomasdacosta.configuration"
}
```
- Gerar as classes do OpenFeign com o comando
```
java -jar swagger-codegen-cli-3.0.41.jar generate -i marvel-public-api-v1-swagger.json -l spring --library spring-cloud -o marvel -c config.json
```
- Gerar um projeto novo no Spring Initializr com OpenFeign e Spring Web
- Incluir a anotação @EnableFeignClients na aplicação principal do @SpringBootApplication
- Copiar as classes do projeto da Marvel gerado
- Incluir a dependência:
```
        <swagger-core-version>1.5.18</swagger-core-version>

        <dependency>
            <groupId>io.swagger</groupId>
            <artifactId>swagger-annotations</artifactId>
            <version>${swagger-core-version}</version>
        </dependency>
```
- Incluir a dependência:
```
    <dependency>
        <groupId>javax.validation</groupId>
        <artifactId>validation-api</artifactId>
        <version>1.1.0.Final</version>
        <scope>provided</scope>
    </dependency>
```
- Incluir a dependência:
```
        <dependency>
            <groupId>com.github.joschi.jackson</groupId>
            <artifactId>jackson-datatype-threetenbp</artifactId>
            <version>2.6.4</version>
        </dependency>
```
- Incluir os parametros de autenticação da requisição: 
```
  ts=VALOR DA SUA CHAVE
  apikey=VALOR DA SUA CHAVE
  hash=VALOR DA SUA CHAVE
```  
- Criar a classe Controller
- Testar no Insomnia com o ID 1009327

---
Thomás da Costa - [https://thomasdacosta.com.br](https://thomasdacosta.com.br)
