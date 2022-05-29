# Design-Pattern

🏁 ATIVIDADES 01 e 02 - Padrões de Projetos de Software com Java.

### ATIVIDADE 01 - FACTORY METHOD:

Imagine que você está criando uma aplicação de gerenciamento de logística. A primeira versão da sua aplicação pode lidar apenas com o transporte de caminhões, portanto a maior parte do seu código fica dentro da classe Caminhão.

Depois de um tempo, sua aplicação se torna bastante popular. Todos os dias você recebe dezenas de solicitações de empresas de transporte marítimo para incorporar a logística marítima na aplicação. Boa notícia, certo? Mas e o código? Atualmente, a maior parte do seu código é acoplada à classe Caminhão. Adicionar Navio à aplicação exigiria alterações em toda a base de código. Além disso, se mais tarde você decidir adicionar outro tipo de transporte à aplicação, provavelmente precisará fazer todas essas alterações novamente.

Como resultado, você terá um código bastante sujo, repleto de condicionais que alteram o comportamento da aplicação, dependendo da classe de objetos de transporte.

### ATIVIDADE 02 - ITERATOR PATTERN:

Em sala de aula foi apresentado o exemplo do Iterator Pattern. Ali foi implementado a iteração sobre uma coleção de nomes. Conforme o zip anexo, implemente o iterator para as demais coleções. Crie o CollectionofAges, CollectionofAddress e CollectionofDesignation implementando Container.
