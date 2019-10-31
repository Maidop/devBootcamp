package com.devBootcamp.ModeloHereditario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private LocalDate dataAdminissao;

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdminissao() {
        return dataAdminissao;
    }

    public void setDataAdminissao(LocalDate dataAdminissao) {
        this.dataAdminissao = dataAdminissao;
    }

    public BigDecimal calculaSalario(){
        return salario;
    }
}
