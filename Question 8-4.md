# História de Usuário: Deleção de Plantas
Eu como usuário administrador do sistema XYZ quero deletar uma planta cadastrada no sistema XYZ, para que eu possa manter a base de plantas atualizada.

## Atores:
Usuário Administrador

## Pré-condições:
- O usuário está logado no sistema XYZ.
- O usuário realizou uma listagem antes.

## O que é esperado:
O sistema apaga a planta selecionada.

## Fluxo de Negócio:
- O usuário administrador logado seleciona na lista de plantas qual ele deseja deletar.
- O sistema exibe uma mensagem solicitando confirmação.
- O usuário administrador logado pode canelar a deleção ou confirmar
  - Caso o usuário confirme, a planta deve ser deletada da base
  - Caso o usuário cancele a mensagem deve ser fechada, retornando a consulta anterior

## Cenários de Teste de Sucesso:
1. Tentar acessar essa funcionalidade com um usuário comum, não deve ser possível
2. Tentar acessar essa funcionalidade com um usuário administrador, deve conseguir normalmente
3. Selecionar uma planta para deletar, mas cancelar a operação, não deve deletar a planta
4. Selecionar uma planta para deletar e confirmar a deleção, deve deletar a planta
