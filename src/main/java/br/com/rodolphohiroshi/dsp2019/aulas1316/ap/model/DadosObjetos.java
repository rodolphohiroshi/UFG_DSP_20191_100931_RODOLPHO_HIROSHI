package br.com.rodolphohiroshi.dsp2019.aulas1316.ap.model;
//Lotar 10 funcionários distribuídos em 3 cargos diferentes e lotados em 4 departamentos.

import java.sql.Date;

public class DadosObjetos {

    public Funcionario[] LotarFuncionario(){
        Funcionario[] funcionario = new Funcionario[10];
        funcionario[0] = new Funcionario((long) 2019001,"Rodolpho",(long) 201901001);
        funcionario[1] = new Funcionario((long) 2019002,"Luana",(long) 201901002);
        funcionario[2] = new Funcionario((long) 2019003,"Joao",(long) 201901003);
        funcionario[3] = new Funcionario((long) 2019004,"Marilene",(long) 201901004);
        funcionario[4] = new Funcionario((long) 2019005,"Daniel",(long) 201901005);
        funcionario[5] = new Funcionario((long) 2019006,"Alice",(long) 201901006);
        funcionario[6] = new Funcionario((long) 2019007,"Carlos",(long) 201901007);
        funcionario[7] = new Funcionario((long) 2019008,"Antonio",(long) 201901008);
        funcionario[8] = new Funcionario((long) 2019009,"Carlos",(long) 201901009);
        funcionario[9] = new Funcionario((long) 2019010,"Ronaldo",(long) 201901009);
        return funcionario;
    }

    public Cargo[] LotarCargo() {
        Cargo[] cargo = new Cargo[3];
        cargo[0] = new Cargo((long) 01,"Gerente",4000.00);
        cargo[1] = new Cargo((long) 01,"Vendedor",2000.00);
        cargo[2] = new Cargo((long) 01,"Estoquista",1000.00);
        return cargo;
    }

    public Departamento[] LotarDepartamento()
    {
        Departamento[] departamento = new Departamento[4];
        departamento[0] = new Departamento((long) 01,"Estoque");
        departamento[1] = new Departamento((long) 02,"Escritorio");
        departamento[2] = new Departamento((long) 03,"Balcao de Vendas");
        departamento[3] = new Departamento((long) 04,"Caixa");
        return departamento;
    }

    public Lotacao[] LotarLotacao(Funcionario[] funcionario,Departamento[] departamento, Cargo[] cargo)
    {
        Lotacao[] Lotacao = new Lotacao[10];
        Lotacao[0] = new Lotacao((long) 1, new Date( 20190101), new Date(20991231),cargo[0],departamento[1],funcionario[0]);
        Lotacao[1] = new Lotacao((long) 2, new Date(20190101), new Date(20991231),cargo[1],departamento[2],funcionario[1]);
        Lotacao[2] = new Lotacao((long) 3, new Date(20190101), new Date(20991231),cargo[1],departamento[2],funcionario[2]);
        Lotacao[3] = new Lotacao((long) 4, new Date(20190101), new Date(20991231),cargo[1],departamento[2],funcionario[3]);
        Lotacao[4] = new Lotacao((long) 5, new Date(20190101), new Date(20991231),cargo[2],departamento[0],funcionario[4]);
        Lotacao[5] = new Lotacao((long) 6, new Date(20190101), new Date(20991231),cargo[2],departamento[0],funcionario[5]);
        Lotacao[6] = new Lotacao((long) 7, new Date(20190101), new Date(20991231),cargo[2],departamento[0],funcionario[6]);
        Lotacao[7] = new Lotacao((long) 8, new Date(20190101), new Date(20991231),cargo[2],departamento[0],funcionario[7]);
        Lotacao[8] = new Lotacao((long) 9, new Date(20190101), new Date(20991231),cargo[2],departamento[0],funcionario[8]);
        Lotacao[9] = new Lotacao((long) 10, new Date(20190101), new Date(20991231),cargo[2],departamento[0],funcionario[9]);
        return Lotacao;
    }
}
