# Desafio Capgemini

Esse proteto é uma resposta ao desafio proposto pela Capgemini para avaliação em sua Academia Técnica Capgemini 2022.

### Tecnologia Utilizadas

- Linguagem java;
- Maven;
- JUnit 4;

### Instruções:
Caso esteja usando o eclipse, deve-se importar o projeto usando a opção "import maven project".

As questões foram separadas em pacotes, e nesses pacotes estao contidas as classes referentes as funcionalidades necessarias para a resolução da questão respectiva.

Em cada pacote há uma classe "Aplicação" com o método Main, necessario para a execução da questão.

Ex: para executar a questão 01 do desafio deve-se entrar no pacote "\src\main\java\desafio_01" e executar o arquivo `aplicação.java`.

As entradas de dados das questões 01 e 02 deverão ser feitas no console através das instruções que aparecerão na tela.
A questão 03, o input devera ser modificado atraves da variavel `palavra` na linha 09, do arquivo "\src\main\java\desafio_03\aplicacao.java". 

### Testes Unitários:

- Atingi 77,5% de teste em toda a aplicação, garantindo que todos os métodos tivessem seu comportamento validado. Não foi possivel criar testes para validar a interação com a tela do console.


![Testes Unitários](https://github.com/guga910/DesafioCapgemini/blob/master/img/desafio_coverage.PNG)


### Estrutura do Codigo.

-Estruturei os desafios utilizando uma camada de serviço visando diminuir o acoplamento do codigo e reduzir a complexidade inerente de cada método.
- Na questao 02, separei as validações em classes e utilizei regex para as validações necessárias abstraindo todas elas em uma mesma interface, para gerar uma checagem de vários erros simultaneos e independentes entre si.

![Estrutura do Codigo](https://github.com/guga910/DesafioCapgemini/blob/master/img/Capturar2.PNG)

 
