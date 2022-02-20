## 📝 Instruções para realização da  questão 03

Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

**Exemplo 1)**

Entrada:
```
ovo
```

Saída:
```
3
```

**Explicação:**
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1], [1, 2]] respectivamente. 


**Exemplo 2)**

Entrada:
```
ifailuhkqq
```


Saída:
```
3
```

**Explicação:**
A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0, 3]], [[8, 9]] e [[0, 1, 2], [1, 2, 3]].


## 💡 Lógica para resolução
Com a String dada pelo o usuário o algoritmo vai criar subStrings e estas serão armazenadas em um vetor. Depois será feita as comparações utilizando um algoritmo de busca com anagramas, e enquanto este realiza a busca, caso for verdadeira a comparação irá armazenar seu índice em um vetor. Depois o será analisado somente os vetores que possuem mais de um índice e será dividido por dois. Retornando assim a qtd de pares. 
## 📃 UML da classe e do seu teste unitário
 <img src="https://ik.imagekit.io/6774657672/ParAnagrama_ZFXPGLraTKb.jpeg?ik-sdk-version=javascript-1.4.3&updatedAt=1645359118471">
 <img src="https://ik.imagekit.io/6774657672/ParAnagramaTest_XnVzb5aTRkPZ.jpeg?ik-sdk-version=javascript-1.4.3&updatedAt=1645359117775">
