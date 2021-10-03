# Sistema de saques para clientes utilizando caixas eletrônicos

#### Linguagem utilizada: Java.
#### Versão: 1.0.
#### Execução do projeto por: Console junto com a biblioteca JOptionPane.

##### Rodar o projeto por linha de comando: java -jar caixa-eletronico.jar

Dentro desse sistema, é necessário com que, ao cliente efetuar um saque, seja entregue o menor número de notas 
possíveis, como por exemplo, ao requisitar um saque de R$60, venha a ser retornado uma nota de R$50 reais, 
outra de R$10 e tornando impróprio o retorno de quatro notas de R$10 reais ou sinco notas de 
dez reais, além da necessidade de conter quatro valores disponíveis, tendo três citadas acima e finalizando pela de 
cem reais, aonde a quantidade dessas e o saldo do cliente são infinitas dentro do algoritmo.

Adentrando alguns casos de uso, se o cliente determinar um valor de saque igual a trinta reais, então deverá ser
retornado duas notas, sendo uma de vinte e uma de dez reais, seguindo a convenção descrita acima. Porém, caso o 
usuário tentar sacar um valor de, por exemplo, noventa e cinco reais, deve aparecer uma mensagem descrevendo
que o valor é inválido dentro do sistema, dando ao mesmo, uma opção de sacar um valor de noventa reais, que assim, 
já se torna um valor disponível, tendo então a possibilidade de aceitar ou não.

# Dados técnicos

Para criação do algoritmo, foi utilizada a programação orientada a objetos, utilizando alguns padrões de projeto, como
por exemplo, o chain of responsability, fazendo com que, se o valor determinado for menor que a nota de cem reais,
a mesma vem a chamar a nota de cinquenta, que, se também não se mostra adequada, passa para a de vinte reais e por 
fim passando para a nota de dez reais, onde, não passa para uma outra nota, principalmente pelo fato de que é utilizada 
uma estrutura condicional que verifica se o valor descrito quando dividido por dez vem a ser igual a zero, ou seja, como 
foi citado acima, se as notas não conseguirem fazer com que seja possível a realização do saque, então é feito um calcúlo
abaixando o valor ao mínimo possível para que seja executável a ação do saque.

# Fluxo do sistema

Ao iniciar o algoritmo, é exibida uma tela aonde é perguntado o valor do saque:

![valor do saque](
E, determinando um valor de oitenta reais para sacar, é exibida a tela de saque concluído:

![saque valido realizado](

Dentra da tela acima, é perguntado se o cliente deseja efetuar um outro saque, caso a resposta seja positiva, é retornada a primeira tela para determinar o valor do saque, e se for digitado um número inválido, ou seja, que as notas não conseguem suprir a demanda do saque, é exibida uma mensagem de erro, trazendo uma possível solução, colocando como exemplo o valor do saque de noventa e cinco reais:

![valor invalido](

Essa tela possibilita duas ações, sacar o valor sugerido ou não, fazendo com que se a opção escolhida for de sacar, é exibida a seguinte tela:

![sacando valor antes invalido](

E caso a opção for de não sacar:

![nao saque de valor invalido](
Em todas as telas que tem a pergunta sobre a realização de um outro saque, se a resposta for positiva, o fluxo do programa é reiniciado, caso contrário, é visível uma tela de adeus com uma mensagem de agradecimento.

![fim de uso](

