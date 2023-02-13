## Prática de  Java Collections: Dominando Listas, Sets e Mapas

Material de estudos práticos do Programa ONE da Oracle

## Anotações

* Instalar o SDK do Windows, acesse: http://www.oracle.com/technetwork/java/
* Java SE: http://www.oracle.com/technetwork/java/javase/downloads/index.html
* gcuf = Generate Constructor

* Método compareTo
* Collections.unmodifiableList(null): para que não seja mais possível alterar o valor dessa lista por fora da própria classe.
* ArrayList e LinkedList.
* Método .sort() de Collections para ordená-la.
* Collections.reverse(): inverter a ordem de uma lista.
* Collections.shuffle(): embaralhar a ordem de uma lista.
* Collections.singletonList(): embaralhar a ordem de uma lista.
* Collections.nCopies(): retorna uma lista imutável com a quantidade escolhida de um determinado elemento.

* Conjunto de elementos é apresentado através da interface java.util.Set
* Set garante que nenhum elemento se repete.
* Interface Iterable > Collection > Set ou List
* ArrayList: a inserção é bem rápida e a busca muito lenta.
* HashSet: a inserção um pouco mais lenta do que a das listas, mas a busca é muito rápida.

* ggas Generate Getters and Setters
* Encapsulando o Set
* java.util.Collections
* Collections.emptySet(..)
* https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html

* Classe String já possui um método próprio para gerar um hashCode.
* https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-

* LinkedHashSet: nos dá a performance de um HashSet mas com acesso previsível e ordenado.
* Classe Vector possui as mesmas características que um ArrayList, com a diferença de que o primeiro possui acesso sincronizado e o segundo não.

* List: é uma sequência e aceita elementos duplicados.
* Set: não aceita duplicados e não define ordem.
* TreeSet: já ordena os seus elementos na hora da inserção, é o critério da ordenação depende e pode ser definido através de um Comparator.

* Interface Map mapeia valores para chaves, ou seja, através da chave conseguimos acessar o valor.
* Método utilizado para adicionar um elemento em um Map é o método put.
* LinkedHashMap: continua nos dando a performance de um HashMap, mas com acesso previsível e ordenado, seguindo a inserção dos seus elementos.
* API de Collections.