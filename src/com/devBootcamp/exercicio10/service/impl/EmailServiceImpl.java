package com.devBootcamp.exercicio10.service.impl;

import com.devBootcamp.exercicio10.model.Email;
import com.devBootcamp.exercicio10.service.EmailService;

public class EmailServiceImpl implements EmailService {
    @Override
    public void enviarEmail(Email email) {

        if(email.getDe() == null){
            throw new RuntimeException("Endereço de e-mail do remetente não informado!");
        }
        if(email.getPara() == null){
            throw new RuntimeException("Endereço de e-mail do destinatário não informado!");
        }

        System.out.println("De: " + email.getDe());
        System.out.println("Para: " + email.getPara());
        System.out.println("Assunto: " + email.getTitulo());
        System.out.println("Conteúdo: " + email.getConteudo());
    }
}
