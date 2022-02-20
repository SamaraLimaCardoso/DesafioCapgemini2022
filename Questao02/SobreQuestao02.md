## 📝 Instruções para realização da  questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
- Possui no mínimo 6 caracteres.
- Contém no mínimo 1 digito.
- Contém no mínimo 1 letra em minúsculo.
- Contém no mínimo 1 letra em maiúsculo.
- Contém no mínimo 1 caractere especial. Os caracteres especiais são: **!@#$%^&*()-+**

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

**Exemplo:**
Entrada:
```
Ya3
```

Saída:
```
3
```

**Explicação:**
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.
## 💡 Lógica para resolução
Com a String dada pelo usuário o algoritmo vai verificar se a senha preenche todos os padrões utilizando o Pattern e o Matches. Depois, caso a senha não preencha todos os padrões, ele retorna sugestões para deixar a senha no padrão. Se a senha obtiver caracteres a menos que o esperado, ele retornará a quantidade de caracteres que falta  para a senha se tornar utilizável. 
## 📃 UML da classe e do seu teste unitário
 <img src="https://ik.imagekit.io/6774657672/ValidarSenha_1oIVmqfG89R.jpeg?ik-sdk-version=javascript-1.4.3&updatedAt=1645359117511">
 <img src="https://ik.imagekit.io/6774657672/ValidarSenhaTest_-felnG-A_z.jpeg?ik-sdk-version=javascript-1.4.3&updatedAt=1645359117566">
