package br.com.rodolphohiroshi.dsp2019.aulas1720.ap;

import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.model.*;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.base.CriaConexao;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.ddl.alteracao.AdicionaFKTableLotacao;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.ddl.criacao.TableCargoCreate;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.ddl.criacao.TableDepartamentoCreate;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.ddl.criacao.TableFuncionarioCreate;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.ddl.criacao.TableLotacaoCreate;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.ddl.exclusao.TableCargoDrop;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.ddl.exclusao.TableDepartamentoDrop;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.ddl.exclusao.TableFuncionarioDrop;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.ddl.exclusao.TableLotacaoDrop;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.dml.insert.PersisteCargo;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.dml.insert.PersisteDepartamento;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.dml.insert.PersisteFuncionario;
import br.com.rodolphohiroshi.dsp2019.aulas1720.ap.persistencia.dml.insert.PersisteLotacao;

public class Start {
    public static void main(String[] args)throws Exception{
        //cria conexão com o bd H2
        CriaConexao createconn = new CriaConexao();
        createconn.getConnection("file");
        //Cria objeto da classe de Dados dos Objetos
        DadosObjetos dob = new DadosObjetos();

        //Instancia os objetos que serão inseridos no bd H2
        Cargo[] cargo = dob.LotarCargo();
        Funcionario[] funcionario = dob.LotarFuncionario();
        Departamento[] departamento = dob.LotarDepartamento();
        Lotacao[] lotacao = dob.LotarLotacao(funcionario,departamento,cargo);

        //Instacia os objetos para Dropar as Tabelas
        TableCargoDrop cargoDrop = new TableCargoDrop();
        cargoDrop.dropTable();

        TableFuncionarioDrop funcionarioDrop = new TableFuncionarioDrop();
        funcionarioDrop.dropTable();

        TableDepartamentoDrop departamentoDrop = new TableDepartamentoDrop();
        departamentoDrop.dropTable();

        TableLotacaoDrop lotacaoDrop = new TableLotacaoDrop();
        lotacaoDrop.dropTable();

        //Instancia os objetos para criar as tabelas
        TableCargoCreate cargoCreate = new TableCargoCreate();
        cargoCreate.createTable();

        TableFuncionarioCreate funcionarioCreate = new TableFuncionarioCreate();
        funcionarioCreate.createTable();

        TableDepartamentoCreate departamentoCreate = new TableDepartamentoCreate();
        departamentoCreate.createTable();

        TableLotacaoCreate lotacaoCreate = new TableLotacaoCreate();
        lotacaoCreate.createTable();

        //Instancia o obejto
        AdicionaFKTableLotacao adicionaFKTabelaLotacao = new AdicionaFKTableLotacao();
        adicionaFKTabelaLotacao.alterTable();

        PersisteFuncionario pf = new PersisteFuncionario();
        pf.persisteFuncionario(funcionario[0]);
        pf.persisteFuncionario(funcionario[1]);
        pf.persisteFuncionario(funcionario[2]);
        pf.persisteFuncionario(funcionario[3]);
        pf.persisteFuncionario(funcionario[4]);
        pf.persisteFuncionario(funcionario[5]);
        pf.persisteFuncionario(funcionario[6]);
        pf.persisteFuncionario(funcionario[7]);
        pf.persisteFuncionario(funcionario[8]);
        pf.persisteFuncionario(funcionario[9]);

        PersisteDepartamento pd = new PersisteDepartamento();
        pd.persisteDepartamento(departamento[0]);
        pd.persisteDepartamento(departamento[1]);
        pd.persisteDepartamento(departamento[2]);
        pd.persisteDepartamento(departamento[3]);

        PersisteCargo pc = new PersisteCargo();
        pc.persisteCargo(cargo[0]);
        pc.persisteCargo(cargo[1]);
        pc.persisteCargo(cargo[2]);

        PersisteLotacao pl = new PersisteLotacao();
        pl.persisteLotacao(lotacao[0]);
        pl.persisteLotacao(lotacao[1]);
        pl.persisteLotacao(lotacao[2]);
        pl.persisteLotacao(lotacao[3]);
        pl.persisteLotacao(lotacao[4]);
        pl.persisteLotacao(lotacao[5]);
        pl.persisteLotacao(lotacao[6]);
        pl.persisteLotacao(lotacao[7]);
        pl.persisteLotacao(lotacao[8]);
        pl.persisteLotacao(lotacao[9]);

    }
}
