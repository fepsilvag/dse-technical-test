# História de Usuário: Criação de Plantas
Eu sendo qualquer tipo de usuário logado quero criar novas plantas no sistema XYZ, para que eu possa manter um inventário preciso e atualizado de plantas que podem ser usadas como dados de entrada para futuras fases do sistema.

## Atores:
Qualquer usuário

## Pré-condições:
O usuário está logado no sistema XYZ.

## O que é esperado:
O sistema salva os dados da planta cadastrada.

## Fluxo de Negócio:
- O usuário logado seleciona a opção para criar uma nova planta.
- O usuário logado insere o código da planta (obrigatório, numérico e único).
- O usuário logado insere a descrição (opcional e alfanumérico com limite de 10 caracteres).
- O sistema realiza as validações necessárias para seguir com o cadastro
  - O sistema valida que o código da planta não está duplicado.
    - Caso esteja deve retornar uma mensagem ao usuário informando a seguinte mensagem: "O código da planta está duplicado, favor inserir um novo código"
  - O sistema valida que a descrição é alfanumérica e não possui mais de 10 caracteres
    - Caso esteja inválido deve retornar uma mensagem ao usuário informando a seguinte mensagem: "A descrição está incorreta, favor informar uma descrição de até 10 caracteres alfanuméricos"
- Se a validação passar, a nova planta é criada no sistema.
- O sistema retorna a informação que a planta foi salva com sucesso
