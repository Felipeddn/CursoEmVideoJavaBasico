# Aula 2 - Como funciona o Java

Professor: Gustavo Guanabara

Em relação a linguagem C o Java é diferente no que se diz respeito a produção de códigos executáveis.

```Java
public static void main (String[] args) {
    System.out.println("Olá, mundo!");
}
```
Acima é um **código fonte** em Java, esse código não é compreensível pelo computador

Bem, para "traduzir" esse código para um código compreensível pela máquina usamos um compilador com em C e nomeamos esse compilador de **JavaC**.

O resultado dessa transformação é um **bytecode** e não um **código executável**.

O bytecode também não é entendido pelo computador.

Para se compreendido esse byte code precisa ser **interpretado** em um software chamado **Java Virtual Machine** conhecido pela sigla **JVM**, o JVM interpreta o código que pode ser executado pela máquina.

então retomando: 

Linguagens como **C** transforma o **código-fonte** com um **compilador** em um **código executavel** que é compreendido pela máquina.

**código-fonte** + **compilador** -> **código executável** que pode ser lido pela máquina.

Em **C** o código fonte e o compilador precisa ser compatível com a plataforma (sistema operacional).

Linguagens como o **Java** transforma  o **código-fonte** com um **compilador** chamado **JavaC** em um **bytecode** que depois é interpretado pela **maquina virtual Java** (Java virtual machine - JVM) em um código compreensível pela máquina.

Existe uma **maquina virtual Java** para cada plataforma, mas o **bytecode** produzido em uma plataforma é **interpretado** por qualquer **maquina virtual java** de qualquer plataforma, ou seja, basta produzir um único **código-fonte** que pode ser **compilado** em qualquer plataforma pelo **JavaC** que produzirá um **bytecode** e depois reutiliza-lo na demais plataformas.

O nome desse processo que o Java faz é **WORA** *W*rite *O*nce *R*un *A*nywhere (escreva uma vez e execute em qualquer lugar).

A vantagem de Java é essa, você escreve código uma vez e executa ele em qualquer lugar.

Existem duas siglas que separam os diferentes usuários de java **JDK** e **JRE**.

Para usuários que desejam apenas **utilizar** softwares desenvolvidos com Java, é necessário instalar o JRE - **Java Runtime Environment** em português Ambiente de execução Java.

O JRE é composto de:

* JVM (Java Virtual Machine) - a máquina virtual do Java que possui as seguintes partes internas:    
 - Loader -> Carrega o bytecode na memória da máquina virtual  
 - Verificador -> analisa se o código pode ser executado sem apresentar erros.  
 - Interpretador -> transforma o bytecode em código nativo da máquina.  
 - Gerenciador de memória -> trata a forma de gerenciamento de variáveis e códigos na memória da JVM, a JVM é como se fosse uma máquina virtual.  
 - Compilador JIT -> compila alguns códigos no bytecode fazendo que não seja necessário ser interpretado novamente pela máquina virtual, isso otimiza o tempo de interpretação do código.

Existem mais componentes dentro do JRE mas o Guanabara acreditou que esses são importantes de serem abordados no curso

* Bibliotecas - São **APIs** que poderão ser utilizadas pelos programas tornando os programas mais atrativos e fornecendo mais funcionalidades para esses programas.  

O JDK é composto de:

Tudo que tem na JRE mais:

* JavaLang - a linguagem Java

* JavaTools - conjuntos de ferramentas 
 - JavaC - o compilador do código-fonte que transforma em bytecode.  
 - Debugger - verifica a execução do programa em tempo real, verifica variáveis e acesso à banco de dados.  
 - APIs - APIs de desenvolvimentos como o JavaFX.

Existem outros conteúdos dentro do JavaTools mas o Guanabara escolheu não aborda-los.

veja a imagem **a02conteudoDeJDKeJRE.png** para visualizar melhor o que foi abordado acima.

Para facilitar nossa programação podemos fazer o uso de uma **IDE** que é um ambiente de desenvolvimento, facilita muito a vida do programador.

O Guanabara recomenda o uso do **NetBeans** como IDE, eu acredito ser melhor o **Intellij**.

Fim da aula
