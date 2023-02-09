package com.TiendaM_IQ2023.controller;

import com.TiendaM_IQ2023.dao.ClienteDao;
import com.TiendaM_IQ2023.domain.Cliente;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    @Autowired
    ClienteDao clienteDao;

    @GetMapping("/")

    public String inicio(Model model) {
//        log.info("Ahora desde MVC");
        //      model.addAttribute("Mensaje", "Hola desde el contorlador");
        //    
        //  Cliente cliente = new Cliente("Jonathan","Morales", "diego@gmail.com", "83206632");
        //model.addAttribute("objetoCliente" , cliente);

        // Cliente  cliente2 =new Cliente("Diego","Morales", "diego@gmail.com", "83206632");
        var clientes = clienteDao.findAll();
        model.addAttribute("clientes", clientes);
        return "index";
    }

}
