# Sistema de Controle de Despesas

Este é um sistema de controle de despesas em Java que permite gerenciar despesas e pagamentos, incluindo funcionalidades para conciliação de despesas. O sistema é composto por uma interface de linha de comando (CLI) para interação com o usuário.

## Funcionalidades

- **Entrar Despesa**: Adicionar uma nova despesa com descrição, valor, data de vencimento e categoria.
- **Anotar Pagamento**: Registrar um pagamento feito para uma despesa específica.
- **Listar Despesas em Aberto no Período**: Visualizar despesas que estão pendentes dentro de um intervalo de datas.
- **Listar Despesas Pagas no Período**: Visualizar despesas que foram pagas dentro de um intervalo de datas.
- **Gerenciar Tipos de Despesa**: Criar, listar, editar e excluir tipos de despesa.
- **Gerenciar Usuários**: Cadastrar, listar e gerenciar usuários com login e senha criptografada.

## Estrutura do Projeto

- **`src/main/Main.java`**: Classe principal que contém o menu e a lógica para interagir com o usuário.
- **`src/controller/DespesaController.java`**: Controlador para gerenciar despesas.
- **`src/controller/TipoDespesaController.java`**: Controlador para gerenciar tipos de despesa.
- **`src/controller/UsuarioController.java`**: Controlador para gerenciar usuários.
- **`src/model/Despesa.java`**: Classe para representar uma despesa.
- **`src/model/TipoDespesa.java`**: Classe para representar um tipo de despesa.
- **`src/model/Usuario.java`**: Classe para representar um usuário.
- **`src/utils/ArquivoUtil.java`**: Utilitário para salvar e carregar dados de arquivos.

## Pré-requisitos

Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado. Você também pode usar [Maven](https://maven.apache.org/) ou [Gradle](https://gradle.org/) para gerenciamento de dependências e construção do projeto.

## Configuração e Execução

**Compile o projeto**:

```bash
javac .\src\main\Main.java
```

```bash
java .\src\main\Main.java
```

## Uso

Ao iniciar o sistema, você verá um menu com as seguintes opções:

1. Entrar Despesa
2. Anotar Pagamento
3. Listar Despesas em Aberto no Período
4. Listar Despesas Pagas no Período
5. Gerenciar Tipos de Despesa
6. Gerenciar Usuários
7. Sair

Escolha a opção desejada digitando o número correspondente e siga as instruções na tela.

## Estrutura dos Arquivos

- Despesas: Armazenadas no arquivo `despesas.txt`.
- Tipos de Despesa: Armazenados no arquivo `tipos_despesa.txt`.
- Usuários: Armazenados no arquivo `usuarios.txt`.
