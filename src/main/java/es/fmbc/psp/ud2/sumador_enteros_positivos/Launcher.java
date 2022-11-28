/*********************************************************************************************************************************
 This class has been automatically generated using KLTT-APIRestGenerator project, don't do manual file modifications.
 Sun Nov 27 12:18:50 CET 2022

 "Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements;
  and to You under the Apache License, Version 2.0. "
**********************************************************************************************************************************/

package es.fmbc.psp.ud2.sumador_enteros_positivos ;

import org.springframework.boot.SpringApplication ;
import org.springframework.boot.autoconfigure.SpringBootApplication ;
import org.springframework.context.annotation.ComponentScan ;
import org.springframework.context.annotation.Configuration ;

import es.fmbc.psp.ud2.sumador_enteros_positivos.rest.RestHandlerSumador;

/**
 * This class starts the application
 */
@SpringBootApplication
@Configuration
//ComponentScan se encargara de buscar (Instanciar) todas aquellas clases que se indiquen bajo esta anotacion,
// se pueden buscar a nivel de clases como de paquetes
//@ComponentScan(basePackages = {es.fmbc},basePackageClasses ={RestHandlerSumador.class})
//Busca @RestController,@Controller,@Service
@ComponentScan(basePackageClasses = {RestHandlerSumador.class})
public class Launcher
{

	/**
	 * Main method
	 * @param args with the input arguments
	 */
    public static void main(String[] args)
    {
        SpringApplication.run(Launcher.class, args) ;
    }
}
