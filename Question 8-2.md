# História de Usuário: Listagem de Plantas
Eu sendo qualquer tipo de usuário logado quero consultar as plantas cadastradas no sistema XYZ, para que eu possa verificar a base de plantas.

## Atores:
Qualquer usuário

## Pré-condições:
O usuário está logado no sistema XYZ.

## O que é esperado:
O sistema lista todas as plantas cadastradas.

## Fluxo de Negócio:
- O usuário logado seleciona a opção para listar as plantas cadastradas.
- O usuário logado terá as seguintes opçãos de filtro:
  - código da planta (numérico)
  - descrição (alfanumérico)
- O usuário logado seleciona a opção "Consultar"
- O sistema deverá exibir algo que demonstre que o sistema está carregando
- O sistema irá utilizar os filtros preenchidos para consultar as plantas cadastradas
  - Caso o usuário preencha o filtro de código da planta, o sistema irá realizar uma busca pelo exato código informado
  - Caso o usuário preencha o filtro de descrição, o sistema irá realizar uma busca case-insensitive de descrições que contenham o conjunto caracteres solicitados
- O sistema irá exibir em uma lista abaixo todos os resultados encontrados
- O sistema deverá remover o demonstrativo de "carregando".
