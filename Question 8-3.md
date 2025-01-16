# História de Usuário: Alteração de Plantas
Eu sendo qualquer tipo de usuário logado quero modificar os dados das plantas cadastradas no sistema XYZ, para que eu possa manter a base de plantas atualizada.

## Atores:
Qualquer usuário

## Pré-condições:
- O usuário está logado no sistema XYZ.
- O usuário realizou uma listagem antes.

## O que é esperado:
O sistema salva os dados da planta modificada.

## Fluxo de Negócio:
- O usuário logado seleciona na lista de plantas qual ele deseja modificar.
- O sistema carrega os valores salvos nessa planta.
  - Código da planta (obrigatório, numérico e não editável).
  - Descrição (opcional, alfanumérico com limite de 10 caracteres e editável).
- O usuário logado pode a qualquer momento cancelar a edição e voltar a tela anterior
- O usuário logado preenche as novas informações
- O usuário logado pode solicitar a gravação das novas informações
- O sistema realiza as validações necessárias para seguir com a alteração
  - O sistema valida que a descrição é alfanumérica e não possui mais de 10 caracteres
    - Caso esteja inválido deve retornar uma mensagem ao usuário informando a seguinte mensagem: "A descrição está incorreta, favor informar uma descrição de até 10 caracteres alfanuméricos"
- Se a validação passar, a planta é salva no sistema
- O sistema retorna a informação que a planta foi salva com sucesso
