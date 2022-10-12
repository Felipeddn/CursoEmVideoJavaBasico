# Aula 5 Introdução ao Swing e JavaFX

Professor: Gustavo Guanabara
O Java possui um pacote que contém todas as instruções consideradas essenciais para programar algo simples que já vem carregado na linguagem Java, o nome desse pacote é o Java.lang para outras funcões adicionais podemos importar pacotes que inclui essa funcionalidade.

Uma forma de agregar mais funcionalidades para o Java é através da importação de pacotes.

Alguns pacotes Java que podemos importar para adicionar funcionalidades.

- Java.applet -> para aplicativos  
- Java.util -> para utilitários como monitoramento de teclado para captura de teclas.
- Java.math -> para funções matemáticas 
- Java.net -> para redes  
- Javax.sound -> x de (extended) bibliotecas estendidas, para som  
- Javax.media -> para midias  
- Javax.swing -> bibliotecas para interface graficas com diversos componentes  
- JavaFX.fxml -> Evolução do swing para componentes gráficos  

## Biblioteca swing

Permite a criação de interfaces gráficas, criação de janelas.

a swing é uma evolução da biblioteca awt (abstract windown toolkit), a awt é usada para criação de interface gráfica porém ela deixa que o sistema operacional que decida o design gráfico da interface.

A interfaces gráficas criadas com a biblioteca swing tem uma aparência mais elaborada.

A partir daqui foi iniciado um projeto Java que pode ser visto a partir do diretório:  

CodigosDasAulas -> OlaMundoSwing -> src -> cursoemvideo -> olamundo -> OlaMundoJava.java

Nesse código tem o seguinte trecho

public class TelaSwing **extends** javax.swing.JFrame{
    **private** javax.swing.JButton btnClick;
    private javax.swing.JLabel lblMensagem;

    private void btnClickActionPerformed(){
        lblMensagem.setText("Olá, mundo!");
    }
}

**extends** é um comando onde a TelaSwing **herdara** (passará a possuir também) os atributos e métodos do JFrame, o nome dessa caracteristicas de obter os métodos e atributos de um componente através do extends é chamado de **herança**.

**private** é um encapsulamento, e esse encapsulamento não deixa publico essa caracteristica.

## Plataforma JavaFX

Para ver os códigos do projeto acompanhe os diretórios.

CodigosDasAulas -> CodigoAula5IntroducaoAoSwingEJavaFX -> OlaMundoJavaFX -> src -> olamundojavafx -> OlaMundoJavaFx.java

Tudo começa com a importação do pacote JavaFX

import javafx.fxml.FXML;

public class FXMLDocumentController **implements** Initializable {
    @FXML
    private Button btnClick;
    private Label lblMensagem;

    @FXML
    private void clicouBotao(){
        lblMensagem.setText("Olá, Mundo!")
    }
}

**implements** é usado para interfaces

Para verificar os códigos práticados hoje e saber a diferença de desenvolver uma janela com o swing e com o javaFX visualize a imagem **a05programando-janelas-com-swing-e-javafx.png**.

Como gerenciar os projetos? onde encontra-se todos esses arquivos e como gerar um arquivo executável de cada um desses exemplos?

no caso de onde fica os projetos já foram evidênciados toda vez que começamos um projeto, já para a criação do "executável" (lembre-se java cria bytecode) fazemos o seguinte:

No netbeans escolha o projeto **OlaMundoSwing** apertamos no icone de "limpar e construir projeto" que é representado pelo icone de um martelo com uma vassoura. após isso um diretório chamado distro aparecerá o arquivo de extensão .jar é o executável que pode ser distribuido. compartilhei com um colega o arquivo .jar e ele conseguiu usar numa boa

O mesmo pode ser feito com o projeto **OlaMundoJavaFX**.

Fim da aula
