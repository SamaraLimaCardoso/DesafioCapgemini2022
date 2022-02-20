## 📝 Instruções para realização da  questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.
**Exemplo:**
Entrada:
```
n = 6
```

Saída:
```
     *
    **
   ***
  ****
 *****
******
```


## 💡 Lógica para resolução
Para essa questão foi criado um método void, **imprimirAsterisco()**, nele serão realizados dois loops para a exibição dos asteriscos em forma de escada. A condição para imprimir o asterisco é ( j > (n - i)), ou seja, só quando a a coluna for menor que a entrada menos a linha. Exemplificando:
<h1 aling = "center">
<img src="https://ik.imagekit.io/6774657672/tabela_zXaq__M4s6.jpeg?ik-sdk-version=javascript-1.4.3&updatedAt=1645359302358">
</h1>

## 📃 UML da classe e do seu teste unitário

 <img src="https://ik.imagekit.io/6774657672/EscadaTest_jxNb1nsxS4.jpeg?ik-sdk-version=javascript-1.4.3&updatedAt=1645359086924">
 <img src="https://ik.imagekit.io/6774657672/Escada_tLYF5vtLQ.jpeg?ik-sdk-version=javascript-1.4.3&updatedAt=1645359118598">
 

