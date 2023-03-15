# Component-Based System
É uma abordagem de desenvolvimento de jogos e aplicativos que se concentra na separação da lógica de jogo em pequenos pedaços reutilizáveis ​​conhecidos como componentes.
Cada componente é responsável por uma parte específica da lógica de jogo, como movimentação, renderização ou colisão.
Esses componentes são então adicionados a objetos de jogo, conhecidos como entidades, para compor a lógica de jogo completa. Isso permite uma maior flexibilidade e reutilização, pois os componentes podem ser facilmente adicionados ou removidos de entidades sem afetar o resto do código.
Além disso, essa abordagem facilita a manutenção e o escalonamento do código, pois os componentes são menores e mais fáceis de entender do que um monolítico código de jogo inteiro.

### Sobre
Codificado em Java puro, não necessariamente utilizado no framework Android, mas pode ser utilizado nele sem problemas.

> Um exemplo está localizado no arquivo `src/Main.java`

### Desenvolvedor
Criado por Gabriel Lima Bezerra com o objetivo de aprender desenvolvimento back-end por trás de grandes engines de jogos como Unity, Unreal e Godot e utilizar esses recursos em seus projetos pessoais como na Kolpa Engine.

### Mundo
A classe `World` é o container principal que contém a lista de todos os objetos de jogo e sistemas. Ela é responsável por chamar os métodos update() de cada objeto de jogo e sistema em cada frame da cena.

### Sistema
A classe `System` é responsável por processar a lógica de jogo específica e tem acesso à lista de objetos de jogo através da classe World.

### Entidade
A classe `GameObject` mantém uma lista de componentes e é responsável por atualizá-los.

### Componente
A classe `Component` é a classe base para todos os componentes e contém uma referência ao objeto de jogo que o contém.
