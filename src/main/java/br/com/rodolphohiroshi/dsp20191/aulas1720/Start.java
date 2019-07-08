package br.com.rodolphohiroshi.dsp20191.aulas1720;


import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Cargo;
import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Departamento;
import br.com.rodolphohiroshi.dsp20191.aulas1316.model.Lotacao;
import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {
        Cargo cargo = new Cargo( 1 ,"Engenheiro de Software", 100.00);
        Departamento departamento = new Departamento(1, "Analista de BI");
        try {
            alteraSalario(cargo, departamento, 9999.99);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void limpaBD() throws Exception {
        deleteBD clearDatabase = new deleteBD();
        clearDatabase.limpaBD();
    }

    private static void alteraCargo(Cargo cargo) throws Exception {
        AtualizaCargo atualizaCargo = new AtualizaCargo();
        atualizaCargo.updateCargo(cargo);
    }

    private static void alteraSalario(Cargo cargo, Departamento departamento, double salario) throws Exception {
        Consultas consultas = new Consultas();
        AtualizaCargo atualizaCargo = new AtualizaCargo();
        ArrayList<Lotacao> lotacoes = consultas.consultaDados(cargo, departamento);

        for (Lotacao l : lotacoes) {
            atualizaCargo.updateSalarioFromId(cargo.getId(), salario);
            System.out.println("Funcionário \"" + l.getFuncionario().getNome() + "\" teve o salário alterado! " );
        }
    }

}