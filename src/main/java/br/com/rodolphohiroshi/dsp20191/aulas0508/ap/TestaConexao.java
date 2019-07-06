package br.com.rodolphohiroshi.dsp20191.aulas0508.ap;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestaConexao {

    static Usuario usuario = new Usuario();
    static Conexao conexao = new Conexao();

    public static void  main(String args[]) throws IOException {
        //Commit corrigindo o usuario Git
        //Nome do usuário
        String nome;
        //Login do usuário
        String login;
        //Senha do usúario
        String senha;
        //Declaracao da variacel do sistema SGDB
        String sgbd;
        //O tipo de conexão
        String tpConnection;
        //Declaracao do banco de dados
        String bd;
        //Edereço do banco de dados.
        String enderecoBD;
        //Declaracao da variavel Sistema Operacional
        String so;

        Properties prop = getProp();

        nome = prop.getProperty("nome");
        login = prop.getProperty("usuario");
        senha = prop.getProperty("senha");
        sgbd = prop.getProperty("sgbd");
        tpConnection = prop.getProperty("tipoConexao");
        bd = prop.getProperty("bancoDados");
        enderecoBD = prop.getProperty("urlBd");

        //utilizacao do codigo do slide
        so = System.getProperty("os.name").toLowerCase();

        //Setando o nome do Usuário, login e senha
        usuario.setNome(nome);
        usuario.setLogin(login);
        usuario.setSenha(senha);

        //Setando o sgbd, o tipo de conexao, o nome do bd, o endereco do bd e o Sistema operacional
        conexao.setSgbd(sgbd);
        conexao.setTipoConexao(tpConnection);
        conexao.setBancoDados(bd);
        conexao.setUrlBd(enderecoBD);
        conexao.setSistemaOperacional(so);

        //Imprimindo os dados do usuario e da conexao
        System.out.println("O Nome = " + usuario.getNome());
        System.out.println("O Login = " + usuario.getLogin());
        System.out.println("A Senha = " + usuario.getSenha());
        System.out.println("O SGDB = " + conexao.getSgbd());
        System.out.println("O Tipo de Conexão = " + conexao.getTipoConexao());
        System.out.println("O Banco de Dados = " + conexao.getBancoDados());
        System.out.println("A Url de Conexão do Banco = " + conexao.getUrlBd());
        System.out.println("O Sistema Operacional = " + conexao.getSistemaOperacional());
    }

    public static Properties getProp() throws IOException {
        Properties p = new Properties();
        FileInputStream file = new FileInputStream("src/main/resources/conexao.properties");
        p.load(file);
        return p;
    }



}
