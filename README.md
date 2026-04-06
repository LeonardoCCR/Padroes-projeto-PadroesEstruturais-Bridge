# Descrição do Projeto: Sistema de Criação de Móveis
O projeto se trata de uma implementação do padrão de projeto estrutural Bridge em Java. O objetivo principal é resolver o problema da explosão de classes em sistemas, nesse contexto que se trata de manufatura de móveis, diferentes tipos de produtos (Abstrações) podem ser fabricados com diferentes tipos de materiais (Implementações).

# O Problema Resolvido:

Sem o Bridge, se tivéssemos 5 tipos de móveis e 5 tipos de materiais, precisaríamos de 25 classes (ex: CadeiraMadeira, CadeiraMetal, MesaMadeira, etc.). Com o Bridge, reduzimos isso para 10 classes ($5 + 5$), pois a variação do móvel e do material ocorre de forma independente através de composição em vez de herança múltipla.
