/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.12).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Clientes;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-01-15T11:06:41.233Z")

@Api(value = "clientes", description = "the clientes API")
@RequestMapping(value = "/fabioivanov/client_api/1.0.0")
public interface ClientesApi {

    @ApiOperation(value = "Consulta todos os clientes", nickname = "consultarTodos", notes = "Esta operação tem por objetivo consultar todos os cliente cadastrados", response = Clientes.class, tags={ "Consulta", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Sucesso ao consultar todos os clientes", response = Clientes.class),
        @ApiResponse(code = 400, message = "Consulta inválida"),
        @ApiResponse(code = 401, message = "Consulta não autorizada"),
        @ApiResponse(code = 404, message = "Página não encontrada"),
        @ApiResponse(code = 500, message = "Erro interno ao tentar realizar a consulta") })
    @RequestMapping(value = "/clientes",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Clientes> consultarTodos();

}