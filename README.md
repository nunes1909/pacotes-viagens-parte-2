## Dados do repositório:
Nome do App: Pacotes de Viagens.<br>
Curso: Layouts Android parte 2: Boas práticas para criação de telas.<br>
Continuação do curso: Layouts Android parte 1 - Criando telas com Constraint Layouts.

## Este aplicativo aborda:
1. **Criação da tela de resumo dos pacotes.**
    - Adicionando novo campo de "período da viagem."  
3. **Refatoração do código Java e do layout da tela de resumo do pacote.**
4. **Criação da tela de pagamento dos pacotes.**
    - Implementação de EditTexts.
    - Inserindo limitação de caracteres e limite máximo de caracteres.
5. **Refatoração do código Java e do layout da tela pagamento dos pagamento.**
6. **Criação da tela de resumo da compra.**
7. **Refatoração do código Java e do layout da tela de resumo da compra.**
8. **Correção do fluxo do aplicativo.**
    - Lista de Pacotes -> Resumo do Pacote -> Pagamento do Pacote -> Resumo da Compra.
9. **Enviando e recebendo entre todas as activities o objeto pacote.**
    - O recurso utilizado para enviar o objeto foi o "putExtra".
    - O recurso utilizado para receber o objeto foi o "getIntent()".
        - Através de uma validação com if, foi verificado se existe algum Extra.
        - ``` if (intent.hasExtra(CHAVE_PACOTE)) ```
10. **Criação de uma interface de constantes.
    - Todas as activities ao receber o objeto, recebem a mesma chave "extra".
11. **Refatoração de todo o código Java da aplicação.**
12. **Finalizando o projeto.** 🚀🎉
    
