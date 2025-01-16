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
  - Descrição
    - Caso contenha algum caractere não alfanumérico deverá retornar o erro "A descrição é um campo alfanumérico, favor inserir uma descrição válida"
    - Caso contenha mais de 10 caracteres alfanuméricos deverá retornar o erro "A descrição só pode ter até 10 caracteres alfanuméricos, favor informar uma descrição menor"
- Se a validação passar, a planta é salva no sistema
- O sistema retorna a informação que a planta foi salva com sucesso

## Cenários de Teste de Sucesso:
1. Tentar acessar essa funcionalidade com um usuário comum e um usuário administrador
2. Tentar alterar o valor do campo código da planta, não deve ser possível por que o campo deve ser não editável
5. Tentar alterar o valor do campo descrição, apagando todo o conteúdo e salvando, o sistema deve salvar a alteração corretamente
6. Tentar alterar o valor do campo descrição, preenchendo com um texto alfanumérico com menos de 10 caracteres (exemplo: desc) e salvando, o sistema deve salvar a alteração corretamente

## Cenários de Teste de Erro:
3. Tentar alterar o valor do campo descrição colocando caracteres especiais (exemplo: @@$!%) deverá retornar o erro "A descrição é um campo alfanumérico, favor inserir uma descrição válida"
4. Tentar alterar o valor do campo descrição colocando mais de 10 caracteres alfanuméricos, deverá retornar o erro "A descrição só pode ter até 10 caracteres alfanuméricos, favor informar uma descrição menor"
