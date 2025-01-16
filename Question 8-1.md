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
  - Código da planta
    - Caso contenha algum caractere não númerico deverá retornar o erro "O código da planta é apenas númerico, favor inserir um código válido"
    - Caso o código esteja duplicado deve retornar uma mensagem ao usuário informando a seguinte mensagem: "O código da planta está duplicado, favor inserir um novo código"
  - Descrição
    - Caso contenha algum caractere não alfanumérico deverá retornar o erro "A descrição é um campo alfanumérico, favor inserir uma descrição válida"
    - Caso contenha mais de 10 caracteres alfanuméricos deverá retornar o erro "A descrição só pode ter até 10 caracteres alfanuméricos, favor informar uma descrição menor"
- Se a validação passar, a nova planta é criada no sistema.
- O sistema retorna a informação que a planta foi salva com sucesso

## Cenários de Teste:
1. Tentar acessar essa funcionalidade com um usuário comum e um usuário administrador
2. Tentar cadastrar uma planta com letras no código (exemplo: aast1) deverá retornar o erro "O código da planta é apenas númerico, favor inserir código válido"
3. Tentar cadastrar uma planta com caracteres especiais no código (exemplo: @@$!%) deverá retornar o erro "O código da planta é apenas númerico, favor inserir código válido"
4. Tentar cadastrar uma planta com um código duplicado deverá retornar o erro "O código da planta está duplicado, favor inserir um novo código"
5. Tentar cadastrar uma planta com caracteres especiais na descrição (exemplo: @@$!%) deverá retornar o erro "A descrição é um campo alfanumérico, favor inserir uma descrição válida"
6. Tentar cadastrar uma planta com caracteres especiais na descrição com mais de 10 caracteres alfanuméricos, deverá retornar o erro "A descrição só pode ter até 10 caracteres alfanuméricos, favor informar uma descrição menor"
7. Tentar cadastrar uma planta com código numérico (exmeplo: 1) único e sem preencher a descrição, o sistema deve cadastrar corretamente
8. Tentar cadastrar uma planta com código numérico (exmeplo: 2) único e preencher a descrição com um texto alfanumérico com menos de 10 caracteres (exemplo: desc), o sistema deve cadastrar corretamente
