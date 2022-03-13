# Design-Pattern

🏁 ATIVIDADES 01 e 02 - Padrões de Projetos de Software com Java.

### ATIVIDADE 01 - FACTORY METHOD:

Imagine que você está criando uma aplicação de gerenciamento de logística. A primeira versão da sua aplicação pode lidar apenas com o transporte de caminhões, portanto a maior parte do seu código fica dentro da classe Caminhão.

Depois de um tempo, sua aplicação se torna bastante popular. Todos os dias você recebe dezenas de solicitações de empresas de transporte marítimo para incorporar a logística marítima na aplicação. Boa notícia, certo? Mas e o código? Atualmente, a maior parte do seu código é acoplada à classe Caminhão. Adicionar Navio à aplicação exigiria alterações em toda a base de código. Além disso, se mais tarde você decidir adicionar outro tipo de transporte à aplicação, provavelmente precisará fazer todas essas alterações novamente.

Como resultado, você terá um código bastante sujo, repleto de condicionais que alteram o comportamento da aplicação, dependendo da classe de objetos de transporte.

### ATIVIDADE 02 - ABSTRACT FACTORY:

Imagine que você está criando um simulador de loja de mobílias. Seu código consiste de classes que representam:

  1- Uma família de produtos relacionados, como: Cadeira + Sofá + MesaDeCentro.                                                                                                       2- Várias variantes dessa família. Por exemplo, produtos Cadeira + Sofá + MesaDeCentro estão disponíveis nessas variantes: Moderno, Vitoriano, ArtDeco.

Você precisa de um jeito de criar objetos de mobília individuais para que eles combinem com outros objetos da mesma família. Os clientes ficam muito bravos quando recebem mobília que não combina. E ainda, você não quer mudar o código existente quando adiciona novos produtos ou famílias de produtos ao programa. Os vendedores de mobílias atualizam seus catálogos com frequência e você não vai querer mudar o código base cada vez que isso acontece.
