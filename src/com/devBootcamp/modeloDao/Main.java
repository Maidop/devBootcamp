package com.devBootcamp.modeloDao;

import com.devBootcamp.modeloDao.item.Item;
import com.devBootcamp.modeloDao.item.ItemJpaDaoImp;
import com.devBootcamp.modeloDao.item.ItemService;
import com.devBootcamp.modeloDao.item.ItemServiceImpl;
import com.devBootcamp.modeloDao.pessoa.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        PessoaService pessoaService = new PessoaJpaService();
//        Pessoa pessoa = new Pessoa();
//
//        pessoa.setCpf("465463185");
//        pessoa.setNome("asda");
//        pessoa = pessoaService.save(pessoa);
//        System.out.println("Pessoa Id: " + pessoa.getId());
//
//
//        Pessoa pessoa2 = new Pessoa();
//
//        pessoa2.setCpf("465463185");
//        pessoa2.setNome("asda");
//        pessoa2 = pessoaService.save(pessoa2);
//        System.out.println("Pessoa Id: " + pessoa2.getId());
//
//
//        Pessoa pessoa3 = new Pessoa();
//
//        pessoa3.setCpf("465463185");
//        pessoa3.setNome("asda");
//        pessoa3 = pessoaService.save(pessoa3);
//        System.out.println("Pessoa Id: " + pessoa3.getId());
//        System.out.println();System.out.println();
//
//        Pessoa pessoa4 = new Pessoa();
//
//        pessoa4.setCpf("465463185");
//        pessoa4.setNome("asda");
//        pessoa4 = pessoaService.save(pessoa4);
//        System.out.println("Pessoa Id: " + pessoa4.getId());
//        System.out.println();System.out.println();
//
//        pessoaService.delete(pessoa2.getId());
//
//        List<Pessoa> pessoaList = pessoaService.findAll();
//
//        for (Pessoa p : pessoaList) {
//            System.out.println("ID: " + p.getId());
//            System.out.println("Nome: " + p.getNome());
//            System.out.println("CPF: " + p.getCpf());
//            System.out.println();
//        }
//
//        Pessoa pessoaId = pessoaService.findById(pessoa4.getId());
//        System.out.println("Id: " + pessoaId.getId());
//        System.out.println("Nome: " + pessoaId.getNome());
//        System.out.println("CPF: " + pessoaId.getCpf());


        ItemService itemService = new ItemServiceImpl();
        Item item = new Item();
        item.setDescricao("Camisa Azul");
        item.setValorUnitario(BigDecimal.valueOf(39.90));
        item.setQuantidade(BigDecimal.valueOf(5));
        item = itemService.save(item);

        Item i2 = new Item();
        i2.setDescricao("Caneca");
        i2.setValorUnitario(BigDecimal.valueOf(39.90));
        i2.setQuantidade(BigDecimal.valueOf(5));
        i2 = itemService.save(i2);

        Item i3 = new Item();
        i3.setDescricao("Ventilador");
        i3.setValorUnitario(BigDecimal.valueOf(39.90));
        i3.setQuantidade(BigDecimal.valueOf(5));
        i3 = itemService.save(i3);

        Item i4 = new Item();
        i4.setDescricao("Assassino de aluguel");
        i4.setValorUnitario(BigDecimal.valueOf(39.90));
        i4.setQuantidade(BigDecimal.valueOf(5));
        i4 = itemService.save(i4);
        System.out.println();

        itemService.delete(i3.getId());

        List<Item> itemList = itemService.findAll();

        for (Item i : itemList) {
            System.out.println("ID: " + i.getId());
            System.out.println("Descrição: " + i.getDescricao());
            System.out.println("Valor Unitário: " + i.getValorUnitario());
            System.out.println("Quantidade: " + i.getQuantidade());
            System.out.println();
        }

        Item itemId = itemService.findById(i3.getId());
        System.out.println("ID: " + itemId.getId());
        System.out.println("Descrição: " + itemId.getDescricao());
        System.out.println("Valor Unitário: " + itemId.getValorUnitario());
        System.out.println("Quantidade: " + itemId.getQuantidade());

    }
}
